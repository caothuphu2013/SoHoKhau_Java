/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supporter;

import org.json.simple.*;
import org.json.simple.parser.*;

/**
 *
 * @author MichaelScofield
 */
public class JSONResponse {
    private JSONObject JSStatus;
    private JSONObject JSValue;
   
    public static final String JSValue_Status = "status";
    public static final String JSValue_Value = "value";
    public static final String JSValue_Message = "message";
    public static final String JSValue_Success = "success";
    
    public JSONResponse(String strResponse)
    {
        try
        {
            JSONParser jsonParser = new JSONParser();
            JSONObject JSResponse = (JSONObject) jsonParser.parse(strResponse);
            
            JSStatus = (JSONObject)JSResponse.get(JSValue_Status);
            JSValue = (JSONObject)JSResponse.get(JSValue_Value);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public String getSuccess()
    {
        if (JSStatus == null) return "";
        
        return new String(JSStatus.get(JSValue_Success).toString());
    }
    
    public String getMessage()
    {
        if (JSStatus == null) return "";
        
        return new String(JSStatus.get(JSValue_Message).toString());
    }
    
    public JSONObject getJSValue()
    {
        return JSValue;
    }
    
    public String getStringValue()
    {
        return JSValue.toString();
    }
    
    public JSONObject getJSStatus()
    {
        return JSStatus;
    }
    
    public String getStringStatus()
    {
        return JSStatus.toString();
    }
    
}
