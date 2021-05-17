package day3;

public class methodoverloadingSampleApp {
	public static void main(String[] args) {
		methodoverloadingSample sample = new methodoverloadingSample();
		
		sample.plus(10, 20);
		sample.plus(10, 20, 30);
		sample.plus(10.0, 20.0);
		sample.plus(10.0, 20);
		sample.plus(10, 20.0);
	}
}
