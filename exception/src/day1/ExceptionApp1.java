package day1;

public class ExceptionApp1 {

	public static void main(String[] args) {
		// 개발자의 코딩 실수로 발생하는 예외들
		// - RuntimeException 클래스 및 그 하위예외클래스들은 개발자의 코딩 실수가
		//   그 원인이 되는 예외다.
		// - 해당 예외가 발생하는 수행문 혹은 메소드에 대해서는 예외처리 여부를 
		//   체크하지 않는다.
		// - 개발자는 해당 예외가 발생되지 않도록 코딩실수를 최대한 줄여야 한다.
		// - 개발자는 필요에 따라서 try ~ catch 구문으로 예외상황 발생시 실행할 수행문을
		//   작성할 수 있다.
		
		// NullPointerException
		// 참조변수가 null값을 가지고 있다. 즉 그 참조변수는 객체를 참조하고 있지 않는 상태다.
		// 그 참조변수로 해당 클래스에서 제공하는 속성이나 기능을 사용하려는 경우 발생하는 예외다.
//		String text = null;
//		System.out.println(text.length());
		
		// IndexOutOfBoundsException
		// 		ArrayIndexOutOfBoundsException
		//		배열의 인덱스범위를 벗어난 인덱스를 사용했을 때 발생하는 예외다.
		//		StringIndexOutOfBoundsException
		//		문자열의 길이를 초과한 인덱스를 사용했을 떄 발생하는 예외다.
//		String[] names = {"김유신", "강감찬", "이순신"};
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
		
//		String text = "안녕하세요";
//		String subText = text.substring(0, 10);
//		System.out.println("부분문자열 : " + subText);
		
		// ArithmeticException
		// 숫자를 0으로 나눌 때 발생하는 예외다.
//		System.out.println(10/0);
		
		// ClassCastException
		// 클래스 형변환이 잘못되었을 때 발생하는 예외다.
//		Phone p = new SmartPhone();
//		SmartPhone p1 = (SmartPhone) p;
//		FeaturePhone p2 = (FeaturePhone) p;
	}
	
	static class Phone {}
	static class FeaturePhone extends Phone {}
	static class SmartPhone extends Phone {}
}
