package servlet.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Christian Dittrich
 */
@Getter
@Setter
public class Customer implements Serializable{

    private String email;
    private String password;

}
