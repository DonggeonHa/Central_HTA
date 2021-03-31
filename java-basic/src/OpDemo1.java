
public class OpDemo1 {

	public static void main(String[] args) {
		// 사칙연산자
		
		int num1 = 1;
		int num2 = 2;
		double num3 = 3.0;
		double num4 = 4.0;
		
		System.out.println(num1 + num2); // 7
		System.out.println(num1 - num2); // -1
		System.out.println(num1 * num2); // 12
		System.out.println(num1 / num2); // 0		정수/정수는 결과도 정수다
		System.out.println(num3 / num4); // 0.75	실수/실수는 결과도 실수다
		System.out.println(num1 % num2); // 3
		
		// 실수끼리의 연산은 예상과 다른 연산결과가 나올 수 있음
		// 실수에 10의 배수를 곱해서 정수로 만든 후 계산을 수행하고, 다시 10의 배수로 나눈다.
		double num5 = 0.1;
		double num6 = 0.2;
		System.out.println(num5 + num6); 				// 0.30000000000000004
		System.out.println((num5*10 + num6*10)/10);		// 0.3

	}

}
