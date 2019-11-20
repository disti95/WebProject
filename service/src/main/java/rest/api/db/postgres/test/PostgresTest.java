package rest.api.db.postgres.test;

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
@Path("/postgres/test")
@Api(value = "/postgres/test")
public interface PostgresTest {

    @GET
    @Path("native")
    @Produces(MediaType.TEXT_HTML)
    @ApiOperation(
        value = "test postgres",
        response = String.class
    )
    @ApiResponses({
        @ApiResponse(
            code = 200,
            message = "Ok",
            response = String.class
        )
    })
    String getPostgresTest();

    @GET
    @Path("jpql")
    @Produces(MediaType.TEXT_HTML)
    @ApiOperation(
        value = "test postgres",
        response = String.class
    )
    @ApiResponses({
        @ApiResponse(
            code = 200,
            message = "Ok",
            response = String.class
        )
    })
    String getJPQLPostgresTest();

}
