/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supporter;

import java.io.*;
import java.net.URLEncoder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;
import javax.swing.JOptionPane;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author MichaelScofield
 */
public class HttpSupporter {

    public static final String fileHostIP = "ipconfig.txt";
    public static final String URLHost = getHostIP(fileHostIP);

    public static final String URLGetLishSuUngDung = getHostIP(fileHostIP) + "/api/getLichSuUngDung";
    public static final String URLGetGhiChu = getHostIP(fileHostIP) + "/api/getGhiChu";
    public static final String URLLogin = getHostIP(fileHostIP) + "/api/login";
    public static final String URLGetNhanKhau = getHostIP(fileHostIP) + "/api/getNhanKhau";
    public static final String URLGetThongBao = getHostIP(fileHostIP) + "/api/getThongBao";
    public static final String URLGetDSNguoiKiemDuyet = getHostIP(fileHostIP) + "/api/getNguoiKiemDuyet";
    public static final String URLDoiMatKhau = getHostIP(fileHostIP) + "/api/doiMatKhauNguoiDung";
    public static final String URLLogout = getHostIP(fileHostIP) + "/api/logout";  
    public static final String URLThemThongBao = getHostIP(fileHostIP) + "/api/themThongBao";
    public static final String URLThemYeuCau = getHostIP(fileHostIP) + "/api/themYeuCau";
    public static final String URLSuaNhanKhau = getHostIP(fileHostIP) + "/api/suaNhanKhau";
    public static final String URLGetYeuCau = getHostIP(fileHostIP) + "/api/getYeuCauHoTro";
    public static final String URLThemNhanKhau= getHostIP(fileHostIP) + "/api/themNhanKhau";
    public static final String URLGetDSCanKiemDuyet = getHostIP(fileHostIP) + "/api/getNhanKhauKiemDuyet";
    
    public static final String URLTuChoiKiemDuyet= getHostIP(fileHostIP) + "/api/tuChoiKiemDuyet";
    public static final String URLChapNhanKiemDuyet = getHostIP(fileHostIP) + "/api/chapNhanKiemDuyet";
    public static final String URLGetAllSHK = getHostIP(fileHostIP) + "/api/getAllSohokhau";
    public static JSONResponse sendGetRequest(HttpClient client, String url, List<Pair<String, String>> list) {
        if (client == null) {
            client = new DefaultHttpClient();
        }

        if (list != null) {
            url += "?";
            
            for (int i = 0; i < list.size(); i++) {
                try {
                    url += list.get(i).getKey() + "=";
                    
                    if (list.get(i).getValue() != null)
                        url += URLEncoder.encode(list.get(i).getValue(), "UTF-8");
                    
                    if (i != list.size() - 1) {
                        url += "&";
                    }
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(HttpSupporter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
           
        HttpGet request = new HttpGet(url);
        
        HttpResponse response = null;
        
        try {
            response = client.execute(request);

        } catch (IOException ex) {
            Logger.getLogger(HttpSupporter.class.getName()).log(Level.SEVERE, null, ex);
        }

        BufferedReader rd = null;
        try {
            rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
            
        } catch (IOException ex) {
            Logger.getLogger(HttpSupporter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedOperationException ex) {
            Logger.getLogger(HttpSupporter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        StringBuffer result = new StringBuffer();
        String line = "";
        try {
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            //request.set
        } catch (IOException ex) {
            Logger.getLogger(HttpSupporter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return new JSONResponse(result.toString());
    }
    
    public static String getHostIP(String fileName)
    {
        String hostIP = new String("120.0.0.1");
        
        try {
            Scanner in = new Scanner(new FileReader(fileName));
            hostIP = new String(in.nextLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HttpSupporter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return hostIP;
    }
}
