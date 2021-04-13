package object;

public class ObjectApp4 {

	public static void main(String[] args) {
		Person p1 = new Person(10, "홍길동", "hong@gmail.com");
		Person p2 = new Person(10, "홍길동", "hong@gmail.com");
		
		// p1 참조변수의 주소값과 p2 참조변수의 주소값이 같은지 비교
		boolean result1 =  (p1 == p2);
		System.out.println("result1 : " + result1);
		
		// boolean equals(Object obj) 메소드로 p1 참조변수와 p2 참조변수가 참조하는 객체가
		// 같은 객체인지 비교
		boolean result2 = p1.equals(p2);
		System.out.println("result2 : " + result2);
	}
}
