package rest.impl.db.postgres.test;

import lombok.Getter;
import rest.api.db.postgres.test.PostgresTest;
import rest.api.db.postgres.test.PostgresTestBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * @author Christian Dittrich
 */
@RequestScoped
@Getter
public class PostgresTestImpl implements PostgresTest {

    @Inject
    private PostgresTestBean postgresTestBean;

    public String getPostgresTest() {
        return getPostgresTestBean().getPostgresTest();
    }

    @Override
    public String getJPQLPostgresTest() {
        return getPostgresTestBean().getJPQLPostgresTest();
    }

}
