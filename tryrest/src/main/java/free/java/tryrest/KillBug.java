package free.java.tryrest;

import java.io.IOException;

import org.restlet.ext.jaxb.JaxbRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import com.github.geektang.evaluation.Service;

public class KillBug extends ServerResource {

    @Get
    public String toString() {
        return "Raid Kills Bugs Dead!";
    }
    
    @Post
    public String service(JaxbRepresentation<com.github.geektang.evaluation.Service> service) {
        service.setContextPath("com.github.geektang.evaluation");
        try {
            Service request = service.getObject();
            return request.getServiceName();
        } catch (IOException e) {
            return "Raid Kills Bugs Dead!";
        }
    }
}
