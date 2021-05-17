import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 학생이름, 전자계산기, 데이터베이스, 알고리즘 점수를 입력받는다.
		 * 학생이름, 각 과목점수, 총점, 평균, 합격여부를 출력한다.
		 * 평균이 60점 이상이면 합격이다.
		 * 평균이 60점 이상이지만 한 과목이라도 40점 미만인 경우는 불합격이다. 
		 */
		
		
		System.out.printf("이름 : ");
		String name = sc.next();
		System.out.printf("전자계산기 점수 : ");
		int calculator = sc.nextInt();
		System.out.printf("데이터베이스 점수 : ");
		int database = sc.nextInt();
		System.out.printf("알고리즘 점수 : ");
		int algorithm = sc.nextInt();
		
		int totalScore = calculator + database + algorithm;
		double avg = totalScore / 3;
		
		String status = "";
		if (avg >= 60) {
			if(calculator >= 40 && database >= 40 && algorithm >= 40) {
				status = "합격";
			} else {
				status = "불합격(과락)";
			}
		} else {
			status = "불합격";
		}
		
		System.out.println("==============================================");
		System.out.println("이름 : " + name);
		System.out.println("전자계산기 점수 : " + calculator);
		System.out.println("데이터베이스 점수 : " + database);
		System.out.println("알고리즘 점수 : " + algorithm);
		System.out.println("총 점수 : " + totalScore);
		System.out.println("평균 : " + avg);
		System.out.println("합격여부 : " +  status);
		System.out.println("==============================================");
		
		sc.close();

	}

}
