/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.QuanLyThongBao;
import model.QuanLyYeuCau;
import org.apache.http.client.HttpClient;
import org.json.simple.JSONObject;
import supporter.HttpSupporter;
import supporter.JSONResponse;

/**
 *
 * @author MichaelScofield
 */
public class QuanLyYeuCauController {
    private QuanLyYeuCau model;
    private JTable view;

    public QuanLyYeuCauController(QuanLyYeuCau _model, JTable _view) {
        if (_model == null) {
            model = new QuanLyYeuCau();
        } else {
            model = _model;
        }
        view = _view;
    }

    public void updateModel(HttpClient client, String url, String user) {
//        List<Pair<String, String>> listParams = new ArrayList<Pair<String, String>>();
//        listParams.add(new Pair("username", user));

        JSONResponse JSResGetYeuCau = HttpSupporter.sendGetRequest(client, url, null);
        if (!JSResGetYeuCau.getSuccess().equals("true")) {
            JOptionPane.showMessageDialog(null, JSResGetYeuCau.getMessage(), "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        model.clear();
        model.extractJSON((JSONObject) JSResGetYeuCau.getJSValue());
    }

    public ArrayList<Object[]> getDataModel() {
        int size = model.getSize();

        ArrayList<Object[]> resArr = new ArrayList<Object[]>(size);

        for (int i = size - 1; i >= 0; i--) {
            Object[] objs = new Object[3];
            long milisec = Long.parseLong(model.getAt(i).getThoiGian());
            Date currentDate = new Date(milisec);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
            String str = sdf.format(currentDate);
            
            objs[0] = new String(str);
            objs[1] = model.getAt(i).getTieuDe();
            objs[2] = model.getAt(i).getTrangThai();
            resArr.add((objs));
        }

        return resArr;
    }

    public void updateView() {
        DefaultTableModel tableModel = (DefaultTableModel) view.getModel();
        //clear data
        tableModel.setRowCount(0);

        ArrayList<Object[]> listModel = getDataModel();

        for (int i = 0; i < listModel.size(); i++) {
            tableModel.addRow(listModel.get(i));
        }
    }
    
    public ArrayList<Object[]> getDataModelMod() {
        int size = model.getSize();

        ArrayList<Object[]> resArr = new ArrayList<Object[]>(size);

        for (int i = size - 1; i >= 0; i--) {
            Object[] objs = new Object[4];
            long milisec = Long.parseLong(model.getAt(i).getThoiGian());
            Date currentDate = new Date(milisec);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
            String str = sdf.format(currentDate);
            
            objs[0] = new String(str);
            objs[1] = model.getAt(i).getIDNguoiGui();
            objs[2] = model.getAt(i).getTieuDe();
            objs[3] = model.getAt(i).getNoiDung();
            
            resArr.add((objs));
        }

        return resArr;
    }

    public void updateViewMod() {
        DefaultTableModel tableModel = (DefaultTableModel) view.getModel();
        //clear data
        tableModel.setRowCount(0);

        ArrayList<Object[]> listModel = getDataModelMod();

        for (int i = 0; i < listModel.size(); i++) {
            tableModel.addRow(listModel.get(i));
        }
    }
    
    public QuanLyYeuCau getModel()
    {
        return model;
    }
}
