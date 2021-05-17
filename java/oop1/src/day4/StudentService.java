package day4;

public class StudentService {

	Student[] students = new Student[100];
	int position = 0;
	
	StudentService() {
		students[position++] = new Student("홍길동", 100, 100, 100);
		students[position++] = new Student("김유신", 90, 60, 80);
		students[position++] = new Student("강감찬", 80, 90, 60);
		students[position++] = new Student("이순신", 50, 30, 70);
		students[position++] = new Student("유관순", 90, 50, 50);
		students[position++] = new Student("안중근", 80, 70, 80);
	}
	
	// 전체 학생의 성적정보를 조회한다.
	void displayAllStudents() {
		System.out.println("=== 전체 학생 정보 ===============================");
		System.out.printf("%-10s%5s%5s\n", "학생명", "총점", "평균");
		
		for (Student student : students) {
			if (student == null) {
				break;
			}
			System.out.printf("%-10s%7d%7d\n", student.name, student.total, student.avg);
		}
		System.out.println("==================================================");
	}
	
	// 지정된 학생의 성적정보를 조회한다.
	void displayStudent(String name) {
		
		// 전달받은 이름과 일치하는 학생정보(Student객체)의 주소값을 저장할 변수
		// for문을 사용해서 학생정보를 검색한 후, foundStudent의 값이 null이면
		// 전달받은 이름과 일치하는 학생정보는 존재하지 않는 것이다.
		Student foundStudent = null;
		for (Student student : students) {
			// student가 null이면 이제부터 배열에는 학생정보가 저장된 것이 없다. 
			if (student == null) {
				break;
			}
			// student가 null이 아닌 경우 실행되는 코드다.
			if (name.equals(student.name)) {
				foundStudent = student;
				break;
			}
		}
		
		// foundStudent가 null이면 검색된 학생정보가 존재하지 않은 경우다.
		System.out.println("=== 학생 상세 정보 ===============================");
		if (foundStudent == null) {
			System.out.println("["+ name +"] 학생이 존재하지 않습니다.");
		} else {
			System.out.println("학생이름 : " + foundStudent.name);
			System.out.println("국어점수 : " + foundStudent.kor);
			System.out.println("영어점수 : " + foundStudent.eng);
			System.out.println("수학점수 : " + foundStudent.math);
			System.out.println("총점수 : " + foundStudent.total);
			System.out.println("평균 : " + foundStudent.avg);
		}
		System.out.println("==================================================");
	}
	
	// 학생정보를 등록한다.
	void insertStudent(Student student) {
		students[position++] = student;
		System.out.println("### 새로운 학생정보가 등록되었습니다.");
	}
	
	// 학생정보를 수정한다.
	void updateStudent(Student student) {
		Student foundStudent = null;
		for (Student studentItem : students) { 
			if (studentItem == null) {
				break;
			}
			if ( student.name.equals(studentItem)) {
				foundStudent = studentItem;
				break;
			}
		}
		if (foundStudent == null) {
			System.out.println("["+student.name+"] 학생이 존재하지 않습니다.");
		} else {
			foundStudent.kor = student.kor;
			foundStudent.eng = student.eng;
			foundStudent.math = student.math;
			foundStudent.total = student.total;
			foundStudent.avg = student.avg;
			
		}
	}
}
