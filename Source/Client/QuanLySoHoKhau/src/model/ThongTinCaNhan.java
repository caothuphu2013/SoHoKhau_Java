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
public class ThongTinCaNhan {
    
    private String m_CMND;
    private String m_HoTen;
    private String m_QueQuan;
    private String m_DanToc;
    private String m_TonGiao;
    private String m_GioiTinh;
    private String m_NgaySinh;
    
    public static final String JSValue_CMND = "cmnd";
    public static final String JSValue_HoTen = "hoTen";
    public static final String JSValue_QueQuan = "queQuan";
    public static final String JSValue_DanToc = "danToc";
    public static final String JSValue_TonGiao = "tonGiao";
    public static final String JSValue_GioiTinh = "gioiTinh";
    public static final String JSValue_NgaySinh = "ngaySinh";
    
    public ThongTinCaNhan()
    {
    
    }
    
    public ThongTinCaNhan(JSONObject JSValue)
    {
        m_CMND = new String(JSValue.get(JSValue_CMND).toString());
        m_HoTen = new String(JSValue.get(JSValue_HoTen).toString());
        m_QueQuan = new String(JSValue.get(JSValue_QueQuan).toString());
        m_DanToc = new String(JSValue.get(JSValue_DanToc).toString());
        m_TonGiao = new String(JSValue.get(JSValue_TonGiao).toString());
        m_GioiTinh = new String(JSValue.get(JSValue_GioiTinh).toString());
        m_NgaySinh = new String(JSValue.get(JSValue_NgaySinh).toString());
    }
    
    public ThongTinCaNhan(String _CMND, String _HoTen, String _DanToc, String _TonGiao, String _GioiTinh)
    {
        m_CMND = _CMND;
        m_HoTen = _HoTen;
        m_DanToc = _DanToc;
        m_TonGiao = _TonGiao;
        m_GioiTinh = _GioiTinh; 
    }
    
    @Override
    public String toString()
    {
        String strRes = new String();
        
        strRes += "CMND: " + m_CMND + "\n";
        strRes += "Ho tên: " + m_HoTen + "\n";
        strRes += "Quê quán: " + m_QueQuan + "\n";
        strRes += "Dân tộc: " + m_DanToc + "\n";
        strRes += "Tôn giáo: " + m_TonGiao + "\n";
        strRes += "Giới tính: " + m_GioiTinh + "\n";
        strRes += "Ngày sinh: " + m_NgaySinh + "\n";
        
        return strRes;
    }
    
    public String getNgaySinh()
    {
        return m_NgaySinh;
    } 
    
    public String getQueQuan()
    {
        return m_QueQuan;
    }
    
    public String getCMND()
    {
        return m_CMND;
    }
    
    public String getHoTen()
    {
        return m_HoTen;
    }
    
    public String getTonGiao()
    {
        return m_TonGiao;
    }
    
    public String getGioiTinh()
    {
        return m_GioiTinh;
    }
    
    public String getDanToc()
    {
        return m_DanToc;
    }
    
    public void setCMND(String _CMND)
    {
        m_CMND = _CMND; 
    }
    
    public void setHoTen(String _HoTen)
    {
        m_HoTen = _HoTen; 
    }
    
    public void setTonGiao(String _TonGiao)
    {
        m_TonGiao = _TonGiao; 
    }
    
    public void setGioiTinh(String _GioiTinh)
    {
        m_GioiTinh = _GioiTinh; 
    }
    
    public void set(String _DanToc)
    {
        m_DanToc = _DanToc;
    }
}
