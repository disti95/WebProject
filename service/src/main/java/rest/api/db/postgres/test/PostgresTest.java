package rest.api.db.postgres.test;

import entities.ArticleEntity;
import entities.InternationalObjectEnity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
    Response getPostgresTest();

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

    @GET
    @Path("international_objects")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(
        value = "get international object entities",
        response = InternationalObjectEnity.class
    )
    @ApiResponses({
        @ApiResponse(
            code = 200,
            message = "Ok",
            response = InternationalObjectEnity.class
        )
    })
    Response getInternationalObjects();

    @GET
    @Path("firstArticle")
    @Produces(MediaType.TEXT_HTML)
    @ApiOperation(
        value = "get article entity with id 1",
        response = ArticleEntity.class
    )
    @ApiResponses({
        @ApiResponse(
            code = 200,
            message = "Ok",
            response = ArticleEntity.class
        )
    })
    Response getArticle();

}
