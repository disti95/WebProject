package servlet.session.sessionscope;

import servlet.pojo.Customer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Christian Dittrich
 */
@WebServlet("/servlet/sessionscope")
public class SessionScopeServlet extends HttpServlet {

    protected void doGet(
            final HttpServletRequest request,
            final HttpServletResponse response
    ) throws IOException {
        Customer customer = new Customer();
        customer.setEmail(request.getParameter("email"));
        customer.setPassword(request.getParameter("password"));

        //getSession activates setting jsession
        HttpSession session = request.getSession();
        session.setAttribute("customer", customer);

        response.getWriter().append(request.getSession().getId());
    }

}
