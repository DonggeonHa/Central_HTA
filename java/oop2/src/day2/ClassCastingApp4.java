package day2;

public class ClassCastingApp4 {

	public static void main(String[] args) {
		Car car1 = new Car();
		FireTruck car2 = new FireTruck();
		PoliceCar car3 = new PoliceCar();
		Panzer car4 = new Panzer();
		
		System.out.println("### drive/stop 기능 테스트하기");
		testDriveAndStop(car1);
		testDriveAndStop(car2);
		testDriveAndStop(car3);
		testDriveAndStop(car4);
		
		System.out.println("### 순찰기능 테스트하기");
		// testPatrol(car1);		// 컴파일 오류
		// testPatrol(car2);		// 컴파일 오류
		testPatrol(car3);
		testPatrol(car4);
		
		System.out.println("### 무기발사 기능 테스트하기");
		// testFireWeapon(car1);	// 컴파일 오류
		// testFireWeapon(car2);	// 컴파일 오류
		// testFireWeapon(car3);	// 컴파일 오류
		testFireWeapon(car4);
	}
	
	// 차량의 운전, 정지 기능을 테스트하는 메소드
	public static void testDriveAndStop(Car car) {
		car.drive();
		car.stop();
	}
	
	// 순찰기능을 테스트하는 메소드
	public static void testPatrol(PoliceCar car) {
		car.patrol();
	}
	
	// 무기발사기능을 테스트하는 메소드
	public static void testFireWeapon(Panzer car) {
		car.fireWeapon();
	}
}
