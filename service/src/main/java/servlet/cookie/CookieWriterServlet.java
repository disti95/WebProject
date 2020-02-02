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
@WebServlet("/servlet/cookie/writer")
public class CookieWriterServlet extends HttpServlet {

    protected void doGet(
            final HttpServletRequest request,
            final HttpServletResponse response
    ) throws IOException {
        for(Cookie cookie : request.getCookies()) {
            response.getWriter().append(cookie.getValue());
        }
    }

}
