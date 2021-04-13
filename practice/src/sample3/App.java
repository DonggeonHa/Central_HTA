package sample3;

public class App {

	public static void main(String[] args) {
		Product[] products = new Product[10];
		products[0] = new Product(10, "노트북", "맥북에어", 1700000, 5, false);
		products[1] = new Product(20, "노트북", "맥북프로", 2700000, 10, false);
		products[2] = new Product(30, "노트북", "LG그램", 1900000, 40, false);
		products[3] = new Product(40, "스마트폰", "샤오미", 600000, 30, false);
		products[4] = new Product(50, "스마트폰", "아이폰12", 1700000, 30, false);
		products[5] = new Product(60, "스마트폰", "갤럭시S20", 1500000, 100, false);
		products[6] = new Product(70, "시계", "갤럭시워치", 470000, 0, true);
		products[7] = new Product(80, "시계", "애플워치6", 700000, 5, false);
		products[8] = new Product(90, "도서", "자바의 정석", 35000, 100, false);
		products[9] = new Product(100, "도서", "이것이 자바다", 28000, 100, false);
		
		// 상품정보를 조회하는 프로그램 작성하기
		
		// 1. 키보드 입력을 읽어오는 Scanner객체를 생성한다.
		// 2. 반복문(while문)을 사용해서 아래의 작업을 반복 수행한다.
		// 		1. 메뉴제공 1.전체조회 2.카테고리별조회 3.상품명조회 4.가격조회 0.종료
		//		2. 메뉴번호를 입력받는다.
		//		3. 메뉴별 처리를 구현한다.
		// 			- 전체조회는 모든 상품정보를 표시한다.
		//			- 카테고리조회는 카테고리를 입력받아서 카테고리가 일치하는 상품만 출력한다.
		//			- 상품명조회는 상품명을 입력받아서 그 문자열을 포함하고 있는 상품만 출력한다.
		//			- 가격조회는 최소가격, 최대가격을 입력받아서 해당 범위에 속하는 상품만 출력한다.
		//			- 종료는 반복문을 탈출한다.
		
	}
}
