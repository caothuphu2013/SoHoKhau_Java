/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import supporter.JSONResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class QuanLyThongBaoController {

    private QuanLyThongBao model;
    private JTable view;

    public QuanLyThongBaoController(QuanLyThongBao _model, JTable _view) {
        if (_model == null) {
            model = new QuanLyThongBao();
        } else {
            model = _model;
        }
        view = _view;
    }

    public void updateModel(HttpClient client, String url, String user) {
//        List<Pair<String, String>> listParams = new ArrayList<Pair<String, String>>();
//        listParams.add(new Pair("username", user));

        JSONResponse JSResGetLishSu = HttpSupporter.sendGetRequest(client, url, null);
        if (!JSResGetLishSu.getSuccess().equals("true")) {
            JOptionPane.showMessageDialog(null, JSResGetLishSu.getMessage(), "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        model.clear();
        JSONObject test = (JSONObject) JSResGetLishSu.getJSValue();
        model.extractJSON((JSONObject) JSResGetLishSu.getJSValue());
    }

    public ArrayList<Object[]> getDataModel() {
        int size = model.getSize();

        ArrayList<Object[]> resArr = new ArrayList<Object[]>(size);

        for (int i = 0; i < size; i++) {
            Object[] objs = new Object[2];
            long milisec = Long.parseLong(model.getAt(i).getThoiGian());
            Date currentDate = new Date(milisec);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
            String str = sdf.format(currentDate);
            
            objs[0] = new String(str);
            objs[1] = model.getAt(i).getNoiDung();

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
}
