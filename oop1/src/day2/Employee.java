package day2;

public class Employee {
	// 사원번호, 사원이름, 소속부서명, 직위, 급여, 커미션지급여부를 정보를 저장하는 객체를 위한 클래스다.
	int employeeNumber;
	String employeeName;
	String departmentName;
	String position;
	int salary;
	boolean commission;
	
	void printEmployeeInfo() {
		System.out.println("사원번호 : " + employeeNumber);
		System.out.println("사원이름 : " + employeeName);
		System.out.println("부서명 : " + departmentName);
		System.out.println("직위 : " + position);
		System.out.println("급여 : " + salary);
		System.out.println("커미션지급여부 : " + commission);
	}
	
}
