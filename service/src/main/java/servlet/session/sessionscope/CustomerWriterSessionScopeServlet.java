package servlet.session.sessionscope;

import servlet.pojo.Customer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Christian Dittrich
 */
@WebServlet("/servlet/customer/writer/sessionscope")
public class CustomerWriterSessionScopeServlet extends HttpServlet {

    //works as long as session active
    protected void doGet(
            final HttpServletRequest request,
            final HttpServletResponse response
    ) throws IOException {
        Customer customer = (Customer) request.getSession().getAttribute("customer");
        response.getWriter().append(customer.getEmail() + " " + customer.getPassword());
    }

}
