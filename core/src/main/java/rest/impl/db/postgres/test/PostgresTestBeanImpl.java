package rest.impl.db.postgres.test;

import entities.ArticleEntity;
import entities.InternationalObjectEnity;
import rest.api.db.postgres.test.PostgresTestBean;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Christian Dittrich
 */
@Local(PostgresTestBean.class)
@Stateless
public class PostgresTestBeanImpl implements PostgresTestBean {

    @PersistenceContext(unitName = "postgres")
    private EntityManager em;

    @Override
    public String getPostgresTest() {
        Query query = em.createNativeQuery("select * from ArticleEntity", ArticleEntity.class);
        List list = query.getResultList();
        ArticleEntity a = (ArticleEntity) list.get(0);

        return a.getName();
    }

    @Override
    public String getJPQLPostgresTest() {
        Query query = em.createQuery("select a from ArticleEntity a", ArticleEntity.class);
        List<ArticleEntity> list = query.getResultList();

        return list.get(0).getName() + " " + list.get(0).getPrice();
    }

    @Override
    public List<InternationalObjectEnity> getInternationalObjects() {
        Query query = em.createQuery("select i from InternationalObjectEnity i", InternationalObjectEnity.class);
        List<InternationalObjectEnity> list = query.getResultList();

        return list;
    }

    @Override
    public String getArticle() {
        Query query = em.createQuery("select a from ArticleEntity a where id = 1", ArticleEntity.class);
        ArticleEntity article = (ArticleEntity) query.getSingleResult();

        String s = article.getDescriptions().stream()
            .map(InternationalObjectEnity::getDescription)
            .collect(Collectors.joining());

        return article.getId() + " " + s;
    }

}
