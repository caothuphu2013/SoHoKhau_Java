/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import org.json.simple.*;
import org.json.simple.parser.*;
/**
 *
 * @author MichaelScofield
 */
public class NguoiDung {
    ThongTinTaiKhoan m_TTTaiKhoan;
    ThongTinCaNhan m_TTCaNhan;
    LoaiNguoiDung m_LoaiNguoiDung;
    QuanLyLog m_QLyLog;
    
    public static final String JSONValue_LoaiTaiKhoan = "LoaiTaiKhoan";
    public static final String JSONValue_ThongTinCaNhan = "ThongTinCaNhan";
    
    //public static final String
    
    public NguoiDung()
    {
        
    }
    
    public NguoiDung(JSONObject JSValue, String _TaiKhoan, String _MatKhau)
    {
        //Parse loại tài khoản
        JSONObject JSLoaiTaiKhoan = (JSONObject) JSValue.get(JSONValue_LoaiTaiKhoan);
        int loaiND = Integer.parseInt(JSLoaiTaiKhoan.get(JSONValue_LoaiTaiKhoan).toString());
        m_LoaiNguoiDung = LoaiNguoiDung.values()[loaiND];
        
        m_TTCaNhan = new ThongTinCaNhan((JSONObject)JSValue.get(JSONValue_ThongTinCaNhan));
        
        //Parse thông tin tài khoản
        m_TTTaiKhoan = new ThongTinTaiKhoan(JSValue, _TaiKhoan, _MatKhau);
        
       // m_QLyLog = new QuanLyLog();
    }
    
   
    public ThongTinTaiKhoan getThongTinTaiKhoan()
    {
        return m_TTTaiKhoan;
    }
    
    public ThongTinCaNhan getThongTinCaNhan()
    {
        return m_TTCaNhan;
    }
    
    public LoaiNguoiDung getLoaiNguoiDung()
    {
        return m_LoaiNguoiDung;
    }
}
