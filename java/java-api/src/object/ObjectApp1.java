package object;

public class ObjectApp1 {

	public static void main(String[] args) {
		Person p1 = new Person(10, "홍길동", "hong@gmail.com");
		Person p2 = new Person(10, "홍길동", "hong@gmail.com");
		Person p3 = p1;
		Person p4 = p2;
		
		// boolean equals(Object obj) 메소드
		// 객체 자신과  obj객체가 동일한 객체인지 여부를 반환한다
		boolean result1 = p1.equals(p2);
		boolean result2 = p2.equals(p1);
		
		System.out.println("p1이 참조하는 객체와 p2가 참조하는 객체가 같은 객체인가?" + result1);
		System.out.println("p2이 참조하는 객체와 p1가 참조하는 객체가 같은 객체인가?" + result2);
	}
}
