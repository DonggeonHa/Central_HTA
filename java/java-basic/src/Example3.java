import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 *  제품명, 가격, 구매수량을 입력받는다
		 *  출력내용은 제품명, 가격, 구매수량, 총구매가격, 적립포인트다.
		 *  적립포인트는 총구매가격의 1%다
		 */
		
		// 제품명을 입력하라는 메시지를 화면에 출력한다.
		// 제품명을 입력받아서 변수에 저장한다.
		System.out.printf("제품명 : ");
		String productName = sc.nextLine();
		
		// 가격을 입력하라는 메시지를 화면에 출력한다.
		// 가격을 입력받아서 변수에 저장한다.
		System.out.printf("가격 : ");
		int price = sc.nextInt();
		
		// 구매수량을 입력하라는 메시지를 화면에 출력한다.
		// 구매수량을 입력받아서 변수에 저장한다.
		System.out.printf("구매수량 : ");
		int purchaseQuantity = sc.nextInt();
		System.out.println();
		
		// 가격과 구매수량을 곱해서 총구매가격을 계산하고 변수에 저장한다.
		int totalPurchasePrice = price * purchaseQuantity;
		
		// 총 구매가격에 적립률을 곱해서 적립포인트를 계산하고 변수에 저장한다.
		double mileagePoint = totalPurchasePrice * 0.01;
		
		// 변수에 저장된 모든 값(제품명, 가격, 구매수량, 총구매가격, 적립포인트)를 출력한다.
		System.out.println("====================================================");
		System.out.println("제품명 : " + productName);
		System.out.println("가격 : " + price + "원");
		System.out.println("구매수량 : " + purchaseQuantity);
		System.out.println("총구매가격 : " + totalPurchasePrice);
		System.out.println("적립포인트 : " + mileagePoint);
		System.out.println("====================================================");

	}

}
