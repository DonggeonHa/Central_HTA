package day3;

public class Sample {
	
	// 기본자료형 타입 매개변수 - 값을 전달받는다.
	void test1(int x, int y) {
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		
		System.out.println("전달받은 값 변경하기");
		
	}
	
	// 참조자료형 타입 매개변수 -  주소값을 전달받는다.
	// 매개변수의 타입이 참조자료형 타입인 경우 반드시 해당 타입의 클래스로 생성된 객체의 주소값이
	// 매개변수로 전달되어야 한다. (null값을 전달하는 것도 가능하다)
	void test2(MyNumber number) {
		System.out.println("전달받은 객체의 x값 : " + number.x);
		System.out.println("전달받은 객체의 y값 : " + number.y);
		
		// 참조하는 객체의 x값, y값 변경하기
		System.out.println("전달받은 객체의 x값, y값을 변경하기");
		number.x = 500;
		number.y = 1000;
	}
}
