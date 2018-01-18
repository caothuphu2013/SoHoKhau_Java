/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import static model.QuanLyThongBao.JSValue_DSThongBao;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author MichaelScofield
 */
public class QuanLyYeuCau {
    List<YeuCau> m_DSYeuCau;
    
    public QuanLyYeuCau()
    {
        m_DSYeuCau = new ArrayList<YeuCau>();
    }
 
    public int getSize()
    {
        return m_DSYeuCau.size();
    }
    
     public void extractJSON(JSONObject JSValue)
    {
        if (m_DSYeuCau == null)
                m_DSYeuCau = new ArrayList<YeuCau>();
        
       JSONArray dsYeuCau = (JSONArray)JSValue.get("DanhSachYeuCau");
       
       for (int i = 0; i < dsYeuCau.size(); i++)
       {
           m_DSYeuCau.add(new YeuCau((JSONObject)dsYeuCau.get(i)));
       }
    }
     
     public YeuCau getAt(int index)
    {
        return m_DSYeuCau.get(index);
    }
    
    public List<YeuCau> getAll()
    {
        return m_DSYeuCau;
    }
    
    void add(YeuCau _YeuCau)
    {
        m_DSYeuCau.add(_YeuCau);
    }
    
    public YeuCau removeAt(int index)
    {
        return m_DSYeuCau.remove(index);
    }
    
    public void clear()
    {
        m_DSYeuCau.clear();
    }
}
