package day1;

public class ProductApp2 {
	public static void main(String[] args) {
		
		// 상품정보를 3개 저장하는 배열객체를 생성하기
		Product[] products = new Product[3];
		System.out.println("### 배열 생성 직후 배열의 각 칸에 저장된 값 출력하기");
		System.out.println("0번쨰 칸 : " + products[0]);
		System.out.println("1번쨰 칸 : " + products[1]);
		System.out.println("2번쨰 칸 : " + products[2]);
		
		// 상품정보를 담을 수 있는 Product객체 3개 생성하기
		Product p1 = new Product();
		p1.no = 100;
		p1.category = "스마트폰";
		p1.name = "아이폰12";
		p1.maker = "애플";
		p1.price = 1500000;
		p1.stock = 20;
		p1.isSoldOut = false;
		
		Product p2 = new Product();
		p2.no = 120;
		p2.category = "노트북";
		p2.name = "LG그램";
		p2.maker = "LG";
		p2.price = 2500000;
		p2.stock = 10;
		p2.isSoldOut = false;
		
		Product p3 = new Product();
		p3.no = 130;
		p3.category = "스마트워치";
		p3.name = "애플워치5";
		p3.maker = "애플";
		p3.price = 600000;
		p3.stock = 30;
		p3.isSoldOut = false;
		
		System.out.println("### 참조변수가 참조하는 객체의 정보 출력하기");
		System.out.println("p1이 참조하는 객체 : " + p1);
		System.out.println("p2이 참조하는 객체 : " + p2);
		System.out.println("p3이 참조하는 객체 : " + p3);
		
		// 배열의 0번째 칸부터 2번째 칸에 생성된 Product객체를 저장하기
		products[0] = p1;			// p1참조변수가 참조하는 객체의 주소값을 배열의 0번쨰 칸에 대입함
		products[1] = p2;			// p2참조변수가 참조하는 객체의 주소값을 배열의 1번쨰 칸에 대입함
		products[2] = p3;			// p3참조변수가 참조하는 객체의 주소값을 배열의 2번쨰 칸에 대입함
		
		System.out.println("### 배열의 각 칸에 Product객체를 저장한 후 각 칸에 저장된 값 출력하기");
		System.out.println("0번째 칸 : " + products[0]);
		System.out.println("1번째 칸 : " + products[1]);
		System.out.println("2번째 칸 : " + products[2]);
		
		
		// 모든 상품의 이름을 화면에 출력하기
		Product px = products[0];	// products배열의 0번째 칸에 저장된 Product객체의 주소값을 px에 대입
		Product py = products[1];	// products배열의 1번째 칸에 저장된 Product객체의 주소값을 py에 대입
		Product pz = products[2];	// products배열의 2번째 칸에 저장된 Product객체의 주소값을 pz에 대입
		System.out.println("### 배열에 각 칸에 저장된 Product객체의 상품이름을 출력하기");
		System.out.println("0번쨰 칸에 저장된 상품객체의 이름 : " + px.name);
		System.out.println("1번쨰 칸에 저장된 상품객체의 이름 : " + py.name);
		System.out.println("2번쨰 칸에 저장된 상품객체의 이름 : " + pz.name);
		
		System.out.println("0번쨰 칸에 저장된 상품객체의 이름 : " + products[0].name);
		System.out.println("1번쨰 칸에 저장된 상품객체의 이름 : " + products[1].name);
		System.out.println("2번쨰 칸에 저장된 상품객체의 이름 : " + products[2].name);
		
		// 모든 상품의 이름을 향상된 for문을 사용해서 출력하기
		System.out.println("### 향상된 for문을 사용해서 배열에 저장된 모든 상품의 이름을 출력하기 ###");
		for (Product x : products) { // x에는 products배열에 저장된 Product객체의 주소값이 순서대로 출력된다.
			// System.out.println("상품명 : " + x.name);
			String productName = x.name;
			int productPrice = x.price;
			int productStock = x.stock;
			System.out.printf("%-20s%15d%10d\n", productName, productPrice, productStock);
		}
		
		System.out.println("### products배열에 저장된 모든 상품정보를 객체의 printInfo()메소드를 실행하여 출력");
		for (Product item : products) {
			item.printInfo();
		}
		
		System.out.println("### products 배열에 저장된 상품중에서 재고수량이 25개 이상인 상품의 정보만 출력");
		for (Product item : products) {
			if (item.stock >= 25) {
				item.printInfo();
			}
		}
		
		System.out.println("### products배열에 저장된 상품중에서 제품의 가격이 100만원 이상인 상품의 정보만 출력");
		for (Product item : products) {
			if (item.price >= 1000000) {
				item.printInfo();
			}
		}
		
		System.out.println("### products배열에 저장된 상품중에서 애플에서 제조한 상품정보만 출력하기");
		for (Product item : products) {
			if ("애플".equals(item.maker)) { // item.maker.equals("애플")는 maker에 제조회사가 안들어있을 시  null로 인식을 해 오류가 생김 (null.equals("애플"))로 인식이 되버림
				item.printInfo();
			}
		}
	}
}






