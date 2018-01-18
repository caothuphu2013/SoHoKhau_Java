/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.json.simple.*;
import org.json.simple.parser.*;

/**
 *
 * @author MichaelScofield
 */
public class GhiChu {
    private String m_TieuDe;
    private String m_NoiDung;
    private String m_ThoiGian;
    // Owner
    
    public static final String JSValue_TieuDe = "";
    public static final String JSValue_NoiDung = "";
    public static final String JSValue_ThoiGian = "";
    
    public GhiChu()
    {
        
    }
    
    public GhiChu(JSONObject JSValue)
    {
        m_TieuDe = new String(JSValue.get(JSValue_TieuDe).toString());
        m_NoiDung = new String(JSValue.get(JSValue_NoiDung).toString());
        m_ThoiGian = new String(JSValue.get(JSValue_ThoiGian).toString());
    }
    
    public GhiChu(String _TieuDe, String _NoiDung, String _Date)
    {
        m_TieuDe = _TieuDe;
        m_NoiDung = _NoiDung;
        m_ThoiGian = _Date;
    }
    
    public String getTieuDe()
    {
        return m_TieuDe;
    }
    
    public String getNoiDung()
    {
        return m_NoiDung;
    }
    
    public String getThoiGian()
    {
        return m_ThoiGian;
    }
    
    public  void setTieuDe(String _TieuDe)
    {
        m_TieuDe = _TieuDe;
    }
    
    public  void setNoiDung(String _NoiDung)
    {
        m_NoiDung = _NoiDung;
    }
    
    public  void setThoiGian(String _Date)
    {
        m_ThoiGian = _Date;
    }
}
