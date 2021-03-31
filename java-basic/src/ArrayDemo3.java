
public class ArrayDemo3 {

	public static void main(String[] args) {
		// 배열의 활용
		String[] names = {"김유신", "홍길동", "이순신"};
		int[] korScores = {100, 90, 50};
		int[] engScores = {100, 80, 20};
		int[] mathScores = {100, 70, 30};
		
		// 이번에 수업에 참여한 모든 학생의 이름을 출력하시오
		System.out.println("### 수강신청 학생 목록 ###");
		for (String x : names) {
			System.out.println("학생이름 : " + x);
		}
		
		System.out.println("### 김유신 학생의 국어, 영어, 수학 점수 ###");
		// 김유신 학생의 성적을 전부 출력하시오.
		System.out.println(names[0] + "," + korScores[0] + "," +engScores[0] + "," + mathScores[0]);
		
		// 국어 점수의 평균을 출력하시오.
		System.out.println("### 국어점수의 총점과 평균 ###");
		int korTotal = 0;
		int korAverage = 0;
		for (int kor : korScores) {
			korTotal += kor;	// korTotal += 100; korTotal += 90; korTotal += 50; 실행
		}
		korAverage = (int) (korTotal / korScores.length);
		System.out.println("국어 점수 총합 : " + korTotal);
		System.out.println("국어 점수 평균 : " + korAverage);
		
		
		// 수학 점수의 평균을 출력하시오.
		System.out.println("### 수학점수의 총점과 평균 ###");
		int mathTotal = 0;
		int mathAverage = 0;
		for (int math : mathScores) {
			mathTotal += math;	// korTotal += 100; korTotal += 90; korTotal += 50; 실행
		}
		mathAverage = (int) (mathTotal / mathScores.length);
		System.out.println("수학 점수 총합 : " + mathTotal);
		System.out.println("수학 점수 평균 : " + mathAverage);
		
		// 영어 점수의 평균을 출력하시오.
		System.out.println("### 영어점수의 총점과 평균 ###");
		int engTotal = 0;
		int engAverage = 0;
		for (int eng : engScores) {
			engTotal += eng;	// korTotal += 100; korTotal += 90; korTotal += 50; 실행
		}
		engAverage = (int) (engTotal / engScores.length);
		System.out.println("영어 점수 총합 : " + engTotal);
		System.out.println("영어 점수 평균 : " + engAverage);
		
		// 각 학생별 학생이름, 국어, 영어, 수학점수, 총점, 평균점수를 출력하시오.
		System.out.println("### 전체 학생 성적정보 출력 ###");
		for (int i = 0; i < names.length; i++) {
			String studentName = names[i];
			int kor = korScores[i];
			int eng = engScores[i];
			int math = mathScores[i];
			
			int total = kor + eng + math;
			int average = (int) (total / names.length);
			
			// System.out.println(studentName + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + average);
			System.out.printf("%s%5d%5d%5d%5d%5d\n", studentName, kor, eng, math, total, average);
		}
		

	}

}
