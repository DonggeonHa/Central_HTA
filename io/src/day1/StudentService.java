package day1;

import java.util.ArrayList;

public class StudentService {
	
	private StudentRepository repository = new StudentRepository();

	// 모든 학생정보를 제공하는 서비스
	public ArrayList<Student> getAllStudentList() {
		return repository.getAllStudents();
	}
	
	// 이름으로 학생정보를 조회하는 서비스
	public Student findStudent(String name) {
		return null;
	}
	
	// 새로운 학생정보를 추가하는 서비스
	public void addNewStudent(Student student) {
		// 동일한 학생이 있는지 확인하고 예외발생시키기
		// 동일한 학생이 없으면 repository의 insertStudent(student) 메소드 실행하기
		repository.insertStudent(student);
	}
	
	// 이름으로 학생정보를 삭제하는 서비스
	
	// 성적순으로 학생정보를 정렬해서 제공하는 서비스
	
	// 모든 학생정보를 파일로 저장하는 서비스
	public void saveAllStudentData() {
		repository.saveData();
	}
	
}
