package day3.template;

import java.util.Scanner;

public class ATMApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ATM atm = new ATM();
		Deposit deposit = new Deposit();
		Transfer transfer = new Transfer();
		
		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("1. 입금   2.이체   0.종료");
			System.out.println("-----------------------------------");
			
			System.out.print("메뉴번호를 선택하세요 : ");
			int menuNo = sc.nextInt();
			
			if (menuNo == 1) {
				System.out.println("[입금작업]");
				
				atm.setBanking(deposit);
				atm.runBanking();
				
			} else if (menuNo == 2) {
				System.out.println("[이체작업]");
				
				atm.setBanking(transfer);
				atm.runBanking();
				
			} else if (menuNo == 0) {
				System.out.println("[종료]");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다 다시 선택해주세요");
				continue;
			}
		}
	}
}
