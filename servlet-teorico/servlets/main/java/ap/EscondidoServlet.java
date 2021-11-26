package ap;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/escondido.do")
public class EscondidoServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 6677705048667492427L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = (String) req.getSession().getAttribute("username");
		
		if (username != null && username != "") {
			resp.getWriter().append("Hola, escondido!");
		}
		
		
	}
	
}
