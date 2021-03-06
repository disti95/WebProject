package rest.api.hello;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Christian Dittrich
 */
@Path("/hello")
@Api(value = "/hello", description = "hello-service")
public interface HelloWorld {

    @GET
    @Produces(MediaType.TEXT_HTML)
    @ApiOperation(
            value = "Gretting",
            response = String.class
    )
    @ApiResponses({
        @ApiResponse(
            code = 200,
            message = "Ok",
            response = String.class
        )
    })
    String getHello();

}
