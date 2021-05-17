package day3.template;

public class ATM {

	// AbstractBanking클래스의 구현객체를 참조하는 참조변수
	// 이체작업, 입금작업, 출금작업, 대출작업 등을 구현한 다양한 AbstractBanking의 하위객체를
	// 참조할 수 있다.
	private AbstractBanking banking;
	
	// AbstractBanking 하위객체의 주소값을 전달받는 Setter 메소드
	public void setBanking(AbstractBanking banking) {
		this.banking = banking;
	}
	
	// 뱅킹작업을 실행하는 메소드
	// 뱅킹작업과 관련된 일련의 작업들을 순서대로 실행해주는 process() 메소드를 실행한다.
	public void runBanking() {
		banking.process();
	}
}
