package wrapper;

public class WrapperApp3 {

	public static void main(String[] args) {
		
		// 문자열을 정수, 실수로 변환하기
		String value1 = "150000";
		String value2 = "3";
		String value3 = "0.01";
		
		int price = Integer.parseInt(value1);
		int amount = Integer.parseInt(value2);
		double savePointRate = Double.parseDouble(value3);
		
		int total = price * amount;
		int point = (int) (total * savePointRate);
		
		System.out.println("총 구매가격 : " + total);
		System.out.println("적립포인트 : " + point);
		
		// 오류 상황
		// java.lang.NumberFormatException
		// int value3 = Integer.parseInt(""); 		// 빈 문자열은 숫자로 변환할 수 없다.
		// int value3 = Integer.parseInt(" ");		// 공백이 포함된 문자열은 숫자로 변환할 수 없다.
		// int value3 = Integer.parseInt("가나다");	// 숫자가 아닌 문자들은 숫자로 변환할 수 없다.
		// int value3 = Integer.parseInt("1234가"); // 숫자가 아닌 문자가 한 개라도 포함되면 숫자로 변환할 수 없다.
		// int value3 = Integer.parseInt("123 "); 	// 공백이 포함되어 있으면 숫자로 변환할 수 없다.  
		// int value3 = Integer.parseInt("3.14");	// 실수형식의 문자열은 정수로 변환할 수 없다.
		
		
	}
}
