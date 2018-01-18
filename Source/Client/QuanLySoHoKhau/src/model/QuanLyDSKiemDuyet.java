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
public class QuanLyDSKiemDuyet {
    List<KiemDuyet> m_DSKiemDuyet;
    
    public QuanLyDSKiemDuyet()
    {
        m_DSKiemDuyet = new ArrayList<KiemDuyet>();
    }
 
    public int getSize()
    {
        return m_DSKiemDuyet.size();
    }
    
     public void extractJSON(JSONObject JSValue)
    {
        if (m_DSKiemDuyet == null)
                m_DSKiemDuyet = new ArrayList<KiemDuyet>();
        
       JSONArray dsYeuCau = (JSONArray)JSValue.get("DanhSachKiemDuyet");
       
       for (int i = 0; i < dsYeuCau.size(); i++)
       {
           m_DSKiemDuyet.add(new KiemDuyet((JSONObject)dsYeuCau.get(i)));
       }
    }
     
     public KiemDuyet getAt(int index)
    {
        return m_DSKiemDuyet.get(index);
    }
    
    public List<KiemDuyet> getAll()
    {
        return m_DSKiemDuyet;
    }
    
    void add(KiemDuyet _KiemDuyet)
    {
        m_DSKiemDuyet.add(_KiemDuyet);
    }
    
    public KiemDuyet removeAt(int index)
    {
        return m_DSKiemDuyet.remove(index);
    }
    
    public void clear()
    {
        m_DSKiemDuyet.clear();
    }
}
