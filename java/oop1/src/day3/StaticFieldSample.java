package day3;

public class StaticFieldSample {

	// 멤버변수, 인스턴스변수
	int x;
	
	// 정적변수, 클래스변수
	static int y;
	
	// 멤버메소드
	void increase() {
		x++;
		y++;
	}
	
	void print() {
		System.out.println("멤버변수 x의 값 : " + x);
		System.out.println("멤버변수 y의 값 : " + y);
	}
}
