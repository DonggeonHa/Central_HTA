import java.util.Scanner;

public class IfDemo3 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 내포된 if문 사용하기
		 * 고객명, 고객등급(1, 2, 3 중 하나), 총구매금액을 입력받는다.
		 * 고객등급이 1등급인 경우, 총구매금액의 3%를 적립포인트로 지급한다.
		 * 단, 총구매금액이 100만원을 초과하는 경우,
		 * 100만원을 제외한 나머지 금액에 대해서는 5%를 적립한다.
		 *  그 외는 총구매금액에 관계없이 총구매금액의 1%를 적립포인트로 지급한다.
		 *  
		 *  고객명, 고객등급, 총구매금액, 적립포인트를 출력한다.
		 */
		
		System.out.printf("고객명 : ");
		String customerName = sc.next();
		
		System.out.printf("고객등급 : ");
		int customerGrade = sc.nextInt();
		
		System.out.printf("총구매금액 : ");
		int totalPrice = sc.nextInt();
		
		int point = 0;
		int bonusPoint = 0;
		
		if(customerGrade == 1) {
			if(totalPrice > 1_000_000) {
				// 1등급이고, 구매금액이 100만원 초과인 경우
				// 100만원까지는 3%, 그 이후 금액은 5% 적립
				bonusPoint = (int) ((totalPrice - 1_000_000) * 0.05);
				point = (int) (bonusPoint + (1_000_000 * 0.03));
			} else {
				// 1등급이고, 구매금액이 100만원 이하인 경우
				// 3% 적립
				point = (int) (totalPrice * 0.03);
			}
		} else {
			// 1등급이 아닌 경우
			// 1% 적립
			point = (int) (totalPrice * 0.01);
		}
		
		System.out.println("===============================");
		System.out.println("고객명 : " + customerName);
		System.out.println("고객등급 : " + customerGrade);
		System.out.println("총구매금액 : " + totalPrice);
		System.out.println("보너스포인트 : " + bonusPoint);
		System.out.println("적립포인트 : " + point);
		System.out.println("===============================");
		
		sc.close();
	}
}
