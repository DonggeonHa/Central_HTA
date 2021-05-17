package day3;

public class StaticFieldSampleApp {
	
	public static void main(String[] args) {
		StaticFieldSample sample1 = new StaticFieldSample();
		StaticFieldSample sample2 = new StaticFieldSample();
		StaticFieldSample sample3 = new StaticFieldSample();
		
		sample1.increase();
		sample1.increase();
		sample1.increase();
		
		sample2.increase();
		sample2.increase();
		
		sample3.increase();
		
		// 인스턴스변수 x는 객체마다 따로 생성되기 떄문에 객체의 상태에 따라서 다른 값을 가질 수 있다.
		// 클래스변수 y는 오직 한 개만 생성되기 때문에 동일한 값이 출력된다.
		sample1.print();		// x=3 y=6
		sample2.print();		// x=2 y=6
		sample2.print();		// x=1 y=6
		
	}
}
