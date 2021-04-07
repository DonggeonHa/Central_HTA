package day1;

public class LaserColorPrinter extends LaserPrinter{

	@Override
	public void print() {
		System.out.println("레이저 컬러 출력");
	}
	
	@Override
	public void refill() {
		System.out.println("토너 교체하기");
	}
}
