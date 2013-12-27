package free.java.tryrest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class KillBugApp extends Application{

    @Override
    public synchronized Restlet createInboundRoot()
    {
        Router router = new Router(getContext());
        router.attach(
                "/services/killbug",
                KillBug.class);
        return router;
    }

}
