package facebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.*;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Connect {
    
        String code=null;
        String APP_ID = "431839916997022";
        String APP_SECRET = "b324256d1e3d4863e0155c26c73296c3";
        
        public void connect()
        {
            final Browser browser;
            final Display display = new Display();
            final Shell shell = new Shell(display);
            shell.setLayout(new GridLayout());
            browser = new Browser(shell, SWT.NONE); 
            browser.setLayoutData(new GridData(GridData.FILL_BOTH));
            browser.setUrl("https://www.facebook.com/dialog/oauth?client_id=" + APP_ID
                            + "&redirect_uri=https://example.org/absolute/URI/with/absolute/path/to/resource.txt&scope=user_likes,user_friends,user_groups,user_posts");    
            shell.open();      
            browser.addLocationListener(new LocationListener(){
            public void changed(LocationEvent e){            
                String new_url = e.location;
                if(e.location.contains("code="))
                {
                    
                     code = e.location.substring(e.location.lastIndexOf("code=")+"code=".length(), e.location.length());
                     shell.dispose();
                }              
             }
            public void changing(LocationEvent e) {
            } });           
            while(!shell.isDisposed()) {                
                  if(!display.readAndDispatch()){
                       display.sleep();
                       }
                    }           
                 display.dispose();
         }
        
        public String Get_Token() throws MalformedURLException, IOException 
        {
            // take the code and generate access_token
               String url = "https://graph.facebook.com/oauth/access_token?client_id="+ APP_ID + "&client_secret="+APP_SECRET
                                     +"&redirect_uri=https://example.org/absolute/URI/with/absolute/path/to/resource.txt"+
                                      "&code="+code ; 
                URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection(); 
		con.setRequestMethod("GET");
		int responseCode = con.getResponseCode();
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine="" , read="";
		StringBuffer response = new StringBuffer();
 
		while ((read= in.readLine()) != null) {
			inputLine = read+inputLine;
		}
                String token = inputLine.substring("access_token=".length(), inputLine.lastIndexOf("&"));
		in.close();
                return token;            
        }      
 }
