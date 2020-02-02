package servlet.pojo;

import java.io.Serializable;

/**
 * @author Christian Dittrich
 */
public class Customer implements Serializable{

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
