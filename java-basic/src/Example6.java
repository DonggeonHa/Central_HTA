import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 고객명, 고객등급, 총구매금액을 입력받는다.
		 * 고객명, 고객등급, 총구매금액, 적립포인트, 보너스포인트를 출력한다.
		 * 
		 * 등급별 적립포인트는 1등급은 5%, 2등급은 3%, 3등급은 1%다.
		 * 보너스 포인트 지급기준
		 * 1등급은 300만원 초과한 부분에 대해서 10% 추가포인트 지급
		 * 2등급은 150만원 초과한 부분에 대해서 5% 추가포인트 지급
		 * 3등급은 100만원 초과한 부분에 대해서 3% 추가포인트 지급
		 */
		
		System.out.printf("고객명 : ");
		String customerName = sc.next();
		System.out.printf("고객등급 : ");
		int customerGrade = sc.nextInt();
		System.out.printf("총구매금액: ");
		int totalPrice = sc.nextInt();
		
		int point = 0;
		int bonusPoint = 0;
		if(customerGrade == 1) {
			if(totalPrice > 3_000_000) {
				bonusPoint = (int) ((totalPrice - 3_000_000) * 0.1);
				point = (int) (bonusPoint + (3_000_000 * 0.05));
			} else {
				point = (int) (totalPrice * 0.05);
			}
		} else if (customerGrade == 2) {
			if(totalPrice > 1_500_000) {
				bonusPoint = (int) ((totalPrice - 1_500_000) * 0.05);
				point = (int) (bonusPoint + (1_500_000 * 0.03));
			} else {
				point = (int) (totalPrice * 0.03);
			}
		} else if (customerGrade == 3) {
			if(totalPrice > 1_000_000) {
				bonusPoint = (int) ((totalPrice - 1_000_000) * 0.03);
				point = (int) (bonusPoint + (1_000_000 * 0.01));
			} else {
				point = (int) (totalPrice * 0.01);
			}
		}
		
		System.out.println("========================================");
		System.out.println("고객명 : " + customerName);
		System.out.println("고객등급 : " + customerGrade);
		System.out.println("총구매금액 : " + totalPrice);
		System.out.println("적립포인트 : " + point);
		System.out.println("보너스포인트 : " + bonusPoint);
		System.out.println("========================================");
		
		sc.close();
	}

}
