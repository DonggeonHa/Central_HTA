package day2;

public class Account2 {
	// 예금주, 비밀번호, 잔액정보를 저장하는 객체를 위한 클래스다.
	String owner;				// 예금주
	long balance;				// 잔액
	int password;				// 비밀번호
	
	
	// 입금기능
	void deposit(long amount) {
		// 전달받은 금액만큼 멤버변수의 잔액을 증가시킨다.
		balance += amount;
		
	}
	
	// 출금기능
	void withdraw(long amount, int psword) {
		// 전달받은 비밀번호와 멤버변수의 비밀번호가 일치하면 
		// 전달받는 금액만큼 멤버변수의 잔액을 감소시킨다.
		if (password == psword) {
			balance -= amount;
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
	
	// 조회기능
	void displayInfo() {
		// 멤버변수에 저장된 예금주, 잔액정보를 화면에 출력한다.
		System.out.println("예금주 : " + owner);
		System.out.println("잔액정보 : " + balance);
	}
}
