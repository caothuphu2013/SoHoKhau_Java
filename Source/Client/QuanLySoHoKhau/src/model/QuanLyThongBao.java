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
public class QuanLyThongBao {
    List<ThongBao> m_DSThongBao;
    
    public static String JSValue_DSThongBao = "DanhSachThongBao";
    
    public QuanLyThongBao()
    {
        m_DSThongBao = new ArrayList<ThongBao>();
    }
    
    public QuanLyThongBao(JSONObject JSValue)
    {
        m_DSThongBao = new ArrayList<ThongBao>();
        
        extractJSON(JSValue);
    }
    
    public int getSize()
    {
        return m_DSThongBao.size();
    }
    
    public void extractJSON(JSONObject JSValue)
    {
        if (m_DSThongBao == null)
                m_DSThongBao = new ArrayList<ThongBao>();
        
       JSONArray dsThongBao = (JSONArray)JSValue.get(JSValue_DSThongBao);
       
       for (int i = 0; i < dsThongBao.size(); i++)
       {
           m_DSThongBao.add(new ThongBao((JSONObject)dsThongBao.get(i)));
       }
    }
    
    public ThongBao getAt(int index)
    {
        return m_DSThongBao.get(index);
    }
    
    public List<ThongBao> getAll()
    {
        return m_DSThongBao;
    }
    
    void addGhiChu(ThongBao _ThongBao)
    {
        m_DSThongBao.add(_ThongBao);
    }
    
    public ThongBao removeAt(int index)
    {
        return m_DSThongBao.remove(index);
    }
    
    public void clear()
    {
        m_DSThongBao.clear();
    }
}
