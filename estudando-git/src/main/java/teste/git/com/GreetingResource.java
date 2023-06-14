package teste.git.com;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
<<<<<<< HEAD
        return "Hello from RESTEasy Reactiveee";
=======
        return "Hello from RESTEasy Reativo";
>>>>>>> 8dd3f088fc638ed9288b5926e316c815ffe026f0
    }
}
