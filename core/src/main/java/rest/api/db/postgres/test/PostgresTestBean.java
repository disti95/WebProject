package rest.api.db.postgres.test;

import entities.InternationalObjectEnity;

import java.util.List;

/**
 * @author Christian Dittrich
 */
public interface PostgresTestBean {

    String getPostgresTest();
    String getJPQLPostgresTest();
    List<InternationalObjectEnity> getInternationalObjects();
    String getArticle();

}
