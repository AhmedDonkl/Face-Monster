/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javafx.scene.chart.PieChart;
/**
 *
 * @author Omar Ali
 */
public class Facebook {

    public static void main(String[] args) {
               
       GUI.main(args);
          
          /*
          //Group get member from posts
        Group g=new Group();
        //use get member to get members
         g.get_Post("https://www.facebook.com/groups/663309747135629/", token,since);
         
        Map<String,String> post_likes=g.get_GroupComments(token);
        
            int i=1;
            for (Map.Entry<String, String> entry : post_likes.entrySet())
            {
                System.out.println(i+"  Id   "+entry.getKey()+"   name "+entry.getValue());
                i++;
            }
          */
        
        
       /* //post
        
         Post p=new Post();
         Map<String,String> post_likes= p.get_Post_likes("311421862315012", token);
        
         int i=1;
            for (Map.Entry<String, String> entry : post_likes.entrySet())
            {
                System.out.println(i+"  Id   "+entry.getKey()+"   name "+entry.getValue());
                i++;
            }
        
        */
        
        /*
        Page page = new Page();
        
        // get current time
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
          Date date = new Date();
          String until=dateFormat.format(date),since="2/5/2015";
          
        page.get_Post("https://www.facebook.com/KoraBook.Official", token,since,until);
        
        Map<String,String> page_likes =page.get_pageLikes(token);
        
          int i=1;
            for (Map.Entry<String, String> entry : page_likes.entrySet())
            {
                System.out.println(i+"  Id   "+entry.getKey()+"   name "+entry.getValue());
                i++;
            }
        */
        
      
        
    }
}
