package wrapper;

public class WrapperApp {

	public static void main(String[] args) {
		
		int x = 10;
		// 박싱(Boxing) 기본자료형값을 객체를 생성해서 저장하는 것
		Integer i = new Integer(10);
		Integer i2 = new Integer("1000");
		
		Double d = new Double(3.14);
		Double d2 = new Double("3.14");
		
		Boolean b = new Boolean(true);
		Boolean b2 = new Boolean("true");
		
		// 오토박싱(Auto-Boxing) 변수의 타입이 Wrapper 클래스 타입일 때 자동으로
		// 해당 기본자료형과 대응되는 객체가 생성되고 그 객체에 값이 저장되는 것
		Integer a1 = 100;	// Integer a = new Integer(100);
		Double a2 = 3.14;	// Double a2 = new Double(3.14);
		Boolean a3 = true;	// Boolean a3 = new Boolean(true);
	}
	
}
