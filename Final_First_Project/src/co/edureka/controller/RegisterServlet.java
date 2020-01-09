package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.DB.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	

	public void init(ServletConfig config) throws ServletException {
		System.out.println("--Register init--");
	}


	public void destroy() {
		System.out.println("--Register destroy--");
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--Register Service--");
		/*
		 * what should we took (Id, or , name)
		 */
		String username=request.getParameter("email");
		String password=request.getParameter("pwd");
		User user=new User(username,password);
		
		PrintWriter out=response.getWriter();
		
		JDBCHelper helper=new JDBCHelper();
		helper.createConnection();
		boolean auth=helper.authenticateUser(user);
		helper.closeConnection();
		
		if(auth) {
			RequestDispatcher view = request.getRequestDispatcher("Menu.html");
			view.forward(request, response);
		}
		else {
			out.print("<h3>"+username+" is not register, make sure it's registered already !");
		}
		
		System.out.println("user name is "+username+" password is "+password);
	}

}
