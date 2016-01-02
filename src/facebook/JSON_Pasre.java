/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author Omar Ali
 */
public class JSON_Pasre{   
     

    public Map<String,String>ParsURL(String url) throws MalformedURLException, IOException
    {
        Map<String,String> ID_Name = new HashMap<String,String>(); 
        while(true)
        {
            try (InputStream is = (new URL(url)).openStream();
            JsonReader rdr = Json.createReader(is)) {
            JsonObject obj = rdr.readObject();
            JsonArray results = obj.getJsonArray("data");
            for (JsonObject result : results.getValuesAs(JsonObject.class)) {
                ID_Name.put(result.getString("id"), result.getString("name"));
                //System.out.println("Test : "+result.getString("id") +"   "+"Test Name : "+result.getString("name"));
              }
           if(results.isEmpty() || results.size()<1000)
           {
               break;
           }
               JsonObject next=obj.getJsonObject("paging");               
               String next_url=next.getString("next");
               url=next_url;         
          }
            
        }   
        return ID_Name;
    }
        
    public String ParsURL_ones(String url) throws MalformedURLException, IOException
    {
        String id=null;
        try (InputStream is = (new URL(url)).openStream();
        JsonReader rdr = Json.createReader(is)) {
        JsonObject obj = rdr.readObject();
        JsonArray results = obj.getJsonArray("data");
        for (JsonObject result : results.getValuesAs(JsonObject.class)) {
               
               id = result.getString("id");
            }  
        }
        return id;
    }
    
    public Map<String,String>ParsURL_pagePost(String url) throws MalformedURLException, IOException
    {
        
        Map<String,String> ID_Name = new HashMap<String,String>(); 
        int i=0;
        while(true)
        {
            try (InputStream is = (new URL(url)).openStream();
            JsonReader rdr = Json.createReader(is)) {
            JsonObject obj = rdr.readObject();
            JsonArray results = obj.getJsonArray("data");
            for (JsonObject result : results.getValuesAs(JsonObject.class)) {
                ID_Name.put(result.getString("id"),"/");              
              }
          if(results.isEmpty()|| results.size()<250)
           {
               break;
           }
               JsonObject next=obj.getJsonObject("paging"); 
               String next_url=next.getString("next");
               url=next_url;                  
          }
            
        }   
            
        return ID_Name;
    }
    
      public Map<String,String>ParsURL_PostComment(String url) throws MalformedURLException, IOException
    {
        Map<String,String> ID_Name = new HashMap<String,String>(); 
        while(true)
        {
            try (InputStream is = (new URL(url)).openStream();
            JsonReader rdr = Json.createReader(is)) {
            JsonObject obj = rdr.readObject();
            JsonArray results = obj.getJsonArray("data");
            for (JsonObject result : results.getValuesAs(JsonObject.class)) {
                JsonObject from_result=result.getJsonObject("from");
                ID_Name.put(from_result.getString("id"), from_result.getString("name"));
              }
           if(results.isEmpty() || results.size()<1000)
           {
               break;
           }
               JsonObject next=obj.getJsonObject("paging");               
               String next_url=next.getString("next");
               url=next_url; 
          }
            
        }   
        return ID_Name;
    }

}
