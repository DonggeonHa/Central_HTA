
public class OpDemo5 {

	public static void main(String[] args) {
		// 논리 연산자
		// && || !
		// 둘 이상의 비교 연산 결과를 합쳐서 최종 결과를 획득할 때 사용되는 연산자다.(!은 제외)
		// 논리연산자의 좌항/우항에는 불린값이 오거나, 식의 연산결과가 불린값인 것만 위치할 수 있다.
		
		// 자동차 유상거리 판정하기
		// 주행거리가 10만km 이상이거나 사용기간이 3년 이상인 차량은 유상수리 대상이다.
		// 논리합
		int distance = 50000;
		int usedYear = 2;
		
		boolean result1 = distance >= 100000 || usedYear >= 3;
		System.out.println("유상수리 여부 판정 결과 : " + result1);
		
		// 사은품 지급 기준
		// 고객의 등급(1, 2, 3 등급이 있음)이 2등급보다 높거나 같고, 구매금액이 10만원 이상인 경우 사은품 지급 대상이다.
		// 논리곱
		int grade = 3;
		int orderPrice = 500000;
		boolean result2 = grade <= 2 && orderPrice >= 100000;
		System.out.println("사은품 지급 여부 판정결과 : " + result2);
		
		// 장학금 지급 기준
		// 국어, 영어, 수학점수의 평균이 90점 이상이고, 국어 점수가 95점 이상인 경우 장학금 지급 대상이다.
		int kor = 94;
		int eng = 90;
		int math = 92;
		double evg = (kor + eng + math)/3;
		
		boolean result3 = evg >= 90 && kor >= 95;
		System.out.println("장학금 지급 대상 결과 : " + result3);
		
		// 포인트 지급 기준
		// 구매횟수가 10회 이상이거나, 당일 구매금액이, 100만원 이상인 경우 포인트 지급 대상이다.
		int orderCount = 10;
		int todayOrderPrice = 5555555;;
		
		boolean result4 = orderCount >= 10 || todayOrderPrice > 1_000_000;
		System.out.println("포인트 지급 대상 결과 : " + result4);

	}

}
