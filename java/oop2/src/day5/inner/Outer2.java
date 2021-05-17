package day5.inner;

public class Outer2 {

	int x = 10;
	static int y = 20;
	
	public void test1() {
		System.out.println("외부클래스의 인스턴스 메소드 test1() 실행");
	}
	
	public static void test2() {
		System.out.println("외부클래스의 정적 메소드 test2() 실행");
	}
	
	public static void test3() {
		// 정적 메소드에서는 인스턴스 내부 클래스 사용 불가능
		// InstanceInner inner1 = new InstanceInner();
		// 정적 메소드에서는 정적 내부 클래스만 사용 가능
		Inner inner2 = new Inner();
		inner2.innerMethod();
	}
	
	// 인스턴스 내부 클래스
	class InstanceInner{
		
	}
	
	
	// 정적 내부 클래스
	// 외부 클래스의 객체 생성 전에도 정적 내부클래스로 객체를 생성할 수 있다. 
	static class Inner {
		
		public void innerMethod() {
			// 외부 클래스의 인스턴스 변수 사용 불가능
			// System.out.println("외부 클래스의 인스턴스 변수: " + x);
			System.out.println("외부 클래스의 정적 변수 : "  + Outer2.y);
			// 외부 클래스으 인스턴스 메소드 사용 불가능
			// test1();
			Outer2.test2();
		}
	}
}
