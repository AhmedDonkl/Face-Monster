/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Omar Ali
 */
public class Post {
    
    
    JSON_Pasre json = new JSON_Pasre();

    public Map<String,String> get_Post_likes(String url,String token) throws MalformedURLException, IOException
    {     
        Map<String,String>post_likes = new HashMap<String,String>();
        url="https://graph.facebook.com/"+url+"/likes?access_token="+token+"&limit=1000";
        post_likes = json.ParsURL(url);       
        
        return post_likes;
    }
    
     public Map<String,String> get_Post_comments(String url,String token) throws MalformedURLException, IOException
    {     
        Map<String,String>post_comments = new HashMap<String,String>();
        url="https://graph.facebook.com/"+url+"/comments?access_token="+token+"&limit=1000";
        post_comments = json.ParsURL_PostComment(url);       
        
        return post_comments;
    }
     
      public Map<String,String> get_Post_shares(String url,String token) throws MalformedURLException, IOException
    {     
        Map<String,String>post_shares = new HashMap<String,String>();
        url="https://graph.facebook.com/"+url+"/sharedposts?access_token="+token+"&limit=1000";
        post_shares = json.ParsURL_PostComment(url);       
        
        return post_shares;
    }
    
}
