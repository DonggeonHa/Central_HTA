package day6;

public class ProductApp2 {
	

	public static void main(String[] args) {
		Product[] products = new Product[10];
		products[0] = new Product("청바지", "S", 100000);
		products[1] = new Product("반바지", "M", 50000);
		products[2] = new Product("운동용바지", "L", 70000);
		products[3] = new Product("정장바지", "XL", 160000);
		products[4] = new Product("치마", "S", 80000);
		products[5] = new Product("스커트", "M", 120000);
		products[6] = new Product("린넨바지", "L", 30000);
		products[7] = new Product("카고바지", "XL", 200000);
		products[8] = new Product("나팔바지", "S", 110000);
		products[9] = new Product("면바지", "M", 40000);
		
		// 사이즈를 기준으로 재정의하는 메소드
		Predicate p1 = new Predicate() {
			// 상품의 사이즈가 "S"면 true를 반환하는 익명객체
			public boolean test(Product item) { 
				return item.getSize().equals("S");
			}
		};
		Predicate p2 = new Predicate() {
			// 상품의 가격이 5만원이면 true를 반환하는 익명객체
			public boolean test(Product item) { 
				return item.getPrice() == 50000;
			}
		};
		
		System.out.println("### 사이즈가 S인 상품만 출력");
		printProducts(products, p1);
		
		System.out.println("### 가격이 5만원인 상품만 출력");
		printProducts(products, p2);
		
		System.out.println("### 가격이 5만원 이상 10만원 이하인 상품만 출력");
		printProducts(products, new Predicate() {
			public boolean test(Product item) {
				return item.getPrice() >= 50000 && item.getPrice() <= 100000;
			}
		});
		
		System.out.println("### 사이즈가 S고 가격이 5만원 이상 10만원 이하인 상품만 출력");
		printProducts(products, new Predicate() {
			public boolean test(Product item) {
				return item.getSize().equals("S") && item.getPrice() >= 50000 && item.getPrice() <= 100000;
			}
		});
		
		System.out.println("### 람다 표현식으로 Predicate 인터페이스 구현하기");
		System.out.println("### 사이즈가 XL인 상품만 출력");
		printProducts(products, item -> {return item.getSize().equals("XL");});
		printProducts(products, item -> item.getSize().equals("XL"));
	}
	
	static interface Predicate {
		boolean test(Product item);
	}
	public static void printProducts(Product[] items, Predicate p) {
		for (Product item : items) {
			// 전달받은 Predicate 인터페이스의 구현객체에 구현된 test(item) 메소드를 실행한다.
			if (p.test(item)) {
				System.out.println(item.getName() + ", " + item.getSize() + ", " + item.getPrice());
			}
		}
	}
}
