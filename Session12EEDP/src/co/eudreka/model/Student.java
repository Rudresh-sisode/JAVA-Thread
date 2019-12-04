package co.eudreka.model;

public class Student {

	public int roll;
	public int age;
	public String name;
	public String Address;
	
	public Student() {
		
	}

	public Student(int roll, int age, String name, String address) {
	
		this.roll = roll;
		this.age = age;
		this.name = name;
		Address = address;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", age=" + age + ", name=" + name + ", Address=" + Address + "]";
	}
	
}
