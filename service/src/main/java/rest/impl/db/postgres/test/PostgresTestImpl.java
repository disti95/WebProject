package rest.impl.db.postgres.test;

import rest.api.db.postgres.test.PostgresTest;
import rest.api.db.postgres.test.PostgresTestBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

/**
 * @author Christian Dittrich
 */
@RequestScoped
public class PostgresTestImpl implements PostgresTest {

    @Inject
    private PostgresTestBean postgresTestBean;

    @Override
    public Response getPostgresTest() {
        return Response.ok(
            String.format("{\"name\": \"%s\"}", postgresTestBean.getPostgresTest())
        )
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Credentials", "true")
        .header("Access-Control-Allow-Headers",
                "origin, content-type, accept, authorization")
        .header("Access-Control-Allow-Methods",
                "GET, POST, PUT, DELETE, OPTIONS, HEAD")
        .build();
    }

    @Override
    public String getJPQLPostgresTest() {
        return postgresTestBean.getJPQLPostgresTest();
    }

}
