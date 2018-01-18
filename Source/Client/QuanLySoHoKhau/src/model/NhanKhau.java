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
public class NhanKhau {
    private ThongTinCaNhan m_TTNhanKhau;
    //m_QLyGhiChu
    //owser
    private String m_NgayNhapHo;
    private String m_QHVoiChuHo;
    
    public static final String JSValue_NgayNhapHo = "ngayNhapSoHoKhau";
    public static final String JSValue_QuanHevoiChuHo = "quanHeVoiChuHo";
    public static final String JSValue_ThongTinCaNhan = "ThongTinCaNhan";
    
    public NhanKhau()
    {
    
    }
    
    public NhanKhau(JSONObject JSValue)
    {
        m_NgayNhapHo = new String(JSValue.get(JSValue_NgayNhapHo).toString());
        m_QHVoiChuHo = new String(JSValue.get(JSValue_QuanHevoiChuHo).toString());
        
        m_TTNhanKhau = new ThongTinCaNhan((JSONObject)JSValue.get(JSValue_ThongTinCaNhan));
    }
    
    public NhanKhau(ThongTinCaNhan _TTNhanKhau, String _NgayNhapHo, String _QHVoiChuHo)
    {
        m_TTNhanKhau = _TTNhanKhau;
        m_NgayNhapHo = _NgayNhapHo;
        m_QHVoiChuHo = _QHVoiChuHo;
    }
    
    public ThongTinCaNhan getThongTinCaNhan()
    {
        return m_TTNhanKhau;
    }
    
    public String getNgayNhapHo()
    {
        return m_NgayNhapHo;
    }
    
    public String getQuanHe()
    {
        return m_QHVoiChuHo;
    }
    
    public void setThongTinCaNhan(ThongTinCaNhan _TTNhanKhau)
    {
        m_TTNhanKhau = _TTNhanKhau;
    }
    
    public void setNgayNhapHo(String _NgayNhapHo)
    {
        m_NgayNhapHo = _NgayNhapHo;
    }
    
    public void setQuanHe(String _QHVoiChuHo)
    {
        m_QHVoiChuHo = _QHVoiChuHo;
    }
}
