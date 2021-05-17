package day4.multiple;

public class Morning extends AbstractCar implements 에어백, 에어컨 {

	@Override
	public void speedDown() {
		int currentSpeed = getCurrentSpeed();
		currentSpeed -= 3;
		
		if (currentSpeed < MIN_LOW_SPEED) {
			currentSpeed = MIN_LOW_SPEED;
		}
		setCurrentSpeed(currentSpeed);
		System.out.println("현재 속도는 " + currentSpeed + "km/h 입니다.");
	}

	@Override
	public void speedUp() {
		int currentSpeed = getCurrentSpeed();
		currentSpeed += 3;
		
		if (currentSpeed > MAX_HIGH_SPEED) {
			currentSpeed = MAX_HIGH_SPEED;
		}
		setCurrentSpeed(currentSpeed);
		System.out.println("현재 속도는 " + currentSpeed + "km/h 입니다.");
		
	}

	
	@Override
	public void 온도올리기() {
		System.out.println("내부온도 1도 증가");
	}

	@Override
	public void 온도낮추기() {
		System.out.println("내부온도 1도 감소");
	}

	@Override
	public void 에어백펼치기() {
		System.out.println("운전자 측 에어백 펼쳐짐");
	}

}
