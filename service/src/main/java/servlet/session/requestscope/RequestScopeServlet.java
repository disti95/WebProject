package servlet.session.requestscope;

import servlet.pojo.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Christian Dittrich
 */
@WebServlet("/servlet/requestscope")
public class RequestScopeServlet extends HttpServlet {

    protected void doGet(
            final HttpServletRequest request,
            final HttpServletResponse response
    ) throws IOException, ServletException {
        Customer customer = new Customer();
        customer.setEmail(request.getParameter("email"));
        customer.setPassword(request.getParameter("password"));

        request.setAttribute("customer", customer);

        request.getRequestDispatcher("customer/writer/requestscope").forward(request,response);
    }

}
