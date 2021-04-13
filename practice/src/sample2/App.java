package sample2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 학생정보를 입력받아서 배열에 저장하기
		
		// 1. 5명의 학생정보를 저장할 수 있는 배열을 정의한다.
		// 2. 키보드 입력을 읽어오는 Scanner객체를 생성한다.
		// 3. 반복문(for문)을 사용해서 5회 반복한다.
		//		1. 이름, 국어, 영어, 수학점수를 각각 입력받는다.
		//		2. Student객체를 생성해서 입력받은 이름, 국어, 영어, 수학점수를 객체에 저장한다.
		//		3. 배열에 순서대로 저장한다.
		// 4. 배열에 저장된 학생들의 정보를 반복문(향상된 for문)을 사용해서 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		Student[] students = new Student[5];
		
		for (int i = 0; i < students.length; i++) {
			System.out.print("학생 이름 : ");
			String name = sc.next();
			
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			Student s = new Student(name, kor, eng, math);
			students[i] = s;
		}
		
		for (Student s : students) {
			System.out.println(s.toString());
			// System.out.println("이름 : " + s.getName() + ", 국어 : " + s.getKor() + ", 영어 : " + s.getEng() + ", 수학 : " + s.getMath());
		}
		
		sc.close();
	}
}
