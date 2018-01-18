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
public class QuanLyGhiChu {
    List<GhiChu> m_DSGhiChu;

    public static final String JSValue_DSGhiChu = "DanhSachGhiChu";
    
    QuanLyGhiChu()
    {
        m_DSGhiChu = new ArrayList<GhiChu>();
    }
    
    QuanLyGhiChu(JSONObject JSValue)
    {
        JSONArray dsGhiChu = (JSONArray)JSValue.get(JSValue_DSGhiChu);
        
        m_DSGhiChu = new ArrayList<GhiChu>();
        
        for (int i = 0; i < dsGhiChu.size(); i++)
        {
            m_DSGhiChu.add(new GhiChu((JSONObject)dsGhiChu.get(i)));
        }
    }
    
    public GhiChu getAt(int index)
    {
        return m_DSGhiChu.get(index);
    }
    
    public List<GhiChu> getAll()
    {
        return m_DSGhiChu;
    }
    
    void addGhiChu(GhiChu _GhiChu)
    {
        m_DSGhiChu.add(_GhiChu);
    }
    
    public GhiChu removeAt(int index)
    {
        return m_DSGhiChu.remove(index);
    }
    
    public void clear()
    {
        m_DSGhiChu.clear();
    }
    //get data model ???
    
}
