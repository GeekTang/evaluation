package free.java.tryrest;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class KillBug extends ServerResource {

    @Get
    public String toString() {
        return "Raid Kills Bugs Dead!";
    }
}
