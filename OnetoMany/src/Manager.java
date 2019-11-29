import java.util.List;

public class Manager {

	int mid;
	String name;
	String email;
	
	List<Certification> clist;//one to many
	//has a relation ship

	public Manager() {
		
	}
	public Manager(int mid, String name, String email, List<Certification> clist) {
		
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.clist = clist;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
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

	public List<Certification> getClist() {
		return clist;
	}

	public void setClist(List<Certification> clist) {
		this.clist = clist;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", email=" + email + ", clist=" + clist + "]";
	}
	
	
}
