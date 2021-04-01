package day4;

public class Item {
	
	int no;
	String category;
	String name;
	String maker;
	int price;
	
	// 기본 생성자 정의하기
	Item() {}
	
	// 모든 멤버변수를 초기화하는 생성자를 정의하기
	Item(int no, String category, String name, String maker, int price) {
		this.no = no;
		this.category = category;
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
}
