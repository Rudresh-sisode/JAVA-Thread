package co.hb.model;

public class Employee {

	Integer eid;
	String name;
	String email;
	int age;
	String address;
	public Employee() {
		
	}
	
	public Employee(Integer eid, String name, String email, int age, String address) {
		
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", age=" + age + ", address=" + address
				+ "]";
	}
	
	
	
	
	
	
}
