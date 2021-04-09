package day5.inner;

public class Outer3 {

	private int x = 10;
	private static int y = 20;
	
	public void test1() {
		System.out.println("외부클래스의 인스턴스 메소드 test1() 실행");
	}
	
	public static void test2() {
		System.out.println("외부클래스의 정적 메소드 test2() 실행");
	}
	
	public void test3() {
		int a = 10;
		int b = 20;
		
		final int c = 30;
		
		// 로컬 내부 클래스
		// 외부 클래스의 모든 변수, 메소드 사용가능, 사용빈도 매우 낮음
		// 내부클래스를 포함하고 있는 메소드의 변수 중에서는
		// final로 선언된 변수나, 메소드가 끝날 때 까지 값이 변하지 않는 것만 사용가능
		class Inner {
			public void innerMethod() {
				System.out.println("외부클래스의 인스턴스 변수 : " + x);
				System.out.println("외부클래스의 정적 변수 : " + Outer3.y);
				test1();
				Outer3.test2();
				
				System.out.println("test3() 메소드의 변수 : " + a);
				// System.out.println("test3() 메소드의 변수 : " + b); // b의 값이 변하기 때문에 로컬 내부 클래스에서는 쓸 수 없다.
				System.out.println("test3() 메소드의 변수 : " + c);
			}
		}
		
		Inner inner = new Inner();
		inner.innerMethod();
		
		b = 50;
		
		
	}
}
