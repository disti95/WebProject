package rest.impl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Christian Dittrich
 */
@Path("/hello")
@Api(value = "/hello", description = "hello-service")
public class HelloWorld {

    @PersistenceContext(unitName = "mydef")
    private EntityManager em;

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
    public String getHello() {
        return "hello that's my world!";
    }

    @GET
    @Path("oracle")
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
    public String testOracle() {
        Query q = em.createQuery("select name from Costumer");
        List list = q.getResultList();

        return list.get(0).toString();
//        return "nix";
    }

}
