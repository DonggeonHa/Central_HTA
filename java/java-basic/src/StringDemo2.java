import java.util.Scanner;

public class StringDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String value1 = "홍길동";
		
		System.out.print("이름을 입력하세요 : ");
		String value2 = sc.next();
		
		// == 비교 연산자로 문자열 비교
		// value1변수의 주소값과 value2변수의 주소값을 비교한다.
		// (서로 다른 객체의 주소값을 가지고 있으므로 false)
		System.out.println(value1 == value2);
		
		// String객체는 문자열의 내용을 비교할 수 있는 equals(다른 문자열) 메소드를 제공한다.
		// value1변수가 참조하는 객체와 value2변수가 참조하는 객체가 동일한 내용을 가지고 있으면
		// 객체의 주소값에 상관없이 true가 나온다
		System.out.println(value1.equals(value2));
		System.out.println(value2.equals(value1));
		
		
		sc.close();
	}
}
