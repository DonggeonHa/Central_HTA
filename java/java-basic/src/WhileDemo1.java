import java.util.Scanner;

public class WhileDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 충전금액
		int balance = 10000;
		
		
		// while문을 이용해서 무한 반복 구현하기
		while (true) {
			System.out.printf("사용금액을 입력하세요 : ");
			int amount = sc.nextInt();
			
			
			if (amount > balance) {
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재 남아있는 충전금액 : " + balance + "원");
			} else {
				System.out.println("결제를 진행합니다.");
				balance -= amount;
				System.out.println("사용금액 : " + amount + "원");
				System.out.println("현재 남아있는 충전금액 : " + balance + "원");
				System.out.println("결재가 완료되었습니다.");
			}
		}
		
		// 사용금액이 남아있는 금액보다 크면, 잔액부족을 표시한다.
		// 사용금액이 남아있는 충전금액보다 작거나 같으면, 충전금액에서 사용금액만큼 차감하고,
		// 사용금액과 현재 남아있는 충전금액을 출력한다.
	}
}
