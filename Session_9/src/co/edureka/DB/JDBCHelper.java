package co.edureka.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Student;

public class JDBCHelper {
	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	//load the driver
	public JDBCHelper() {
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver loaded");
			
		}
		catch(Exception eX)
		{
			System.out.println("Some exception occured : "+eX);
		}
		
	}
	//step two
	public void createConnection() {
		try
		{
			String user="root";
			String password="";
			String url="jdbc:mysql://localhost/edureka?serverTimezone=UTC";
			con=DriverManager.getConnection(url,user,password);
			
			System.out.println("Connection created");
			
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured : "+ex);
		}
	}
	
	//3. sql statment
	public void insertStudent(Student student) {
		try
		{
			String sql="insert into Student values(null,'"+student.name+"','"+student.email
					+"','"+student.age+"','"+student.address+"')";
			stmt=con.createStatement();
			int i=stmt.executeUpdate(sql);
			System.out.println("Student inserted "+i);
			
			
			
		}
		catch(Exception ex)
		{
			System.out.println("error ocured "+ex);
		}
	}
	
	
	public void updateStudent(Student student) {
		try
		{
			/*Statement API
			 * String sql="update Student set name='"+student.name
					+"', email='"+student.email
					+"', age='"+student.age+"', address='"
					+student.address+"' where roll="+student.roll;
			
			stmt=con.createStatement();
			
			int i=stmt.executeUpdate(sql);
			
			System.out.println("Student updated "+i);
			
			*/
			
			//preparedStatment API
			
			String sql="update Student set name=?, email=?, age=?, address=? where roll=?";
			pStmt=con.prepareStatement(sql);
			
			pStmt.setString(1, student.name);
			pStmt.setString(2, student.email);
			pStmt.setInt(3, student.age);
			pStmt.setString(4, student.address);
			pStmt.setInt(5, student.roll);
			
			int i=pStmt.executeUpdate();
			
			System.out.println("Student updated "+i);
			
			
		}
		catch(Exception ex)
		{
			System.out.println("error ocured "+ex);
		}
	}
	
	public void deleteStudent(int roll) {
		try
		{
			
			
			//preparedStatment API
			
			String sql="delete from Student where roll=?";
			pStmt=con.prepareStatement(sql);
			
			
			pStmt.setInt(1,roll);
			
			int i=pStmt.executeUpdate();
			
			System.out.println("Student Deleted "+i);
			
			
		}
		catch(Exception ex)
		{
			System.out.println("error ocured "+ex);
		}
	}
	
	
	public ArrayList<Student> retrieveStudent() {
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		
		
		try
		{
			String sql="select * from Student";
			pStmt=con.prepareStatement(sql);
			
			ResultSet rs=pStmt.executeQuery();
			//resultset is representing data of table in database
			
			String nm="",em="",add="";
			int r=0,a=0;
			while(rs.next())
			{
				r=rs.getInt(1);
				nm=rs.getString(2);
				em=rs.getString(3);
				a=rs.getInt(4);
				add=rs.getString(5);
				
				
				
				//System.out.println(r+"\t"+nm+"\t"+em+"\t"+a+"\t"+add);
				//System.out.println("***********************************************************");
			
			Student s=new Student(r,nm,em,a,add);
			
			studentList.add(s);
			
			}
		}
		catch(Exception ex)
		{
			System.out.println("error ocured "+ex);
		}
		return studentList;
	}
	
	
	
	
	public void closeConnection() {
		try {
			if(stmt!=null)
			 stmt.close();
			
			if(con!=null)
			 con.close();
			
			if(pStmt!=null)
				pStmt.close();
			
			System.out.println("Connection closed");
			
		}
		catch(Exception ex)
		{
			System.out.println("error ocured "+ex);
		}
	}

}
