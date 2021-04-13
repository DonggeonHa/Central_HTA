package string;

public class StringBuilderApp2 {

	public static void main(String[] args) {
		String name1 = "김유신";
		String name2 = "강감찬";
		String name3 = "이순신";
		
		// + 연산자로 이어붙여서 문자열을 생성하면 불필요한 객체가 계속 생긴다.
		// 메모리 낭비가 발생할 수 있다.
		String text = name1 + "," + name2 + "," + name3;
		System.out.println(text);
		
		// + 연산자를 사용하는 대신 StringBuilder을 사용하면
		// StringBuilder객체 하나만 생성되고, 내부버퍼에 값이 저장된다.
		// 무분별한 객체 생성으로 인한 메모리 낭비를 방지할 수 있다.
		StringBuilder sb1 = new StringBuilder();
		sb1.append(name1);
		sb1.append(",");
		sb1.append(name2);
		sb1.append(",");
		sb1.append(name3);
		
		// StringBuilder의 append()메소드는 메소드체이닝을 지원한다.
		StringBuilder sb2 = new StringBuilder();
		sb2.append(name1).append(",").append(name2).append(",").append(name3);
		
		String text1 = sb1.toString();
		String text2 = sb2.toString();
		System.out.println(text1);
		System.out.println(text2);
		
	}
}
