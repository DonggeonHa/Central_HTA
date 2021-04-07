package day2;

public class FireTruck extends Car {

	private int water;
	
	public FireTruck() {}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}
	
	// 화재 진압하기 기능
	public void suppressFire() {
		System.out.println("Fire suppression!!!!");
	}
	
}
