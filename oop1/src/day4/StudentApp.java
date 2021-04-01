package day4;

import java.util.Scanner;

public class StudentApp {
	
	public static void main(String[] args) {
		final int DISPLAY_ALL_STUDENTS = 1;
		final int DISPLAY_STUDENTS = 2;
		final int INSERT_STUDENTS = 3;
		final int UPDATE_STUDENTS = 4;
		final int EXIT = 0;
		
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		
		while (true) {
			System.out.println("=================================================================");
			System.out.println("1. 전체조회		2. 상세조회		3. 등록		4. 수정		0. 종료");
			System.out.println("=================================================================");
			
			System.out.print("메뉴를 선택하세요 : ");
			int menuNo = sc.nextInt();
			
			if (menuNo == DISPLAY_ALL_STUDENTS) {
				System.out.println("[모든 학생정보 출력]");
				
				service.displayAllStudents();
				
			} else if (menuNo == DISPLAY_STUDENTS) {
				System.out.println("[학생 상세정보 출력]");
				
				System.out.print("조회할 학생의 이름을 입력하세요 : ");
				String studentName = sc.next();
				
				service.displayStudent(studentName);
				
			} else if (menuNo == INSERT_STUDENTS) {
				System.out.println("[학생정보 등록]");
				
				System.out.print("학생명을 입력하세요 : ");
				String name = sc.next();
				System.out.print("국어점수를 입력하세요 : ");
				int kor = sc.nextInt();
				System.out.print("영어점수를 입력하세요 : ");
				int eng = sc.nextInt();
				System.out.print("수학점수를 입력하세요 : ");
				int math = sc.nextInt();
				
				Student student = new Student(name, kor, eng, math);
				service.insertStudent(student);
				
			} else if (menuNo == UPDATE_STUDENTS) {
				System.out.println("[학생정보 수정]");
				
				System.out.print("수정할 학생명을 입력하세요 : ");
				String name = sc.next();
				System.out.print("국어점수를 입력하세요 : ");
				int kor = sc.nextInt();
				System.out.print("영어점수를 입력하세요 : ");
				int eng = sc.nextInt();
				System.out.print("수학점수를 입력하세요 : ");
				int math = sc.nextInt();

				Student student = new Student(name, kor, eng, math);
				service.updateStudent(student);
				
			} else if (menuNo == EXIT) {
				System.out.println("[프로그램 종료]");
				break;
				
			} else {
				System.out.println("[##해당메뉴 존재하지 않음##]");
				continue;
			}
			System.out.println();
			System.out.println();
		}
		sc.close();
		
		
		
	}
}
