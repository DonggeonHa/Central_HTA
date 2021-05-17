package sample6;

public class Student {

	private int studentNo;
	private String studentName;
	private String dept;
	private int grade;
	
	Student() {}

	public Student(int studentNo, String studentName, String dept, int grade) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.dept = dept;
		this.grade = grade;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
