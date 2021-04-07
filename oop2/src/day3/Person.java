package day3;

public class Person {
	
	private String name;
	private String email;
	private String tel;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, String email, String tel) {
		this.name = name;
		this.email = email;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getTel() {
		return tel;
	}
	
	public void displayInfo() {
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("연락처 : " + tel);
	}
}
