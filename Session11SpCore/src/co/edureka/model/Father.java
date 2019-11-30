package co.edureka.model;

public class Father {

	String name;
	String lname;
	int wealth;
	
	public Father() {
		
	}
	public Father(String name, String lname, int wealth) {
		super();
		this.name = name;
		this.lname = lname;
		this.wealth = wealth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getWealth() {
		return wealth;
	}
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	@Override
	public String toString() {
		return "Father [name=" + name + ", lname=" + lname + ", wealth=" + wealth + "]";
	}
	
	
}
