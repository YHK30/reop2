package example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.bean.User;
import example.bean.UserValidator;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet(name = "Validate", urlPatterns = { "/Validate" })
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String currentUserName= request.getParameter("uid");
		String currentPassword= request.getParameter("pwd");
		
		User currentUser=new User(currentUserName,currentPassword);
		boolean valid= UserValidator.isValid(currentUser);
		if (valid)
			out.println("<h1>Taste it your way, Now It's time to go to SAY</h1>");
		else
			out.println("<h2>Invalid user<h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
