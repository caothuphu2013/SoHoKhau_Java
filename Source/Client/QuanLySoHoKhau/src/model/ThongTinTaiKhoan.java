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
public class ThongTinTaiKhoan {
    
    private String m_MatKhau;
    private String m_TaiKhoan;

    private String m_Email;
    private String m_SDT;
    
    public static final String JSONValue_Emai = "email";
    public static final String JSONValue_SDT = "phone";

    public ThongTinTaiKhoan()
    {
    
    }
    
    public ThongTinTaiKhoan(String _TaiKhoan, String _MatKhau)
    {
        m_TaiKhoan = _TaiKhoan;
        m_MatKhau = _MatKhau;
    }
    
    public ThongTinTaiKhoan(JSONObject jsValue, String _TaiKhoan, String _MatKhau)
    {
        m_TaiKhoan = _TaiKhoan;
        m_MatKhau = _MatKhau;
        
        ExtractJSON(jsValue);
    }
    
    public void ExtractJSON(JSONObject jsValue)
    {
        m_Email = new String(jsValue.get(JSONValue_Emai).toString());
        m_SDT = new String(jsValue.get(JSONValue_SDT).toString());
    }
    
    public ThongTinTaiKhoan(String _mk, String _Email, String _Sdt)
    {
        m_MatKhau = _mk;
        m_Email = _Email;
        m_SDT = _Sdt;
    }
    
    public String getTaiKhoan()
    {
        return m_TaiKhoan;
    }
    
    public String getMatKhau()
    {
        return m_MatKhau;
    }
    
    public String getEmail()
    {
        return m_Email;
    }
    
    public String getSDT()
    {
        return m_SDT;
    }
    
    public void setMatKhau(String _MK)
    {
        m_MatKhau = _MK;
    }
    
    public void setEmail(String _Email)
    {
        m_Email = _Email;
    }
    
    public void setSDT(String _SDT)
    {
        m_SDT = _SDT;
    }
    
    public void setTaiKhoan(String _tk)
    {
        m_TaiKhoan = _tk;
    }
}
