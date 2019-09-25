package rest.api.db.oracle.test;

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
@Path("/oracle/test")
@Api(value = "/oracle/test", description = "test oracle")
public interface OracleTest {

    @GET
    @Produces(MediaType.TEXT_HTML)
    @ApiOperation(
            value = "test oracle",
            response = String.class
    )
    @ApiResponses({
        @ApiResponse(
            code = 200,
            message = "Ok",
            response = String.class
        )
    })
    String getOracleTest();

}
