package day2.game;


public class GameApp2 {

	public static void main(String[] args) {
		Unit[] units = new Unit[4];
		
		units[0] = new Marine();
		units[1] = new Firebat();
		units[2] = new Ghost();
		units[3] = new BattleCruiser();
		
		for (Unit unit : units) {
			// - unit 참조변수는 다양한 종류의 Unit류 객체를 참조한다.
			// - unit 참조변수가 참조하는 Unit류 객체는 모두 Unit클래스의 하위클래스고,
			//	 클래스의 목적에 맞게 move()나 attack()을 재정의하고 있다.
			// - unit 참조변수가 참조하는 객체의 종류에 상관없이 unit.move(); unit.attack();를
			//	 실행하면 객체의 목적에 맞게 재정의된 move()나 attack()가 실행된다.
			// - 결론
			//		* Marine, Firebat, Ghost, BattleCruiser객체에 재정의된 move()나 attack()를
			//		  실행하기 위해서 해당 객체 타입으로 형변환이 필요없어진다.
			//		* Unit클래스의 하위 클래스가 나중에 추가되더라도 이동기능, 공격기능을 실행하는 방법은
			//		  변하지 않는다.
			//		* 프로그램의 확장성이 높아진다.
			
			unit.move();
			unit.attack();
			System.out.println();
		}
		
	}
}
