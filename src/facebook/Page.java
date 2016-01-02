/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 *
 * @author Omar Ali
 */
public class Page {
    Map<String,String>post = new HashMap<String,String>();
    JSON_Pasre json = new JSON_Pasre();
    String url;
    public void get_Post(String url,String token,String since) throws MalformedURLException, IOException
    {
        post = new HashMap<String,String>();
        String pageName = url.substring(url.lastIndexOf("/")+1 , url.length());
        if(since.equals(""))
        {url="https://graph.facebook.com/"+pageName+"/feed?access_token="+token+"&limit=250";}
        else
        {url="https://graph.facebook.com/"+pageName+"/feed?access_token="+token+"&limit=250&since="+since;  } 
        post = json.ParsURL_pagePost(url); 
    }
    
   
     public Map<String,String> get_pageLikes(String token) throws MalformedURLException, IOException
     {  
         Map<String,String>likes = new HashMap<String,String>();
         
        for (Map.Entry<String,String> entry : post.entrySet())
        {           
             url="https://graph.facebook.com/"+entry.getKey()+"/likes?access_token="+token+"&limit=1000";
             if(json.ParsURL(url)!=null)
             likes.putAll(json.ParsURL(url));         
        }
        
         return likes;
     }
     
      public Map<String,String> get_pageComments(String token) throws MalformedURLException, IOException
      {
          Map<String,String>comments = new HashMap<String,String>();
          
          for (Map.Entry<String, String> entry : post.entrySet())
            {
                url="https://graph.facebook.com/"+entry.getKey()+"/comments?access_token="+token+"&limit=1000";
                if(json.ParsURL_PostComment(url)!=null)
                comments.putAll(json.ParsURL_PostComment(url));
            }
          return comments;
      }
      
      public Map<String,String> get_pageShares(String token) throws MalformedURLException, IOException
      {
          String post_id;
          Map<String,String>shares = new HashMap<String,String>();
          
          for (Map.Entry<String, String> entry : post.entrySet())
            {
                post_id=entry.getKey();
                post_id = post_id.substring(post_id.lastIndexOf("_")+"_".length(),post_id.length());
                url="https://graph.facebook.com/"+post_id+"/sharedposts?access_token="+token+"&limit=1000";
                if(json.ParsURL_PostComment(url)!=null)
                shares.putAll(json.ParsURL_PostComment(url));
            }
          return shares;
      }
}
