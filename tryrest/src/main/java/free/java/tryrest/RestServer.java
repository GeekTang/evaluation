package free.java.tryrest;

import java.util.Properties;

import org.restlet.Component;
import org.restlet.data.Protocol;

public class RestServer {
    
    private String ip = "127.0.0.1";
    
    private int port = 8055;
    
    private Component component = new Component();

    public RestServer(){
        
    }
    
    public RestServer(Properties properties){
        
    }
    
    public void start(){
        KillBugApp app = new KillBugApp();
        
        component.getServers().add(Protocol.HTTP, port);             

        component.getDefaultHost().attach(app);
        try {
            component.start();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    public void stop(){
        try {
            component.stop();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
