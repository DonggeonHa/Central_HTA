package day6;

public class PenApp {

	public static void main(String[] args) {
		
		// new Pen(); 오류 - 인터페이스로 객체 생성할 수 없다.
		//				   - 인터페이스는 완전한 설계도가 아니다.
		
		// Pen인터페이스의 추상메소드를 재정의한 익명클래스로 익명객체 만들기
		Pen p1 = new Pen() {
			public void draw() {
				System.out.println("검은색으로 도형그리기");
			}
			public void clear() {
				System.out.println("검은색 지우기");
			}
		};
		p1.draw();
		p1.clear();
		
		// 익명클래스는 반드시 상위클래스나 인터페이스를 기반으로 만들어진다.
		// People이라는 상위클래스나 인터페이스가 존재하지 않기 때문에 아래와 같은
		// 익명클래스의 정의는 문법오류임
		/*
		 * People p = new People() {
		 * 
		 * };
		 */
	}
}
