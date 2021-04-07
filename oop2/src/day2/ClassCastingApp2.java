package day2;

public class ClassCastingApp2 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new PoliceCar();
		Car car3 = new Panzer();
		
		System.out.println("### Car타입의 참조변수로  Car객체 참조하기");
		car1.drive();	// Car객체의 기능 사용하기
		car1.stop();	// Car객체의 기능 사용하기
		// PoliceCar car12 = (PoliceCar) car1;		// 실행 오류, car1이 참조하는 객체에는 PoliceCar가 없음
		// car12.patrol();
		// String car13 = (String) car1;			// 컴파일 오류, car1이 참조하는 객체와  String은 상속관계가 아님.
		
		System.out.println("### Car타입의 참조변수로  PoliceCar객체 참조하기");
		car2.drive();	// Car객체의 기능 사용하기
		car2.stop();	// Car객체의 기능 사용하기
		
		PoliceCar car22 = (PoliceCar) car2;		// car2로 참조되는 객체에서 PoliceCar 객체로 옮겨가기
		car22.patrol();	// PoliceCar객체의 기능 사용하기
		((PoliceCar) car2).patrol();			// PoliceCar객체로 옮겨서 순찰기능 실행
		
		
		System.out.println("### Car타입의 참조변수로  Panzer객체 참조하기");
		car3.drive();	// Car객체의 기능 사용하기
		car3.stop();	// Car객체의 기능 사용하기
				
		PoliceCar car32 = (PoliceCar) car3;		// car3로 참조되는 객체에서 PoliceCar 객체로 옮겨가기
		car32.patrol();	// PoliceCar객체의 기능 사용하기
		
		Panzer car33 = (Panzer) car3;			// car3로 참조되는 객체에서 Panzer 객체로 옮겨가기
		car33.fireWeapon();	// Panzer객체의 기능 사용하기
	}
}
