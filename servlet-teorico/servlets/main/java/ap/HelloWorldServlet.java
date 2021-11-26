package ap;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet implements Servlet {
    
	private static final long serialVersionUID = -2255301601045001634L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		HttpServletResponse response2 = (HttpServletResponse) response;
		
		response2.getWriter()
		.append("<h1>")
		.append("¡Hola Mundo!")
		.append("</h1>")
		.append("<p>")
		.append(new java.util.Date().toString())
		.append("</p>");
	}

}
