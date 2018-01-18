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
public class Log {
    private String m_MoTa;
    private String m_ThoiGian;
    
    public static final String JSValue_ThoiGian = "thoiGian";
    public static final String JSValue_NoiDung = "noiDung";

    public Log()
    {
    
    }
    
    public Log(JSONObject JSValue)
    {
        m_MoTa = new String(JSValue.get(JSValue_NoiDung).toString());
        m_ThoiGian = new String(JSValue.get(JSValue_ThoiGian).toString());
    }
    
    public Log(String _MoTa, String _ThoiGian)
    {
        m_MoTa = _MoTa;
        m_ThoiGian = _ThoiGian;
    }
    
    public String getMota()
    {
        return m_MoTa;
    }
    
    public String getThoiGian()
    {
        return m_ThoiGian;
    }
    
    public void setMota(String _MoTa)
    {
        m_MoTa = _MoTa;
    }
    
    public void setThoiGian(String _ThoiGian)
    {
        m_ThoiGian = _ThoiGian;
    }
}
