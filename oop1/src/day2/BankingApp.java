package day2;

public class BankingApp {
	public static void main(String[] args) {
		
		// 계좌 등록, 조회, 적금, 이체, 예지금액조회, 비밀번호 변경기능을 제공하는 Banking객체
		Banking banking = new Banking();
		
		// 신규계좌 등록해보기
		// 번호, 예금주, 최초잔액, 비밀번호를 입력받아서 Banking 객체의 신규계좌 개설기능에게 전달한다.
		banking.insertAccount(100, "홍길동", 5000, 1111); // 메소드 호출
		banking.insertAccount(200, "김유신", 25000, 1122); // 메소드 호출
		banking.insertAccount(300, "강감찬", 125000, 1133); // 메소드 호출
		banking.insertAccount(400, "이순신", 5000000, 1144); // 메소드 호출
		banking.insertAccount(500, "유관순", 100045000, 1155); // 메소드 호출
	
		// 조회해보기
		// 계좌번호, 비밀번호를 입력받아서 Banking객체의 조회기능에게 전달해서, 계좌정보를 받아온다.
		Account result1 = banking.getAccountByNo(100, 1111);
		System.out.println("조회된 Account 객체 : " + result1);
		if (result1 != null) {
			System.out.println("### 조회된 계좌번호###");
			System.out.println("계좌번호 : " + result1.no);
			System.out.println("현재잔액 : " + result1.balance);
			System.out.println("통장이율 : " + result1.interestRate);
		} else {
			System.out.println("계좌번호/비밀번호와 일치하는 계좌정보를 찾을 수 없습니다");
		}
		
		Account result2 = banking.getAccountByNo(120, 1234);
		System.out.println("조회된 Account 객체 : " + result2);
		if (result2 != null) {
			System.out.println("### 조회된 계좌번호###");
			System.out.println("계좌번호 : " + result2.no);
			System.out.println("현재잔액 : " + result2.balance);
			System.out.println("통장이율 : " + result2.interestRate);
		} else {
			System.out.println("계좌번호/비밀번호와 일치하는 계좌정보를 찾을 수 없습니다");
		}
		
		// 적금해보기
		// 계좌번호, 입금액을 입력받아서 Banking 객체의 적금기능에게 전달한다.
		
		// 비밀번호 변경해보기
		// 계좌번호, 구비밀번호, 새비밀번호를 입력받아서 Banking객체의 비밀번호 변경기능에게 전달한다. 
	}
}
