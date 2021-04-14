package sample3;

import java.util.Scanner;

public class App2 {
	
	public static Product findProductByProductNo(Product[] products, int productNo) {
		Product foundProduct = null;
		
		for(Product product : products) {
			if (product.getNo() == productNo) {
				foundProduct = product;
				break;
			}
		}
		
		return foundProduct;
	}

	public static boolean isExistInCart(Product[] cart, int productNo) {
		boolean isExist = false;
		for (Product p : cart) {
			if (p == null) {
				break;
			}
			
			if (productNo == p.getNo()) {
				isExist = true;
				break;
			}
		}
		
		return isExist;
	}
	
	public static void printProduct(Product product) {
		System.out.println("-----------------------------------------------");
		System.out.println("상품번호 : " + product.getNo());
		System.out.println("카테고리 : " + product.getCategory());
		System.out.println("상품이름 : " + product.getName());
		System.out.println("상품가격 : " + product.getPrice());
		System.out.println("상품재고 : " + product.getStock());
		System.out.println("절판여부 : " + product.isSoldOut());
		System.out.println("-----------------------------------------------");
		System.out.println();
	}
	
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
		
		// 장바구니 프로그램 작성하기
		// 	- 상품을 선택해서 장바구니에 담을 수 있다.
		//	- 동일한 상품을 다시 장바구니에 담을 수 없다.
		//	- 장바구니에 저장된 상품을 확인할 수 있다.
		Product[] cart = new Product[100];
		int cartInsertPosition = 0;
		Scanner sc = new Scanner(System.in);
	
		// 1. 키보드 입력을 읽어오는 Scanner객체를 생성한다.
		// 2. 반복문(while문)을 사용해서 아래의 작업을 반복 수행한다.
		// 		1. 메뉴제공 1.장바구니담기 2.장바구니조회 0.종료
		//		2. 메뉴번호를 입력받는다.
		//		3. 메뉴별 처리를 구현한다.
		// 			- [장바구니 담기]는 상품번호를 입력받아서 해당 상품을 cart배열에 저장한다.
		//            cart배열에 동일한 상품번호의 상품이 저장되어 있으면 저장되지 않는다.
		//			- [장바구니 조회]는 현재 cart배열에 저장된 상품정보를 출력한다.
		//			- [종료]는 반복문을 탈출한다.

		while(true) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1. 장바구니 담기 2. 장바구니 조회 0. 종료");
			System.out.println("----------------------------------------------------------");
			
			System.out.print("메뉴를 선택해주세요 : ");
			int menuNo = sc.nextInt();
			
			if (menuNo == 1) {
				System.out.print("장바구니에 담을 상품번호를 입력해주세요(10 ~ 100) : ");
				int no = sc.nextInt();
				
				// cart배열에 입력한 상품번호에 해당하는 상품이 있는지 확인하기
				boolean isExist = App2.isExistInCart(cart, no);
				
				if (isExist) {
					System.out.println("[안내] 해당 번호의 상품이 이미 장바구니에 저장되어 있습니다.");
				} else {
					// products 배열에서 입력한 상품번호에 해당하는 상품 조회하기
					Product product = App2.findProductByProductNo(products, no);
					if (product != null) {
						cart[cartInsertPosition++] = product;
					} else {
						System.out.println("[안내] 해당 번호의 상품이 존재하지 않습니다.");
					}
				}
			} else if(menuNo == 2) {
				if (cartInsertPosition == 0) {
					System.out.println("[안내] 장바구니에 저장된 상품이 없습니다.");
				} else {
					for (Product p : cart) {
						if (p == null) {
							break;
						}
						App2.printProduct(p);
					}
				}
			} else if(menuNo == 0) {
				System.out.println("[종료]");
				break;
			}
		}
		
		sc.close();
	}
}
