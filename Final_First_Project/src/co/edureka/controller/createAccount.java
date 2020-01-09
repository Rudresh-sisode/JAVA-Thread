package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.DB.JDBCHelper;
import co.edureka.model.AddUser;


@WebServlet({ "/createAccount", "/AddAccount" })
public class createAccount extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	public void destroy() {
		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Name=request.getParameter("name");
		String DOB=request.getParameter("date");
		String Address=request.getParameter("address");
		String Email=request.getParameter("email");
		String AcountType=request.getParameter("comform");
		
		AddUser createA=new AddUser(Name,DOB,Address,Email,AcountType);
		
		PrintWriter out=response.getWriter();
		
		JDBCHelper helper=new JDBCHelper();
		helper.createConnection();
		helper.insertAccount(createA);
		helper.closeConnection();
		
		out.print(" data successfully inserted !");
		
		System.out.println("Data Inserted");
		
		
		
		
	}

	
	

}
