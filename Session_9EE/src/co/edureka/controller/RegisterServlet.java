package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("--RestisterServlet init-------");
	}

	
	public void destroy() {
		System.out.println("--RestisterServlet destroy-------");
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--RestisterServlet service-------");
		String name=request.getParameter("txtName");
		String email=request.getParameter("txtEmail");
		String password=request.getParameter("txtpassword");
		
		
		System.out.println(name+" "+email+" "+password);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		User user=new User(0,name,email,password);
		
		JDBCHelper helper=new JDBCHelper();
		helper.createConnection();
		int i =helper.registerUser(user);
		helper.closeConnection();
		
		//text response
		//out.print("user registered successfully");
		
		//html response
		out.print("<html><body><center>");
		if(i>0)
		{
		out.print("<h2>"+name+" registerd successfully </h2>");
		}
		else
		{
			out.print("<h2>"+name+" registerd Unsuccessfully </h2>");
		}
		out.print("</center></body></html>");
	}

}
