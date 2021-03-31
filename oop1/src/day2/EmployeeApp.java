package day2;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.employeeNumber = 1123;
		employee.employeeName = "홍길동";
		employee.departmentName = "인사과";
		employee.position = "과장";
		employee.salary = 3_000_000;
		employee.commission = false;
		
		
		employee.printEmployeeInfo();
	}
}
