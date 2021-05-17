package day2;

public class Car {
	
	private String color;
	
	public Car() {}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 운전기능
	public void drive() {
		System.out.println("Driving...");
	}
	
	// 정지기능
	public void stop() {
		System.out.println("STOP!");
	}
}
