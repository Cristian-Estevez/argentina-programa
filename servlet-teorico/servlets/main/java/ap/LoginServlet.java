package ap;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet implements Servlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if (password.equals("1234")) {
			
			req.getSession().setAttribute("username", username);
			
			resp.sendRedirect("welcome.jsp");
		} else {
			req.setAttribute("flash", "usuario o contraseña incorrectos");
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.jsp");
			
			dispatcher.forward(req, resp);
		}
		
	}
	
}
