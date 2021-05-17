
public class ArrayDemo7 {
	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * 		1차원 배열
		 * 			int[] x = new int[3]
		 * 			int[] x = {1, 2, 3, 4, 5}
		 * 		2차원 배열
		 * 			String[][] x = new String[2][3];
		 * 			String[][] x = {{"김유신","강감찬","이순신"}, {"홍길동","임꺽정","장길산"}};
		 * 
		 * 				   0		 1		   2
		 * 			  -------------------------------	
		 * 			0ㅣ"김유신"ㅣ"강감찬"ㅣ"이순신"ㅣ
		 * 			  -------------------------------
		 * 			1ㅣ"홍길동"ㅣ"임꺽정"ㅣ"장길산"ㅣ
		 * 			  -------------------------------
		 */
		
		// 다차원배열(2행 3열 다차원 배열) 생성하기
		int[][] scores = {{70, 50, 80}, {100, 80, 10}};
		
		// 다차원 배열의 값 출력하기
		System.out.println(scores[0][0]);	// 70
		System.out.println(scores[0][1]);	// 50
		System.out.println(scores[0][2]);	// 80
		
		System.out.println(scores[1][0]);	// 100
		System.out.println(scores[1][1]);	// 80
		System.out.println(scores[1][2]);	// 10
		
		// for문을 사용해서 다차원 배열의 모든 값을 출력하기
		for (int i = 0; i < scores.length; i++) {		// 행의 갯수
			for (int j = 0; j < scores[i].length; j++) {	// 열의 갯수
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
	}
}
