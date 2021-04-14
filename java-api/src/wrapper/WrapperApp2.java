package wrapper;

public class WrapperApp2 {

	public static void main(String[] args) {
		
		// 오토박싱이 지원되기 때문에
		// 기본자료형 탕비의 변수에 값을 대입하는 것과 Wrapper 타입의 변수에 값을 대입하는 것을
		// 구분없이 사용할 수 있다.
		String name = "홍길동";
		int age = 30;
		Double height = 180.4; // Double height = new Double(180.4);
		double weight = 78.2;
		Boolean isMarried = false;
		Integer savedPoint = 10000;
		
		// 오토박싱이 지원되기 때문에
		// Wrapper 타입의 배열에 기본자료형 값만 적어도 된다.
		Integer[] scores = {100, 100, 80, 100, 50, 60, 70, 80, 50, 60};
		// Integer[] scores = {new Interger(100), new Interger(90), new Interger(80), ...}
		
		
		int total1 = 0;
		for (Integer score : scores) {
			// 오토언박싱이 지원되기 때문에
			// Wrapper타입의 참조변수가 사칙연산자를 만나면 Wrapper 객체에 저장된 값만 가져와서
			// 사칙연산에 사용된다.
			total1 += score;	
		}
		
		System.out.println("총합: " + total1);
		
		int total2 = 0;
		// 오토언박싱이 지원되기 때문에
		// 배열에서 순서대로 조회되는 것이 Wrapper(래퍼)타입의 객체라면
		// 그 타입과 대응되는 기본자료형 타입의 변수를 선언해서 값만 사용할 수 있다.
		for (int score : scores) {
			total2 += score;
		}
		System.out.println("총합: " + total2);
	}
}
