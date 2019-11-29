package com;

public class Person {
	int pid;
	String name;
	String email;
	int age;
	
	Address adrs;
	//has a relationship

	public Person() {
		
	}
	public Person(int pid, String name, String email, int age, Address adrs) {
		
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.age = age;
		this.adrs = adrs;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", email=" + email + ", age=" + age + ", adrs=" + adrs + "]";
	}
	
	
	
	

}
