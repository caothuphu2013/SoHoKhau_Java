/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.json.simple.JSONObject;

/**
 *
 * @author MichaelScofield
 */
public class ThongBao {
    private String m_ThoiGian;
    private String m_NoiDung;
    
    public static String JSValue_ThoiGian = "thoiGian";
    public static String JSValue_NoiDung = "noiDung";
    
    public ThongBao()
    {
    
    }
    
    public ThongBao(String _ThoiGian, String _NoiDung)
    {
        m_ThoiGian = _ThoiGian;
        m_NoiDung = _NoiDung;
    }
    
    public ThongBao(JSONObject JSValue)
    {
        m_ThoiGian = new String(JSValue.get(JSValue_ThoiGian).toString());
        m_NoiDung = new String(JSValue.get(JSValue_NoiDung).toString());
    }
    
    public String getThoiGian()
    {
        return m_ThoiGian;
    }
    
    public String getNoiDung()
    {
        return m_NoiDung;
    }
    
    public void setThoiGian(String _ThoiGian)
    {
        m_ThoiGian = _ThoiGian;
    }
    
    public void setNoiDung(String _NoiDung)
    {
        m_NoiDung = _NoiDung;
    }
}
