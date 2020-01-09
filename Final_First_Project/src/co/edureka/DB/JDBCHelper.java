package co.edureka.DB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.AddUser;
import co.edureka.model.TransAccount;
import co.edureka.model.User;

public class JDBCHelper {
	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	CallableStatement cStmt;
	//load the driver
	public JDBCHelper() {
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
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
			String url="jdbc:mysql://localhost/myproject?serverTimezone=UTC";
			//String url="jdbc:mysql://localhost/edureka?serverTimezone=UTC";
			con=DriverManager.getConnection(url,user,password);
			
			System.out.println("Connection created");
			
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured : "+ex);
		}
	}
	
	//3. sql statment
	public void  insertAccount(AddUser insert1) {
	
		try
		{
			String sql="insert into account values(null,?,?,?,?,?)";
			
			/*pStmt=con.prepareStatement(sql);
			pStmt.setString(1, user.Email);
			pStmt.setString(2, user.Pass);
			//pStmt.setString(3, );
			*/
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1,insert1.name);
			pStmt.setString(2, insert1.date);
			pStmt.setString(3, insert1.address);
			pStmt.setString(4, insert1.email);
			pStmt.setString(5, insert1.accountType);
			
			pStmt.executeUpdate();
			
			System.out.println("Student inserted");
			
			
		}
		catch(Exception ex)
		{
			System.out.println("error ocured "+ex);
		}

	}
	/*
	 * Auth for transaction
	 */
	 
	public boolean Auth(TransAccount account) {
		boolean auth=true;
		
		try {
			
			String sql="select * from transac where accountNo=?";
			pStmt=con.prepareStatement(sql);
			pStmt.setString(1, account.accountnum);			
			ResultSet rs=pStmt.executeQuery();
			auth=rs.next();
			
		}
		catch(Exception ex) {
			System.out.println("Some exception occured "+ex);
		}
		
		return auth;
	}
	
	public boolean authenticateUser(User user)
	{
		boolean auth=true;
		
		try
		{
			
			String sql="select * from register where username=? and password=?";
			
			pStmt=con.prepareStatement(sql);
			pStmt.setString(1, user.Email);
			pStmt.setString(2, user.Pass);
			
			ResultSet rs=pStmt.executeQuery();
			auth=rs.next();
			System.out.println("Auth is :"+auth);
			
		}
		catch(Exception ex)
		{
			System.out.println("Some exception occured "+ex);
		}
		
		
	
		return auth;
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
