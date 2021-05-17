package day4.multiple;

public interface Car {

	int MIN_LOW_SPEED = 0;
	int MAX_HIGH_SPEED = 300;
	
	void drive();
	void stop();
	void speedUp();
	void speedDown();
}
