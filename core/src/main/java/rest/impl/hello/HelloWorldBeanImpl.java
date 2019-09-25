package rest.impl.hello;

import lombok.NoArgsConstructor;
import rest.api.hello.HelloWorldBean;

import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * @author Christian Dittrich
 */
@Stateless
@Local(HelloWorldBean.class)
@NoArgsConstructor
public class HelloWorldBeanImpl implements HelloWorldBean {

    @Override
    public String hello() {
        return "Hello world it's working";
    }

}
