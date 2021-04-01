package day4;

public class EmployeeApp {

	public static void main(String[] args) {
		
		System.out.println("### 객체 생성후 기본 생성자가 실행되도록 한 경우"); 
		Employee e1 = new Employee();
		e1.printEmployeeInfo();
		
		System.out.println("### 객체 생성후 번호, 이름, 급여를 초기화시키는 생성자가 실행되도록 한 경우");
		Employee e2 = new Employee(100, "강감찬", 300);
		Employee e3 = new Employee(200, "이순신", 280);
		e2.printEmployeeInfo();
		e3.printEmployeeInfo();
		
		System.out.println("### 객체 생성후 모든 멤버변수를 초기화시키는 생성자가 실행되도록 한 경우");
		Employee e4 = new Employee(500, "홍길동", "경영지원팀", "부장", 700, 0);
		Employee e5 = new Employee(600, "김유신", "해외영업1팀", "대리", 380, 0.03);
		e4.printEmployeeInfo();
		e5.printEmployeeInfo();
	}
}
