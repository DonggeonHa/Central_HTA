package day1;

public class PrinterApp {

	public static void main(String[] args) {
		System.out.println("### Printer객체 사용하기");
		Printer p1 = new Printer();
		p1.print();
		
		System.out.println("### ColorPrinter객체 사용하기");
		ColorPrinter p2 = new ColorPrinter();
		p2.refill();
		p2.print();
		
		System.out.println("### LaserColorPrinter객체 사용하기");
		LaserColorPrinter p3 = new LaserColorPrinter();
		p3.refill();
		p3.print();
	}

}
