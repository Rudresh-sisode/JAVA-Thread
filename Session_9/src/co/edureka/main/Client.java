package co.edureka.main;

import java.util.ArrayList;

import co.edureka.DB.JDBCHelper;
import co.edureka.model.Student;

public class Client {

	public static void main(String[] args) {
		
		Student sRef=new Student(4,"ken ","ken@example.com",95,"new York");
		
		
		JDBCHelper helper=new JDBCHelper();
		//create the connection
		helper.createConnection();
		//3. write and execute the sql statment
		//helper.insertStudent(sRef);
		
		//helper.updateStudent(sRef);
		//4 close the connection
		
		//helper.deleteStudent(5);
		
		ArrayList<Student> list=helper.retrieveStudent();
		
		for(Student std:list)
		{
			System.out.println(std);
		}
		
		
		helper.closeConnection();
		
		//
	}

}
