package co.edureka.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.eudreka.model.Student;


@WebServlet({ "/AddStudent", "/Add" })
public class AddStudent extends HttpServlet {
	
       
   
   


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student student=new Student();
		student.roll=Integer.parseInt(request.getParameter("txtRoll"));
		student.name=request.getParameter("txtname");
		student.age=Integer.parseInt(request.getParameter("txtAge"));
		student.Address=request.getParameter("txtAddress");
		//user hibernate/jdbc/spring and add student into db
		/*
		 * the model 13 timestamp has been 1:41:26 has been pass away.
		 */
		
		
	}

}
