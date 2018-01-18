/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import supporter.JSONResponse;
import model.QuanLyNguoiKiemDuyet;
import model.QuanLyNhanKhau;
import org.apache.http.client.HttpClient;
import org.json.simple.JSONObject;
import supporter.HttpSupporter;

/**
 *
 * @author MichaelScofield
 */
public class QuanLyNguoiKiemDuyetController {
    private QuanLyNguoiKiemDuyet model;
    private JTable view;
    
    public QuanLyNguoiKiemDuyetController(QuanLyNguoiKiemDuyet _model, JTable _view) {
        if (_model == null) {
            model = new QuanLyNguoiKiemDuyet();
        }
        else model = _model;
        view = _view;
    }

    public void updateModel(HttpClient client, String url, String user) throws UnsupportedEncodingException {
//        List<Pair<String, String>> listParams = new ArrayList<Pair<String, String>>();
//        listParams.add(new Pair("username", user));

        JSONResponse JSResGetDSKiemDuyet = HttpSupporter.sendGetRequest(client, url, null);
        if (!JSResGetDSKiemDuyet.getSuccess().equals("true")) {
            JOptionPane.showMessageDialog(null, JSResGetDSKiemDuyet.getMessage(), "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        model.clear();
        model.extractJSON((JSONObject)JSResGetDSKiemDuyet.getJSValue());
    }
    
    public QuanLyNguoiKiemDuyet getModel()
    {
        return model;
    }
    
    public ArrayList<Object[]> getDataModel()
    {
        int size = model.getSize();
        
        ArrayList<Object[]> resArr = new ArrayList<Object[]>(size);

        for (int i = 0; i < size; i++)
        {
            Object[] objs = new Object[2];
            objs[0] = (Object) new String(model.getAt(i).getThongTinCaNhan().getCMND());
            objs[1] = (Object) new String(model.getAt(i).getThongTinCaNhan().getHoTen());
            resArr.add((objs));
        }
        
        return resArr;
    }
    
    
    public void updateView() {
        DefaultTableModel tableModel = (DefaultTableModel) view.getModel();
        //clear data
        tableModel.setRowCount(0);
        
        ArrayList<Object[]> listModel = getDataModel();
        
        for (int i = 0; i < listModel.size(); i++)
        {
            tableModel.addRow(listModel.get(i));
        }
    }
}
