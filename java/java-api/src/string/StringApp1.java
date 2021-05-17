package string;

public class StringApp1 {

	public static void main(String[] args) {
		String a = "안녕";
		String b = "안녕";
		String c = new String("안녕");
		String d = new String("안녕");
		
		System.out.println("a == b " +  (a == b));
		System.out.println("a.equals(b) " + a.equals(b));
		System.out.println("c == d " +  (c == d));
		System.out.println("c.equals(d) " + c.equals(d));
		// * String객체의 생성방법에 상관없이 객체가 가진 문자열이 동일하면
	}
}
