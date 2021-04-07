package day3;

public class PersonApp {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "hong@gmail.com", "010-1234-5678", 3, "컴퓨터공학과");
		student.displayInfo();
		System.out.println();
		
		Professor professor = new Professor("김유신", "kim@naver.com", "010-5678-1234", "컴퓨터공학과", "정교수");
		professor.displayInfo();
		
	}
}
