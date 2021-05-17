
public class IfDemo1 {

	public static void main(String[] args) {
		
		System.out.println("프로그램을 시작합니다.");
		
		// 성적이 60점 이상이면 "합격입니다"를 출력한다.
		// 그 외의 경우는 "불합격입니다"를 출력한다.
		int score = 58;
		
		/*
		 * 조건연산자로 표현하기
		 * String message = score >= 60 ? "합격입니다" :  "불합격입니다";
		 * System.out.println(message);
		 */
		
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
		System.out.println("프로그램을 종료합니다.");

	}

}
