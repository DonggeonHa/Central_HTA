package sample5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import sample4.Product;

public class App {
	
	public static void printStudent(Student student) {
		System.out.println("-----------------------------------------------");
		System.out.println("학생이름 : " + student.getName());
		System.out.println("국어점수 : " + student.getKor());
		System.out.println("영어점수 : " + student.getEng());
		System.out.println("수학점수 : " + student.getMath());
		System.out.println("합계점수 : " + student.getTotal());
		System.out.println("평균점수 : " + student.getAverage());
		System.out.println("-----------------------------------------------");
	}

	public static void main(String[] args) {
		/*
		 * 학생성적 관리 프로그램
		 * 1. 학생 성적정보 입력기능
		 * 		이름, 국어, 영어, 수학점수를 입력받아서 ArrayList에 저장
		 * 2. 학생 성적정보 전체 조회 기능
		 * 		ArrayList에 저장된 학생들의 이름, 총점, 평균을 출력
		 * 3. 학생 성적정보 상세 조회 기능
		 * 		학생이름을 입력받아서 그 학생의 이름, 국어, 영어, 수학, 총점, 평균을 출력
		 * 4. 학생 성적정보 성적순 출력 기능(고득점 -> 저득점 : 총점기준 sort)
		 * 		Comparable<T> 혹은 Comparator<T>를 이용해서 총점이 높은 학생부터
		 * 
		 */
		ArrayList<Student> students = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		
		students.add(new Student("하동건", 100, 100, 100));
		students.add(new Student("박인규", 50, 100, 80));
		students.add(new Student("서수종", 80, 40, 100));
		
		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("|		학생성적 관리 프로그램	 	   |");
			System.out.println("| 1. 학생 성적정보 입력기능		  	   |");
			System.out.println("| 2. 학생 성적정보 전체 조회 기능 		   |");
			System.out.println("| 3. 학생 성적정보 상세 조회 기능 		   |");
			System.out.println("| 4. 학생 성적정보 성적순 출력 기능(고득점->저득점)|");
			System.out.println("| 0. 종료					   |");
			System.out.println("----------------------------------------------------");
			
			System.out.print("메뉴를 선택하세요 : ");
			int menuNo = scanner.nextInt();
			
			if (menuNo == 1) {
				System.out.println("[학생 성적정보 입력]");
				System.out.print("학생이름 : ");
				String name = scanner.next();
				System.out.print("국어점수 : ");
				int kor = scanner.nextInt();
				System.out.print("영어점수 : ");
				int eng = scanner.nextInt();
				System.out.print("수학점수 : ");
				int math = scanner.nextInt();
				
				students.add(new Student(name, kor, eng, math));
				
			} else if(menuNo == 2) {
				System.out.println("[학생 성적정보 전체 조회 기능]");
				
				for (Student student : students) {
					if (student == null) {
						System.out.println("[에러] 입력한 정보가 없습니다.");
						break;
					}
					
					System.out.println("-----------------------------------------------");
					System.out.println("학생이름 : " + student.getName());
					System.out.println("합계점수 : " + student.getTotal());
					System.out.println("평균점수 : " + student.getAverage());
					System.out.println("-----------------------------------------------");
				}
			} else if (menuNo == 3) {
				System.out.println("[학생 성적정보 상세 조회 기능]");
				System.out.print("학생이름 : ");
				String name = scanner.next();
				
				Boolean isExist = false;
				
				for (Student student : students) {
					if (student == null) {
						System.out.println("[에러] 입력한 정보가 없습니다.");
						break;
					}
					
					if (name.equals(student.getName())) {
						isExist = true;
						App.printStudent(student);
					}
				}
				
				if (!isExist) {
					System.out.println("[" + name + "] 은(는) 존재하지 않습니다.");
				}
			} else if (menuNo == 4) {
				System.out.println("[학생 성적정보 성적순 출력 기능]");
				Collections.sort(students, (o1, o2) -> o1.getTotal() - o2.getTotal());
				Collections.reverse(students);
				for (Student student : students) {
					if (student == null) {
						break;
					}
					
					System.out.println(student.getName() + "\t" + student.getTotal());
				}
				
			} else if (menuNo == 0) {
				System.out.println("[종료]");
				break;
			}
		}
		
		scanner.close();
	}
}
