package co.edureka.model;

import java.util.List;

public class Person {

	String name;
	int age;
	 Address address;//has a relation
	 
	 List<String> certificates;
	 public Person() {
		 
	 }
	 
	public Person(String name, int age, Address address) {
		
		this.name = name;
		this.age = age;
		this.address = address;
	}
public Person( Address address) {
		
		System.out.println("construtor injection");
		this.address = address;
	}
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("setter method");
		this.address = address;
	}
	
	
	
	public List<String> getCertificates() {
		
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		System.out.println("Setter innjection for list");
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	 
	 
}
