package day3.template;

public class Deposit extends AbstractBanking {

	@Override
	public void job() {
		System.out.println("입금액을 입력받는다.");
		System.out.println("금액을 확인한다.");
		System.out.println("잔액을 증가시킨다");
		System.out.println("입금결과를 표시한다.");
	}
}
