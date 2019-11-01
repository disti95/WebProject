package servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Christian Dittrich
 */
//TODO with deployment descriptor ..
public class TestServlet extends HttpServlet{

    protected void doGet(
        final HttpServletRequest request,
        final HttpServletResponse response
    ) throws IOException {
        response.getWriter().append("HelloServlet has answered (GET)");
    }

    protected void doPost(
        final HttpServletRequest request,
        final HttpServletResponse response
    ) throws IOException {
        response.getWriter().append("HelloServlet has answered (POST)");
    }

}
