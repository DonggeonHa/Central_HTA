
public class ForDemo1 {
	public static void main(String[] args) {
		// 수행문을 10개 실행하기
		for (int i = 0; i < 10; i ++) {
			System.out.println("안녕하세요");
		}

		System.out.println("----------------------------------");

		for (int i=10; i > 0; i--) {
			System.out.println("안녕하세요");
		}

		System.out.println("-----------------------------------");

		// 1 ~ 10 까지 출력하기
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}

		System.out.println("-----------------------------------");

		// 구구단 출력하기
		int dan = 2;
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + (dan*i));
		}

		System.out.println("-----------------------------------");

		// 합계 구하기
		// 1 ~ 100까지 합계를 구하고 출력한다.
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i; 	// sum = sum + i 랑 같다.
		}
		
		System.out.println("합계 : " + sum);
		
		System.out.println("-----------------------------------");
		
		// 합계 구하기
		// 1001 ~ 2000까지 합계를 구하고 출력한다
		sum = 0;
		for (int i = 1004; i <= 2000; i++) {
			sum += i;
		}
		
		System.out.println("합계 : " + sum);
	}
}
