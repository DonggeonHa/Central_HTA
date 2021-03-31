/*
 * public class Hello는 설계도(클래스)이다
 * public class Hello는 한 개의 설계도(클래스)로 만들어진 프로그램이다
 * public : 공개된을 의미하는 키워드
 * class : 설계도임을 나타내는 키워드
 * public class Hello는 Hello라는 이름을 가진 공개된 설계도(클래스)
 * 
 * 설계도(클래스)의 일반적인 형태
 * public class 클래스명 {
 * 
 * 		수행문; X <-- 수행문은 메소드안에 위치해야 한다.
 * 
 * 		메소드
 * 		메소드
 * 		메소드
 * 		메소드
 * }
 */
public class Hello {
	/*
	 * public static void main(String[] args)는 자바가상머신이 프로그램을 실행할 때 처음으로 실행하는 부분이다.
	 * public static void main(String[] args)는 프로그램 실행시 진입점이 되는 곳이다.
	 * public static void main(String[] args)는 자바가상머신과 미리 약속된 부분이기 때문에 항상 똑같이 적어야 한다.
	 * 
	 * public static void main(String[] args) {
	 * 		수행문;
	 * 		수행문;
	 * 		수행문;
	 * }
	 */
	public static void main(String[] args) {
		// System.out은 컴퓨터의 표준 출력장치를 말한다. (대체로 모니터를 말한다)
		// println(값)은 메소드다.(메소드는 이름이 있는 코드블록이다. 메소드는 특별한 기능을 실행한다.)
		// println(값)은 지정된 값을 출력장치로 출력한다.
		System.out.println("Hello, world");

		
	}
}

