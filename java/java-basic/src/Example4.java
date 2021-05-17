import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 고객이름, 고객등급(1,2,3 중 하나다), 누적구매횟수, 당일총구매금액을 입력받는다
		 * 고객이름, 고객등급, 누적구매횟수, 당일총구매금액, 적립포인트, 사은품지급여부를 출력한다.
		 * 적립포인트는 1등급의 고객의 경우 당일구매금액의 3%고, 나머지는 1%다.
		 * 사은품지급여부는 등급이 1등급이거나, 누적구매횟수가 5회이상이거나, 당일총구매금액이 30만원 이상이면
		 * 사은품지급대상이다.(사은품지급여부는 "지급대상임", "지급대상아님"으로 출력한다.)
		 */
		
		System.out.printf("고객이름 : ");
		String customerName = sc.next(); 
		System.out.printf("고객등급 : ");
		int customerRating = sc.nextInt();
		System.out.printf("누적구매횟수 : ");
		int totalOrderCount = sc.nextInt();
		System.out.printf("당일총구매금액 : ");
		int todayTotalPrice = sc.nextInt();
		
		double mileagePoint = customerRating == 1 ? todayTotalPrice * 0.03 : todayTotalPrice * 0.01;
		String giftPaymentStatus = customerRating == 1 || totalOrderCount >= 5 || todayTotalPrice >= 300_000 ? "지급대상임" : "지급대상아님";
		
		System.out.println("================================================");
		System.out.println("고객이름 : " + customerName);
		System.out.println("고객등급 : " + customerRating);
		System.out.println("누적구매횟수 : " + totalOrderCount);
		System.out.println("당일총구매금액 : " + todayTotalPrice);
		System.out.println("적립포인트 : " + mileagePoint);
		System.out.println("사은품지급대상 : " + giftPaymentStatus);
		System.out.println("================================================");
	}

}
