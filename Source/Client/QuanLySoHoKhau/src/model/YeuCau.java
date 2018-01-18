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
public class YeuCau {
    
    public String m_TieuDe;
    public String m_NoiDung;
    public String m_ThoiGian;
    public String m_TrangThai;
    public String m_TraLoi;
    
    public String m_Stt;
    public String m_IDNguoiGui;
    
    public YeuCau(JSONObject JSValue)
    {
      m_TieuDe = new String(JSValue.get("tieuDe").toString());
      m_NoiDung = new String(JSValue.get("noiDung").toString());
      m_ThoiGian = new String(JSValue.get("thoiGian").toString());
      
      Object value = JSValue.get("traLoi");
      
      
      if (value != null)
      {
        m_TraLoi = new String((String)value);
      }
      else m_TraLoi = new String();
      
     
      JSONObject tthai = (JSONObject)JSValue.get("TrangThai");
      m_TrangThai = new String(tthai.get("TenTrangThai").toString());
      
      JSONObject JSPK = (JSONObject)JSValue.get("yeuCauPK");
      
      m_Stt = JSPK.get("stt").toString();
      m_IDNguoiGui = JSPK.get("idnguoiYeuCau").toString();
    
    }
    
    public String getStt()
    {
        return m_Stt;
    }
    
    public String getIDNguoiGui()
    {
        return m_IDNguoiGui;
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
    
    public String getTrangThai()
    {
        return m_TrangThai;
    }
    
    public String getTraLoi()
    {
        return m_TraLoi;
    }
}
