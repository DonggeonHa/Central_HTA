package object;

public class ObjectApp3 {

	public static void main(String[] args) {
		Person p1 = new Person(10, "홍길동", "hong@gmail.com");
		Person p2 = new Person(20, "김유신", "kim@naver.com");
		Person p3 = new Person(20, "김유신", "kim@naver.com");
		
		// int hashCode()
		// 객체의 주소값을 사용해서 생성한 값이다.
		// 서로 다른 객체는 절대로 같은 해시코드값을 가질 수 없다.
		// hashCode()를 재정의해서 개발자가 지정한 값이 그 객체의 hashCode값이 되게 할 수 있다.
		// 즉, 원래는 모든 객체가 다른 hashCode값을 가지지만, hashCode()를 재정의하면
		// 객체가 다르더라도 같은 hashCode값을 가지는 객체가 존재할 수 있게 된다.
		int hashCode1 = p1.hashCode();
		int hashCode2 = p2.hashCode();
		int hashCode3 = p3.hashCode();
		System.out.println("p1참조변수가 참조하는 객체의 해시코드 : " + hashCode1);
		System.out.println("p2참조변수가 참조하는 객체의 해시코드 : " + hashCode2);
		System.out.println("p3참조변수가 참조하는 객체의 해시코드 : " + hashCode3);
	}
}
