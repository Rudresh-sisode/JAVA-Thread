package co.edureka;

import java.util.Date;

public class Conversion {
//web method
	public int mtrsToCms(int mtrs) {
		int cms=mtrs * 100;
		return cms;
	}
	
	public int feetToInches(int feets) {
		int inches=feets * 12;
		return inches;
	}
	
	public int dollarsToRupees(int dollars) {
		
		int ruppes=dollars * 67;
		return ruppes;
	}
	public String sayHello(String name) {
		String hello="Hey, "+name+"\tits "+new Date();
		return hello;
	}
	public String registerUser(String email,String password) {
		String resp="hello "+email+"\nyour account created !";
		return resp;
		
	}
}
