package day2;

public class AccountApp2 {
	public static void main(String[] args) {
		Account2 account2 = new Account2();
		
		// 생성된 Account2객체의 멤버변수에 예금주, 비밀번호, 잔액정보를 저장한다.
		account2.owner = "홍길동";
		account2.balance = 100_000;
		account2.password = 1234;
		
		// 생성된 Account2객체의 계좌정보 출력기능을 실행해서 화면에 예금주, 잔액을 출력한다.
		account2.displayInfo();
		System.out.println();
		
		// 생성된 Account2객체의 입금기능을 실행한다.
        // 생성된 Account2객체의 계좌정보 출력기능을 실행해서 화면에 예금주, 잔액을 출력한다
		account2.deposit(30_000);
		account2.displayInfo();
		System.out.println();
		
		// 생성된 Account2객체의 출금기능을 실행한다.
        // 생성된 Account2객체의 계좌정보 출력기능을 실행해서 화면에 예금주, 잔액을 출력한다.
		account2.withdraw(70_000, 1234);
		account2.displayInfo();
		System.out.println();
		
	}
}
