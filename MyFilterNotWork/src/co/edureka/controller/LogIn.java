package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/LogIn", "/login" })

public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();

		user.email=request.getParameter("txtemail");
		user.password=request.getParameter("txtPassword");
		
		JDBCHelper helper=new JDBCHelper();
		
		helper.createConnection();
		boolean auth=helper.authenticateUser(user);
		helper.closeConnection();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body><center>");
		if(auth)
		{
			
			String name="Rudresh sisode";
			int age=30;
			String email=user.email;
			/*
			 * Session tracking with cookies
			String name="Rudresh sisode";
			int age=30;
			String email=user.email;
			 
			Cookie ck1=new Cookie("keyName", name);
			Cookie ck2=new Cookie("keyAge", String.valueOf(age));
			Cookie ck3=new Cookie("keyEmail", email);
			
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);
			
			*/
			
			
		out.print("<h2>"+user.email+" registerd successfully </h2>");
		//out.print("<br/><a href='Welcome'>Enter home</a>");
		//2 technique
		//out.print("<br/><a href='Welcome?name"+name+"&email="+email+"&age"+age+"enter home'</a>");
		
		//3 technique hidden form field
		/*
		String from ="<form action='Welcome' method='post>"
				+"<input type='hidden' name='textName' value='"+name+"'/>"
				+"<input type='hidden' name='textemail' value='"+email+"'/>"
				+"<input type='hidden' name='textage' value='"+age+"'/>"
				+"<input type='submit' value='Enter home'/>"
				+"</form>";
		out.print(from);
		*/
		
		
		
		
		//session tracking - HttpSession API
		HttpSession session=request.getSession();
		session.setAttribute("KeyName",name);
		session.setAttribute("KeyEmail",email);
		session.setAttribute("KeyAge",age);
		out.print("<br/><a href='Welcome'>Enter Home</a>");
		
		}
		else
		{
			out.print("<h2>"+user.email+" registerd Unsuccessfully </h2>");
		}
		out.print("</center></body></html>");
		
		
		
	}

}
