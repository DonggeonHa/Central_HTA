package sample6;

import java.util.ArrayList;

public class SchoolRepo {

	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ArrayList<Registration> registrations = new ArrayList<Registration>();
	
	public SchoolRepo() {
		// 학생등록
		students.add(new Student(10, "홍길동", "컴퓨터공학과", 2));
		students.add(new Student(11, "김유신", "컴퓨터공학과", 1));
		students.add(new Student(12, "강감찬", "컴퓨터공학과", 2));
		students.add(new Student(13, "이순신", "정보통신학과", 1));
		students.add(new Student(14, "류관순", "정보통신학과", 2));
		
		// 과정등록
		courses.add(new Course(100, "컴퓨터개론", 5));
		courses.add(new Course(101, "소프트웨어공학", 5));
		courses.add(new Course(102, "데이터베이스", 5));
		courses.add(new Course(103, "운영체제", 5));
		courses.add(new Course(104, "컴퓨터구조", 5));
		courses.add(new Course(105, "이산수학", 5));
		courses.add(new Course(106, "프로그래밍 기초", 5));
	}
	
	// 학생 등록 기능
	// 학생정보를 전달받아서 students에 참조하는 ArrayList객체에 저장하는 기능
	public void addStudent(Student student) {
		students.add(student);
	}
	
	// 과정 등록 기능
	// 과정정보를 전달받아서 courses가 참조하는 ArrayList객체에 저장하는 기능
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	// 과정 조회 기능
	// courses가 참조하는 ArrayList객체에 저장된 모든 과정정보를 출력하는 기능
	public void displayAllCourses() {
		for (Course course : courses) {
			System.out.println("--------------------------------");
			System.out.println("과정넘버 : " + course.getCourseNo());
			System.out.println("과정이름 : " + course.getCourseName());
			System.out.println("정원 : " + course.getQuota());
			System.out.println("--------------------------------");
			System.out.println();
		}
	}
	
	// 수강 신청 기능
	// 학생번호, 과정번호를 전달받아서 registrations가 참조하는 ArrayList객체에 저장하는 기능
	// * 이미 신청한 과목은 신청할 수 없음
	// * 정원이 부족하면 신청할 수 없음
	public void addRegistration(int studentNo, int courseNo) {
		// 1. 학생번호에 해당하는 학생이 그 과정을 신청했는지 확인하기
		// 2. 그 과정에 정원이 충분한지 확인하기
		// 3. registrations가 참조하는 ArrayList에 등록정보 추가하기
		// 4. 해당 과정의 신청자수를 1 증가시키기
		for (Student student : students) {
			if (studentNo == student.getStudentNo()) {
				
			}
		}
		
	}
	
	// 신청 취소 기능
	// 학생번호, 과정번호를 전달받아서 registrations가 참조하는 ArrayList객체에서 해당 과정을 삭제
	public void cancelRegistration(int studentNo, int coureseNo) {
		
	}
	// 나의 수강신청과정 조회하기
	// 학번을 전달받아서 그 학생이 수강신청한 과정을 출력하는 기능
	public void displayAllRegistrations(int studentNo) {
		
	}
}
