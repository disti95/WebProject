package servlet.cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Christian Dittrich
 */
@WebServlet("/servlet/cookie")
public class CookieServlet extends HttpServlet{

    protected void doGet(
        final HttpServletRequest request,
        final HttpServletResponse response
    ) throws IOException {

        //cookies are string values only
        Cookie cookie_email = new Cookie("customer_email", "abc");
        Cookie cookie_password = new Cookie("customer_password", "mypass");

        response.addCookie(cookie_email);
        response.addCookie(cookie_password);
    }

}
