/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.UnsupportedEncodingException;
import supporter.JSONResponse;
import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.*;
import org.apache.http.client.HttpClient;
import org.json.simple.JSONObject;
import supporter.HttpSupporter;

/**
 *
 * @author MichaelScofield
 */
public class QuanLyNhanKhauController {
    private QuanLyNhanKhau model;
    private JTable view;
    
    public QuanLyNhanKhauController(QuanLyNhanKhau _model, JTable _view) {
        if (_model == null) {
            model = new QuanLyNhanKhau();
        }
        else model = _model;
        view = _view;
    }

    public void updateModel(HttpClient client, String url, String user) throws UnsupportedEncodingException {
//        List<Pair<String, String>> listParams = new ArrayList<Pair<String, String>>();
//        listParams.add(new Pair("username", user));

        JSONResponse JSResGetLishSu = HttpSupporter.sendGetRequest(client, url, null);
        if (!JSResGetLishSu.getSuccess().equals("true")) {
            JOptionPane.showMessageDialog(null, JSResGetLishSu.getMessage(), "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        model.clear();
        model.extractJSON((JSONObject)JSResGetLishSu.getJSValue());
    }
    
    public QuanLyNhanKhau getModel()
    {
        return model;
    }
    
    public ArrayList<Object[]> getDataModel()
    {
        int size = model.getSize();
        
        ArrayList<Object[]> resArr = new ArrayList<Object[]>(size);

        for (int i = 0; i < size; i++)
        {
            Object[] objs = new Object[4];
            
            objs[0] = (Object)new String(Integer.toString(i));
            objs[1] = (Object)model.getAt(i).getThongTinCaNhan().getHoTen();
            objs[2] = (Object)model.getAt(i).getThongTinCaNhan().getGioiTinh();
            objs[3] = (Object)model.getAt(i).getNgayNhapHo();
            
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
