package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	
	
	//validate the crediantial
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("txtemail");
		String password=request.getParameter("txtPassword");
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(!email.isEmpty() && !password.isEmpty()) {
			out.print("user valided");
			RequestDispatcher dispatcher =request.getRequestDispatcher("login");
			dispatcher.forward(request, response);
			
		}
		else {
			out.print("User invalid");
			RequestDispatcher dispatcher =request.getRequestDispatcher("existingUser.html");
			dispatcher.include(request, response);
		}
		
	}

}
