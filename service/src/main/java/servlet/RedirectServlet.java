package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Christian Dittrich
 */
@WebServlet("/servlet/redirect")
public class RedirectServlet extends HttpServlet{

    protected void doGet(
        final HttpServletRequest request,
        final HttpServletResponse response
    ) throws IOException {
        response.setStatus(HttpServletResponse.SC_TEMPORARY_REDIRECT);
        response.setHeader("Location", "hello");
    }


}
