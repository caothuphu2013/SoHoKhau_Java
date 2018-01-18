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
public class SoHoKhau {
    QuanLyNhanKhau m_QlyNhanKhau;
    QuanLyGhiChu m_QlyGhiChu;
    ThongTinSoHoKhau m_TTSoHoKhau;
    //owner
    
    public static final String JSValue_QlyNhanKhau = "DanhSachNhanKhau";
    public static final String JSValue_QlyGhiChu = "idquanLyGhiChu";
    public static final String JSValue_TTSoHoKhau = "ThongTinCaNhan";
    
    public SoHoKhau()
    {
        //do something ????
    }
    
    public SoHoKhau(JSONObject JSValue)
    {
        if (JSValue == null) return;
        //m_QlyGhiChu = new QuanLyGhiChu((JSONObject)JSValue.get(JSValue_QlyGhiChu));
        JSONObject JSDsNhanKhau = (JSONObject)JSValue.get(JSValue_QlyNhanKhau);
        if (JSDsNhanKhau != null)
            m_QlyNhanKhau = new QuanLyNhanKhau(JSDsNhanKhau);
        

        if (JSValue != null)
            m_TTSoHoKhau = new ThongTinSoHoKhau(JSValue);
    }
    
    public ThongTinSoHoKhau getThongTinSoHoKhau()
    {
        return m_TTSoHoKhau;
    }
}
