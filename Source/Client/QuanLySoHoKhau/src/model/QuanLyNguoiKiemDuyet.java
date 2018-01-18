/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.json.simple.*;
import org.json.simple.parser.*;

import java.util.*;
import static model.QuanLyLog.JSONValue_LichSuUngDung;

/**
 *
 * @author MichaelScofield
 */
public class QuanLyNguoiKiemDuyet {
    List<NguoiDung> m_DSNgKiemDuyet;

    public static final String JSValue_DSNgKiemDuyet = "DanhSachNguoiKiemDuyet";
    
    public QuanLyNguoiKiemDuyet()
    {
        m_DSNgKiemDuyet = new ArrayList<NguoiDung>();
    }
    
    public QuanLyNguoiKiemDuyet(JSONObject JSValue)
    {
        m_DSNgKiemDuyet = new ArrayList<NguoiDung>();
        
        extractJSON(JSValue);
    }
    
     public int getSize()
    {
        return m_DSNgKiemDuyet.size();
    }
     
    public void extractJSON(JSONObject JSValue) {
        
        if (m_DSNgKiemDuyet == null)
            m_DSNgKiemDuyet = new ArrayList<NguoiDung>();
        
        JSONArray dsGhiChu = (JSONArray)JSValue.get(JSValue_DSNgKiemDuyet);
        
        for (int i = 0; i < dsGhiChu.size(); i++)
        {
            m_DSNgKiemDuyet.add(new NguoiDung((JSONObject)dsGhiChu.get(i), "", ""));
        }
    }
    public NguoiDung getAt(int index)
    {
        return m_DSNgKiemDuyet.get(index);
    }
    
    public List<NguoiDung> getAll()
    {
        return m_DSNgKiemDuyet;
    }
    
    void addGhiChu(NguoiDung _NgKiemDuyet)
    {
        m_DSNgKiemDuyet.add(_NgKiemDuyet);
    }
    
    public NguoiDung removeAt(int index)
    {
        return m_DSNgKiemDuyet.remove(index);
    }
    
    public void clear()
    {
        m_DSNgKiemDuyet.clear();
    }
}
