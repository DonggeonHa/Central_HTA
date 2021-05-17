package sample1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 학생들의 이름을 입력받아서 배열에 저장하기
		
		// 1. 5명의 학생이름을 저장할 수 있는 배열을 정의한다.
		// 2. 키보드 입력을 읽어오는 Scanner객체를 생성한다.
		// 3. 반복문(for문)을 사용해서 5회 반복한다.
		//		1. 이름을 입력받는다.
		//		2. 배열에 순서대로 저장한다.
		// 4. 배열에 저장된 학생들의 이름을 반복문(향상된 for문)을 사용해서 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		String[] student = new String[5];
		
		for (int i = 0; i < student.length; i++) {
			System.out.print("학생 이름 : ");
			String name = sc.next();
			student[i] = name;
		}
		
		for (String x : student) {
			System.out.println("입력된 학생 이름 : " + x);
		}
	}
}
