package day1;

public class ClassCastingApp1 {

	public static void main(String[] args) {
		// 참조변수의 타입과 생성된 객체의 타입이 동일한 경우, 클래스 형변환이 발생하지않음 
		Phone p1 = new Phone();
		FeaturePhone p2 = new FeaturePhone();
		SmartPhone p3 = new SmartPhone();
		
		// 참조변수의 타입과 생성된 객체의 타입이 서로 다른 경우
		Phone p4 = new FeaturePhone();
		Phone p5 = new SmartPhone();
		
		
		
	}
}
