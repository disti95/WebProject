package rest.impl.db.postgres.test;

import rest.api.db.postgres.test.PostgresTest;
import rest.api.db.postgres.test.PostgresTestBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * @author Christian Dittrich
 */
@RequestScoped
public class PostgresTestImpl implements PostgresTest {

    @Inject
    private PostgresTestBean postgresTestBean;

    public String getPostgresTest() {
        return postgresTestBean.getPostgresTest();
    }

    @Override
    public String getJPQLPostgresTest() {
        return postgresTestBean.getJPQLPostgresTest();
    }

}
