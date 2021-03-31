package day3;

public class methodoverloadingSample {

	
	void plus(int x, int y) {
		System.out.println("plus(int, int) 메소드 실행");
		int result = x + y;
		System.out.println("덧셈결과 : " + result);
	}
	
	void plus(int x, double y) {
		System.out.println("plus(int, double) 메소드 실행");
		double result = x + y;
		System.out.println("덧셈결과 : " + result);
	}
	
	void plus(double x, int y) {
		System.out.println("plus(double, int) 메소드 실행");
		double result = x + y;
		System.out.println("덧셈결과 : " + result);
	}
	
	void plus(int x, int y, int z) {
		System.out.println("plus(int, int, int) 메소드 실행");
		int result = x + y + z;
		System.out.println("덧셈결과 : " + result);
	}
	
	void plus(double x, double y) {
		System.out.println("plus(double, double) 메소드 실행");
		double result = x + y ;
		System.out.println("덧셈결과 : " + result);
	}
}
