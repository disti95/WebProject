package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Christian Dittrich
 */
@WebServlet("/servlet/forward")
public class ForwardServlet extends HttpServlet {

    protected void doGet(
        final HttpServletRequest request,
        final HttpServletResponse response
    ) throws IOException, ServletException {
        final RequestDispatcher requestDispatcher = request.getRequestDispatcher("hello");
        requestDispatcher.forward(request, response);
        log(request.getRemoteAddr());
    }

}
