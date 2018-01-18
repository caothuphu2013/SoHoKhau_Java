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
public class ThongTinSoHoKhau {
    private ThongTinCaNhan m_TTChuHo;
    private String m_IDSoHoKhau;
    private String m_NgayLapSo;
    private String m_NoiCap;
    private String m_DiaChi;
    //private ThongTinCaNhan m_NguoiLapSo;
    
    public static final String JSValue_IDSoHoKhau = "idsoHoKhau";
    public static final String JSValue_NgayLapSo = "ngayLapSo";
    public static final String JSValue_NoiCap = "noiCap";
    public static final String JSValue_DiaChi = "diaChi";
    public static final String JSValue_ChuHo = "ThongTinCaNhan";
    
    public ThongTinSoHoKhau()
    {
    
    }
    
    public ThongTinSoHoKhau(JSONObject JSValue)
    {
        m_IDSoHoKhau = new String(JSValue.get(JSValue_IDSoHoKhau).toString());
        m_NgayLapSo = new String(JSValue.get(JSValue_NgayLapSo).toString());
        m_NoiCap = new String(JSValue.get(JSValue_NoiCap).toString());
        m_DiaChi = new String(JSValue.get(JSValue_DiaChi).toString());
        
        m_TTChuHo = new ThongTinCaNhan((JSONObject)JSValue.get(JSValue_ChuHo));
    }
   
    public ThongTinSoHoKhau(ThongTinCaNhan _TTChuHo, String _IDSoHoKhau, String _NgLapSo, String _NoiCap)
    {
        m_TTChuHo = _TTChuHo;
        m_IDSoHoKhau = _IDSoHoKhau;
        m_NgayLapSo = _NgLapSo;
    }
    public String getDiaChi()
    {
        return m_DiaChi;
    }
    
    public ThongTinCaNhan getThongTinChuHo()
    {
        return m_TTChuHo;
    }
    
    public String getNgayLapSo()
    {
        return m_NgayLapSo;
    }
    
    public String getIDSoHoKhau()
    {
        return m_IDSoHoKhau;
    }
    
    public void setThongTinChuHo(ThongTinCaNhan _TTChuHo)
    {
        m_TTChuHo = _TTChuHo;
    }
    
    public void setNgayLapSo(String _NgLapSo)
    {
        m_NgayLapSo = _NgLapSo;
    }
    
    public void setNoiCap(String _NoiCap)
    {
        m_NoiCap = _NoiCap;
    }
}
