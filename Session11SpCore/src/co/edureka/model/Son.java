package co.edureka.model;

public class Son extends Father{

	int vehical;

	public Son() {
		
	}
	public Son(int vehical) {
		super();
		this.vehical = vehical;
	}

	public int getVehical() {
		return vehical;
	}

	public void setVehical(int vehical) {
		this.vehical = vehical;
	}

	@Override
	public String toString() {
		return "Father [name=" + name + ", lname=" + lname + ", wealth=" + wealth + "] Vehical : "+ vehical + "]";
	}
	
	
}
