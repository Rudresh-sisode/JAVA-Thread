package co.edureka.bean;

import java.util.Date;

public class User {
	
	String name;
	int age;
	
	//business method: where we process the logic

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void loginUser(String email,String password) {
		System.out.println("*****user login started*****");
		//..
		//..
		//..interacting with jdbc or hibernate
		if(email.equals("admine@gmail.com") && password.equals("passok"))
		{
			System.out.println("Welcome admin "+name);
			System.out.println("it's "+new Date());
		}
		System.out.println("****User login finish*********");
	}
}
