package rest.impl.db.postgres.test;

import entities.Article;
import rest.api.db.postgres.test.PostgresTestBean;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Christian Dittrich
 */
@Local(PostgresTestBean.class)
@Stateless
public class PostgresTestBeanImpl implements PostgresTestBean{

    @PersistenceContext(unitName = "postgres")
    private EntityManager em;

    @Override
    public String getPostgresTest() {
        Query query = em.createNativeQuery("select * from article", Article.class);
        List list = query.getResultList();
        Article a = (Article) list.get(0);
        return a.getName();
    }

    @Override
    public String getJPQLPostgresTest() {
        Query query = em.createQuery("select a from Article a", Article.class);
        List<Article> list = query.getResultList();
        return list.get(0).getName() + " " + list.get(0).getPrice();
    }

}
