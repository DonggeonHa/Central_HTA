package sample6;

import java.util.Scanner;

public class SchoolApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SchoolRepo repo = new SchoolRepo();
		
		while (true) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.과정조회  2.수강신청  3.수강철회 4.수강신청내역조회 0.종료");
			System.out.println("------------------------------------------------------------");
			
			System.out.print("메뉴를 선택하세요 : ");
			int menuNo = scanner.nextInt();
			System.out.println();
			
			if (menuNo == 1) {
				System.out.println("[전체 개설 과정 조회]");
				repo.displayAllCourses();
			} else if (menuNo == 2) {
				System.out.println("[수강 신청]");
				System.out.print("학생 번호를 입력해주세요 : ");
				int studentNo = scanner.nextInt();
				System.out.print("과정 번호를 입력해주세요 : ");
				int courseNo = scanner.nextInt();
				
				repo.addRegistration(studentNo, courseNo);
				
			} else if (menuNo == 3) {
				System.out.println("[신청 철회]");
				System.out.print("학생 번호를 입력해주세요 : ");
				int studentNo = scanner.nextInt();
				System.out.print("신청 철회할 과정번호를 입력해주세요 : ");
				int courseNo = scanner.nextInt();
				
				repo.cancelRegistration(studentNo, courseNo);
				
			} else if (menuNo == 4) {
				System.out.println("[수강신청 내역]");
				System.out.print("학생 번호를 입력해주세요 : ");
				int studentNo = scanner.nextInt();
				
				repo.displayAllRegistrations(studentNo);
			} else if (menuNo == 0) {
				System.out.println("[프로그램 종료]");
				break;
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		scanner.close();
	}
}
