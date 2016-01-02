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


/**
 *
 * @author Omar Ali
 */
public class Group {
    
    JSON_Pasre json = new JSON_Pasre();
    Map<String,String>post = new HashMap<String,String>();
    String url;
    
    public Map<String,String> Get_Members (String url,String token) throws IOException
    {
        String groub_id = url.substring(url.lastIndexOf("groups/")+"groups/".length(),url.lastIndexOf("/"));
        String regex = "[0-9]+";
        if(groub_id.matches(regex))
        {
             url="https://graph.facebook.com/"+groub_id+"/members?access_token="+token+"&limit=10000";
        }  
        else
        {
            String new_url="https://graph.facebook.com/search?access_token="+token+"&q="+groub_id+"&type=group";
            groub_id = json.ParsURL_ones(new_url);
            url="https://graph.facebook.com/"+groub_id+"/members?access_token="+token+"&limit=1000";
        }
        
        return json.ParsURL(url);  
    }
  
    public void get_Post(String url,String token,String since) throws MalformedURLException, IOException
    {
        post = new HashMap<String,String>();
        String regex = "[0-9]+";
        String Group_name = url.substring(url.lastIndexOf("groups/")+"groups/".length(),url.lastIndexOf("/"));
         if(!Group_name.matches(regex))
        {
            String new_url="https://graph.facebook.com/search?access_token="+token+"&q="+Group_name+"&type=group";
            Group_name = json.ParsURL_ones(new_url);
        }  
        if(since.equals(""))
        url="https://graph.facebook.com/"+Group_name+"/feed?access_token="+token+"&limit=250";
        else
        url="https://graph.facebook.com/"+Group_name+"/feed?access_token="+token+"&limit=250&since="+since;
        
        post = json.ParsURL_pagePost(url); 
    }
    
   
     public Map<String,String> get_GroupLikes(String token) throws MalformedURLException, IOException
     {  
         Map<String,String>likes = new HashMap<String,String>();
         
        for (Map.Entry<String,String> entry : post.entrySet())
        {           
             url="https://graph.facebook.com/"+entry.getKey()+"/likes?access_token="+token+"&limit=1000";
             if(json.ParsURL(url)!=null)
             {
                 likes.putAll(json.ParsURL(url));
                 System.out.println(url);
             }    
             
             
        }
        
         return likes;
     }
     
      public Map<String,String> get_GroupComments(String token) throws MalformedURLException, IOException
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
      
      public Map<String,String> get_GroupShares(String token) throws MalformedURLException, IOException
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
