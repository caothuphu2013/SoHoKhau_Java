/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author MichaelScofield
 */
public class QuanLyDSSoHoKhau {
    List<SoHoKhau> m_DSSoHoKhau;

    public static final String JSValue_DSSoHoKhau = "DanhSachSoHoKhau";
    
    public QuanLyDSSoHoKhau()
    {
        m_DSSoHoKhau = new ArrayList<SoHoKhau>();
    }
    
    public QuanLyDSSoHoKhau(JSONObject JSValue)
    {
        m_DSSoHoKhau = new ArrayList<SoHoKhau>();
        
        extractJSON(JSValue);
    }
    
     public int getSize()
    {
        return m_DSSoHoKhau.size();
    }
     
    public void extractJSON(JSONObject JSValue) {
        
        if (m_DSSoHoKhau == null)
            m_DSSoHoKhau = new ArrayList<SoHoKhau>();
        
        JSONArray dsSoHoKhau = (JSONArray)JSValue.get(JSValue_DSSoHoKhau);
        
        for (int i = 0; i < dsSoHoKhau.size(); i++)
        {
            m_DSSoHoKhau.add(new SoHoKhau((JSONObject)dsSoHoKhau.get(i)));
        }
    }
    public SoHoKhau getAt(int index)
    {
        return m_DSSoHoKhau.get(index);
    }
    
    public List<SoHoKhau> getAll()
    {
        return m_DSSoHoKhau;
    }
    
    void addGhiChu(SoHoKhau _dsSoHoKhau)
    {
        m_DSSoHoKhau.add(_dsSoHoKhau);
    }
    
    public SoHoKhau removeAt(int index)
    {
        return m_DSSoHoKhau.remove(index);
    }
    
    public void clear()
    {
        m_DSSoHoKhau.clear();
    }
}
