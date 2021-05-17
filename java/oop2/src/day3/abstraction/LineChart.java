package day3.abstraction;

// 야 니네들 이 기능 꼭 있어야해??? 라고 사용하는게 추상메소드
public class LineChart extends Chart {

	@Override
	public void draw() {
		System.out.println("꺽은 선 그래프를 그린다.");
	}
}
