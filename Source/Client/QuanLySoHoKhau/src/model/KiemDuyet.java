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
public class KiemDuyet {
    public ThongTinCaNhan m_TruocKhiThayDoi;
    public ThongTinCaNhan m_SauKhiThayDoi;
    public String m_IDSoHoKhau;
    public String m_TieuDe;
    
    public KiemDuyet()
    {
    
    }
    
    public KiemDuyet(JSONObject JSValue)
    {
        m_TruocKhiThayDoi = new ThongTinCaNhan((JSONObject)JSValue.get("ThongTinTruoc"));
        m_SauKhiThayDoi = new ThongTinCaNhan((JSONObject)JSValue.get("ThongTinSau"));
        
        m_TieuDe = new String(JSValue.get("TieuDe").toString());
        m_IDSoHoKhau = new String(JSValue.get("idSoHoKhau").toString());
    }
    
    public ThongTinCaNhan getTruocKhiThayDoi() {
        return m_TruocKhiThayDoi;
    }

    public ThongTinCaNhan getSauKhiThayDoi() {
        return m_SauKhiThayDoi;
    }

    public String getIDSoHoKhau() {
        return m_IDSoHoKhau;
    }
    
    public String getTieuDe()
    {
        return m_TieuDe;
    }
}
