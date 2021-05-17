package day1;

public class ProductApp {
	public static void main(String[] args) {
		
		// 상품정보를 표현하는 객체를 생성하고, 객체의 멤버변수에 적절한 상품정보를 저장한다.
		Product product1 = new Product();
		
		product1.no = 1;
		product1.category = "PC주변기기";
		product1.name = "키보드";
		product1.maker = "레이저";
		product1.price = 120000;
		product1.stock = 40;
		// product1.isSoldOut = false;		// 불린타입은 값을 입력하지않아도 기본값이 false다.
		
		// 위에서 생성한 상품객체에 저장된 상품정보를 화면에 출력하는 메소드를 실행한다.
		product1.printInfo();
	}
}
