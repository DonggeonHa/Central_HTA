package sample6;

import java.util.ArrayList;
import java.util.Iterator;

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
			System.out.println("신청자수 : " + course.getRegisteredCount());
			System.out.println("--------------------------------");
			System.out.println();
		}
	}
	
	// 수강 신청 기능
	// 학생번호, 과정번호를 전달받아서 registrations가 참조하는 ArrayList객체에 저장하는 기능
	// * 이미 신청한 과목은 신청할 수 없음
	// * 정원이 부족하면 신청할 수 없음
	// * 신청자수를 1증가시킨다.
	public void addRegistration(int studentNo, int courseNo) {
		// 이미 신청한 과정이면 메소드 실행을 중단
		// 정원이 다 채워졌으면 메소드 실행을 중단
		for (Registration reg : registrations) {
			if (reg.getStudNo() == studentNo && reg.getCourseNo() == courseNo) {
				System.out.println("[안내] 해당 과정은 이미 수강신청한 과정입니다.");
				return; // 메소드 실행 즉시 중단.
			}
		}
		
		Course foundCourse = null;
		for (Course course : courses) {
			if (course.getCourseNo() == courseNo) {
				foundCourse = course; // 과정번호에 해당하는 과정을 found
				break; // 반복 탈출
			}
		}
		
		if (foundCourse.getQuota() == foundCourse.getRegisteredCount()) {
			System.out.println("[안내] 해당 과정은 모집정원이 다 채워졌습니다.");
			return; // 메소드 실행 즉시 중단.
		}
		
		// 수강신청정보 생성, 학번, 과정번호 저장
		// 새 수강신청정보 ArrayList에 저장
		Student foundStudent = null;
		for (Student student : students) {
			if (student.getStudentNo() == studentNo) {
				foundStudent = student;
				break;
			}
		}
		registrations.add(new Registration(foundStudent.getStudentNo(), foundCourse.getCourseNo()));
		
		// 해당과정의 신청자수 1 증가
		foundCourse.setRegisteredCount(foundCourse.getRegisteredCount() + 1);
	}
	
	// 신청 취소 기능
	// 학생번호, 과정번호를 전달받아서 registrations가 참조하는 ArrayList객체에서 해당 과정을 삭제
	public void cancelRegistration(int studentNo, int courseNo) {
		// registrations에서 Registration 객체 삭제
		// Iterator를 이용해야 함.
		Iterator<Registration> iter = registrations.iterator();
		
		Course foundCourse = null;
		for (Course course : courses) {
			if (course.getCourseNo() == courseNo) {
				foundCourse = course; // 과정번호에 해당하는 과정을 found
				break; // 반복 탈출
			}
		}
		
		while (iter.hasNext()) {
			Registration registration = iter.next();
			if (registration.equals(new Registration(studentNo, courseNo)) ) {
				iter.remove();
			}
		}
		
		// 해당과정의 신청자수 1 감소
		foundCourse.setRegisteredCount(foundCourse.getRegisteredCount() - 1);
	}
	// 나의 수강신청과정 조회하기
	// 학번을 전달받아서 그 학생이 수강신청한 과정을 출력하는 기능
	public void displayAllRegistrations(int studentNo) {
		
		Registration foundReg = null;
		for (Registration reg : registrations) {
			if (reg.getStudNo() == studentNo) {
				foundReg = reg;
				break;
			}
		}
		
		for (Course course : courses) {
			if (course.getCourseNo() == foundReg.getCourseNo()) {
				System.out.println("---------------------------------------");
				System.out.println("학생번호 : " + studentNo);
				System.out.println("과정넘버 : " + course.getCourseNo());
				System.out.println("과정이름 : " + course.getCourseName());
				System.out.println("정원 : " + course.getQuota());
				System.out.println("---------------------------------------");
				System.out.println();
			}
		}
		
		
	}
}
