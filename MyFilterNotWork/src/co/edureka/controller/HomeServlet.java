package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.model.User;


@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String dateTime=new Date().toString();
		
		//we can read cookie in any servlet in our app.
		//Cookie[] ckArr=request.getCookies();
		
		
		out.print("<html><body><center>");
		out.print("<h2>Welcome home, dear</h2>");
		out.print("<h3>it's "+dateTime+" </h3>");
		/*out.print("<h4>Cookie:</h4>");
		
		for(Cookie ck:ckArr)
		{
			out.print("<h3>"+ ck.getName()+ " - "+ck.getValue()+"</h3>");
		}*/
		
		
		//out.print("<h3>URL Rewriting data :</h3>");
		
	/*	String name=request.getParameter("name");
		String email=request.getParameter("email");
		String age=request.getParameter("age");
		*/
		
		HttpSession session=request.getSession();
		String name=(String)session.getAttribute("KeyName");
		String email=(String)session.getAttribute("KeyEmail");
		int age=(Integer)session.getAttribute("KeyAge");
		
		out.print("<h3>hello"+name+"</h3>");
		out.print("<h3>email :"+email+"</h3>");
		out.print("<h3>You are "+age+" years old</h3>");
		
		
		
		out.print("</center></body></html>");
		
		/*
		 * module 10 has been 01:04:28 timestamp.
		 */
		
	}

}
