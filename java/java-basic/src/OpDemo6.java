
public class OpDemo6 {

	public static void main(String[] args) {
		// 조건 연산자(3항 연산자)
		// 조건식 ? 값1 : 값2
		// 조건식이 true로 판정되면 값1이 최종결과가 됨
		// 조건식이 false로 판정되면 값2가 최종결과가 됨
		// 값1과 값2의 데이터타입이 동일해야 한다.
		
		// 시험성적이 60점 이상이라면 합격, 그 외는 불합격이다.
		int score = 80;
		String result1 = score >= 60 ? "합격" : "불합격";
		System.out.println("최종결과 : " + result1);
		
		// 구매금액이 30만원 이상이라면 적립포인트를 3% 적립, 그 외는 1% 적립한다.
		int orderPrice = 100000;
		double point = orderPrice >= 300000 ? orderPrice * 0.03 : orderPrice * 0.01;
		System.out.println("적립포인트 : " + point);

	}

}
