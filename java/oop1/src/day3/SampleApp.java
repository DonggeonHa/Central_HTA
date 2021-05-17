package day3;

public class SampleApp {
	public static void main(String[] args) {
		Sample sample = new Sample();
		
		// 기본자료형 타입의 매개변수를 가지는 메소드 호출하기
		// voiud test1(int, int)
		int x = 10;
		int y = 50;
		
		System.out.println("### test1() 메소드 실행 시작");
		sample.test1(x, y);
		System.out.println("### test1() 메소드 실행 완료");
		System.out.println("x의 값 : " + x);
		System.out.println("x의 값 : " + y);
		
		System.out.println("----------------------------------------------");
		
		
		// 참조자료형 타입의 매개변수를 가지는 메소드 호출하기
		// void test2(MyNumber)
		MyNumber mn = new MyNumber();
		sample.test2(mn);
		mn.x = 100;
		mn.y = 200;
		System.out.println("### test2() 메소드 실행 전 객체의 x값, y값 출력하기");
		System.out.println("MyNumber객체의 x값 : " + mn.x);		// 100
		System.out.println("MyNumber객체의 y값 : " + mn.y);		// 200
		
		System.out.println("### test2() 메소드 실행 시작");
		sample.test2(mn); // mn 참조변수가 참조하는 MyNumber객체의 주소값을 test2 메소드에게 전달
		System.out.println("### test2() 메소드 실행 완료");
		
		System.out.println("### test2() 메소드 실행 후 객체의 x값, y값 출력하기");
		System.out.println("MyNumber객체의 x값 : " + mn.x);		// 500
		System.out.println("MyNumber객체의 y값 : " + mn.y);		// 1000
		
	}
}
