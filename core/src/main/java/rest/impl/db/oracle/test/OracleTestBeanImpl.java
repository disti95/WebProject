package rest.impl.db.oracle.test;

import lombok.NoArgsConstructor;
import rest.api.db.oracle.test.OracleTestBean;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Christian Dittrich
 */
@Local(OracleTestBean.class)
@LocalBean
@Named
@Dependent
@Stateless
@NoArgsConstructor
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
