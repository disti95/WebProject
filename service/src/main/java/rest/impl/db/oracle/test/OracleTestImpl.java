package rest.impl.db.oracle.test;

import rest.api.db.oracle.test.OracleTest;
import rest.api.db.oracle.test.OracleTestBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * @author Christian Dittrich
 */
@RequestScoped
public class OracleTestImpl implements OracleTest {

    @Inject
    private OracleTestBean oracleTestBean;

    @Override
    public String getOracleTest() {
        return oracleTestBean.getOracleTest();
    }

}
