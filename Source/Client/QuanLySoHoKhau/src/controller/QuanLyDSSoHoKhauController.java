/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.QuanLyDSKiemDuyet;
import model.QuanLyDSSoHoKhau;
import org.apache.http.client.HttpClient;
import org.json.simple.JSONObject;
import supporter.HttpSupporter;
import supporter.JSONResponse;

/**
 *
 * @author MichaelScofield
 */
public class QuanLyDSSoHoKhauController {
    private QuanLyDSSoHoKhau model;
    private JTable view;

    public QuanLyDSSoHoKhauController(QuanLyDSSoHoKhau _model, JTable _view) {
        if (_model == null) {
            model = new QuanLyDSSoHoKhau();
        } else {
            model = _model;
        }
        view = _view;
    }

    public void updateModel(HttpClient client, String url, String user) {
//        List<Pair<String, String>> listParams = new ArrayList<Pair<String, String>>();
//        listParams.add(new Pair("username", user));

        JSONResponse JSResDsKiemDuyet =  HttpSupporter.sendGetRequest(client, url, null);
        if (!JSResDsKiemDuyet.getSuccess().equals("true")) {
            JOptionPane.showMessageDialog(null, JSResDsKiemDuyet.getMessage(), "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        model.clear();
        model.extractJSON((JSONObject) JSResDsKiemDuyet.getJSValue());
    }

    public ArrayList<Object[]> getDataModel() {
        int size = model.getSize();

        ArrayList<Object[]> resArr = new ArrayList<Object[]>(size);

        for (int i = size - 1; i >= 0; i--) {
            Object[] objs = new Object[4];
            objs[0] = model.getAt(i).getThongTinSoHoKhau().getIDSoHoKhau();
            objs[1] = model.getAt(i).getThongTinSoHoKhau().getThongTinChuHo().getHoTen();
            objs[2] = model.getAt(i).getThongTinSoHoKhau().getNgayLapSo();
            objs[3] = model.getAt(i).getThongTinSoHoKhau().getDiaChi();
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

    public QuanLyDSSoHoKhau getModel() {
        return model;
    }
}
