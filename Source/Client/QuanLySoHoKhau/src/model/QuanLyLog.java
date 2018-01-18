/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

import org.json.simple.*;
import org.json.simple.parser.*;

/**
 *
 * @author MichaelScofield
 */
public class QuanLyLog {

    private List<Log> m_DSLog;

    public static final String JSONValue_LichSuUngDung = "DanhSachLichSu";

    public QuanLyLog() {
        m_DSLog = new ArrayList<Log>();
    }
    
    public QuanLyLog(JSONObject JSValue) {
        m_DSLog = new ArrayList<Log>();
        
        extractJSON(JSValue);
    }
    
    public int getSize() {
        return m_DSLog.size();
    }

    public void extractJSON(JSONObject JSValue) {
        
        if (m_DSLog == null)
            m_DSLog = new ArrayList<Log>();
        
        JSONArray JSDSLog = (JSONArray) JSValue.get(JSONValue_LichSuUngDung);

        for (int i = 0; i < JSDSLog.size(); i++) {
            Log log = new Log((JSONObject) JSDSLog.get(i));
            m_DSLog.add(log);
        }
    }


    public Log getAt(int index) {
        return m_DSLog.get(index);
    }

    public void clear()
    {
        m_DSLog.clear();
        
    }
    
    
    public List<Log> getAll() {
        return m_DSLog;
    }

    public Log removeAt(int index) {
        return m_DSLog.remove(index);
    }

    public void addLog(Log _Log) {
        m_DSLog.add(_Log);
    }
}
