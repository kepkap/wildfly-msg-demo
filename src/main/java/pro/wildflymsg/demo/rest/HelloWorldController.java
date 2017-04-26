package pro.wildflymsg.demo.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by kepkap
 * on 26/04/2017.
 */
@Path("/")
@Api(value = "/", description = "Get the time", tags = "time")
public class HelloWorldController {

    @GET
    @Path("/helloWorld")
    @Produces("text/plain")
    @ApiOperation(value = "Get the current time",
            notes = "Returns the time as a string, along with some JDK class name for good measure",
            response = String.class
    )

    public String helloWorld() {
        return "Hello World";
    }
}
