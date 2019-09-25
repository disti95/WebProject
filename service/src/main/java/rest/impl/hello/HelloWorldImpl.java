package rest.impl.hello;

import lombok.Getter;
import rest.api.hello.HelloWorld;
import rest.api.hello.HelloWorldBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * @author Christian Dittrich
 */
@Getter
@RequestScoped
public class HelloWorldImpl implements HelloWorld {

    @Inject
    private HelloWorldBean helloWorldBean;

    @Override
    public String getHello() {
        return getHelloWorldBean().hello();
    }
}
