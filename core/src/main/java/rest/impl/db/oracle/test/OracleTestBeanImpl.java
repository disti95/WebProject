package rest.impl.db.oracle.test;

import rest.api.db.oracle.test.OracleTestBean;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Christian Dittrich
 */
@Local(OracleTestBean.class)
@Stateless
public class OracleTestBeanImpl implements OracleTestBean {

//    @PersistenceContext(unitName = "oracleDB")
    private EntityManager em;

    @Override
    public String getOracleTest() {
        Query q = em.createQuery("select name from Costumer");
        List list = q.getResultList();

        return list.get(0).toString();
    }

}
