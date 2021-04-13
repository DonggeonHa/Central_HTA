package object;

public class Person {

	private int no;
	private String name;
	private String email;
	
	public Person(int no, String name, String email) {
		this.no = no;
		this.name = name;
		this.email = email;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	
	@Override
	public String toString() {
		return "Person [no=" + no + ", name=" + name + ", email=" + email + "]";
	}
	

	
	
	
}
