/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.util.*;
/**
 *
 * @author MichaelScofield
 */
public class QuanLyNhanKhau {
    List<NhanKhau> m_DSNhanKHau;
    
    public static final String JSValue_DSNhanKhau = "DanhSachNhanKhau";
    
    public QuanLyNhanKhau()
    {
        m_DSNhanKHau = new ArrayList<NhanKhau>();
    }
    
    public QuanLyNhanKhau(JSONObject JSValue)
    {
       m_DSNhanKHau = new ArrayList<NhanKhau>();
       
       extractJSON(JSValue);
    }
    
    public void extractJSON(JSONObject JSValue)
    {
        if (m_DSNhanKHau == null)
            m_DSNhanKHau = new ArrayList<NhanKhau>();
        
       JSONArray dsNhanKhau = (JSONArray)JSValue.get(JSValue_DSNhanKhau);
       
       for (int i = 0; i < dsNhanKhau.size(); i++)
       {
           m_DSNhanKHau.add(new NhanKhau((JSONObject)dsNhanKhau.get(i)));
       }
    }
    
    public void clear()
    {
        m_DSNhanKHau.clear();
    }
    
    public int getSize()
    {
        return m_DSNhanKHau.size();
    }
    public NhanKhau getAt(int index)
    {
        return m_DSNhanKHau.get(index);
    }
    
    void addNhanKhau(NhanKhau _NhanKhau)
    {
        m_DSNhanKHau.add(_NhanKhau);
    }
    
    NhanKhau removeAt(int index)
    {
        return m_DSNhanKHau.remove(index);
    }
}
