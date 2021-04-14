package sample4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

	private static DecimalFormat numberFormat = new DecimalFormat("#,###");
	
	private static String numberToCurrency(int number) {
		return App.numberFormat.format(number);
	}

	public static void main(String[] args) {
		// 상품정보를 조회할 수 있다.
		// 상품을 구매할 수 있다.
		// 상품구매내역을 출력할 수 있다.
		// 총 구매금액, 총 적립포인트를 출력할 수 있다.
		
		// 상품정보가 저장된 배열
		Product[] products = new Product[10];
		products[0] = new Product(10, "맥북프로", 2600000, 1000);
		products[1] = new Product(10, "애플워치", 600000, 600);
		products[2] = new Product(10, "갤럭시워치", 450000, 340);
		products[3] = new Product(10, "아이패드", 800000, 700);
		products[4] = new Product(10, "TV", 400000, 400);
		products[5] = new Product(10, "갤럭시패드", 1000000, 1000);
		products[6] = new Product(10, "에어팟프로", 240000, 200);
		products[7] = new Product(10, "갤럭시버즈", 180000, 150);
		products[8] = new Product(10, "스피커", 50000, 60);
		products[9] = new Product(10, "키보드", 100000, 100);
		
		// 주문정보가 저장된 배열
		Order[] orders = new Order[100];
		int position = 0;
		
		// 1. 상품조회
		//		- products 배열에 저장된 모든 상품을 출력한다.
		// 2. 상품구매
		//		- 상품번호와 수량을 입력받는다
		//		- 상품번호에 해당하는 상품정보를 조회한다.
		//		- 상품번호에 해당하는 상품이 존재하면, 구매정보(Order)객체에 상품정보와 구매수량을 저장한다.
		//		- 구매정보 배열에 구매정보를 저장한다.
		// 3. 구매내역조회
		//		- 구매정보 배열에 저장된 모든 구매정보를 출력한다.
		// 4. 총계조회
		//		- 구매정보 배열에 저장된 구매정보를 사용해서, 총 주문금액, 총 적립포인트를 출력한다.
		//		- 총 주문금액은 상품가격 * 구매수량의 총합이다. 
		//		- 총 적립포인트는 상품포인트 * 구매수량의 총합이다.
		// 0. 종료
		
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.상품조회 2.구매 3.구매내역조회 4.총계조회 0.종료");
			System.out.println("--------------------------------------------------------");
			
			System.out.print("번호를 선택해주세요 : ");
			int menuNo = sc.nextInt();
			
			if (menuNo == 1) {
				
			} else if(menuNo == 2) {
				
			} else if(menuNo == 3) {
				
			} else if(menuNo == 4) {
				
			} else if(menuNo == 0) {
				
			}
		}
		
	}
}
