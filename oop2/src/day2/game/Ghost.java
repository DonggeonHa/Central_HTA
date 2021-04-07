package day2.game;

public class Ghost extends Unit {

	@Override
	public void attack() {
		System.out.println("적의 기지에 핵폭탄을 투하시킨다.");
	}
	
	@Override
	public void move() {
		System.out.println("클로킹 기능을 이용해서 이동한다.");
	}
}
