package day2.game;

public class Unit {

	private String name;
	private int life;
	
	public Unit() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	// 공격기능
	public void attack() {
		System.out.println("상대방의 생명력을 1 감소시킨다.");
	}
	
	// 수비기능
	public void defense() {
		System.out.println("상대방의 공격을 방어한다.");
	}
	
	// 이동기능
	public void move() {
		System.out.println("1칸 이동한다.");
	}
	
}
