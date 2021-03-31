
public class ArrayDemo9 {
	public static void main(String[] args) {
		// 학생 성적 관리하기
		/*
		 * 학생들의 이름을 저장하는 1차원 배열이 있다.
		 * 학생들의 국어, 영어, 수학 점수를 저장하는 2차원 배열이 있다.
		 * 
		 * ["김유신", "강감찬", "이순신", "홍길동"]
		 * 
		 * 국어		영어	수학 <--- 실제 배열에 저장되는 값은 아님
		 * 100		100		100 <--- 김유신의 성적
		 * 90		70		80 <--- 강감찬의 성적
		 * 70		60		40 <--- 이순신의 성적
		 * 100		80		90 <--- 홍길동의 성적
		 */
		
		String[] names = {"김유신", "강감찬", "이순신", "홍길동"};
		//
		int[][] scores = { {100, 100, 100},
						   {90, 70, 80}, 
						   {70, 60, 40}, 
						   {100, 80, 90} };
		
		System.out.println("### 김유신 학생의 성적정보 출력하기");
		for (int score : scores[0]) {
			System.out.printf("%5d", score);
		}
		System.out.println();
		
		System.out.println("### 국어과목의 총점과 평균을 계산하고, 출력하기");
		int korTotal = 0;
		int korAverage = 0;
		for (int[] row : scores) {
			korTotal += row[0];
		}
		korAverage = korTotal / scores.length;
		System.out.println("국어과목 총점 : " + korTotal + ", 평균 : " + korAverage);
		
		
		/*
		 * ==== 학생 성적 정보 ==============================
		 * 이름			국어	영어	수학	총점	평균
		 * 김유신		100		100		100		300		100
		 * 강감찬		90		70		80		240		80
		 * 이순신		70		60		40		170		56
		 * 홍길동		100		80		90		270		90
		 * ---------------------------------------------------
		 * 				360		310		310		
		 * 				90		78		78
		 */
		
		System.out.println("====== 학생 성적 정보 ===================================");
		System.out.printf("%6s%6s%6s%6s%6s%6s\n", "이름", "국어", "영어", "수학", "총점", "평균");
		for (int i = 0; i < names.length; i++) {			// names 배열에 저장된 학생들의 수 만큼 반복작업
			int total = 0;									// 각 학생의 총점을 저장할 변수
			int average = 0;								// 각 학상의 평균을 저장할 변수
			
			String name = names[i];							// names배열에서 i번째 이름을 조회한다.
			System.out.printf("%6s", name);					// 조회된 학생이름을 출력한다
			
			int[] myScores = scores[i];						// 점수배열에서 i번째 행의 배열을 조회한다( 한 학생
			for (int score : myScores) {					// myScores배열에서 순서대로 국어, 영어, 수학점수
				total += score;								// total에 각 점수를 더한다
				System.out.printf("%7d", score);			// 각 점수를 화면에 출력한다
			}	
			average = total / 3;							// 평균을 계산한다
			System.out.printf("%7d%7d", total, average);	// 총점과 평균을 출력한다
			System.out.println();							// 줄바꿈 문자를 출력한다.
		}
		System.out.println("=========================================================");
	}
}
