
public class ArrayDemo2 {

	public static void main(String[] args) {
		String[] names = {"김유신", "강감찬", "이순신"};
		int[] scores = {100, 90, 50 , 70, 60};
		double[] rates = {0.03, 0.1, 0.05};
		
		// for문
		for (int i = 0; i < names.length; i++) {
			String x = names[i];
			System.out.println(x);
		}
		for (int i = 0; i < scores.length; i++) {
			int y = scores[i];
			System.out.println(y);
		}
		for (int i = 0; i < rates.length; i++) {
			double z = rates[i];
			System.out.println(z);
		}
		
		// 향상된 for문 <-- 배열과 콜렉션에 대해서만 사용할 수 있는 특별한 for문
		/*
		 * 배열의 크기만큼 for문의 코드블록이 자동으로 반복실행된다.
		 * 배열에 저장된 값이 순서대로 앞에서 생성한 변수에 자동으로 저장된다.
		 * 배열의 값이 순서대로 저장되는 변수의 타입은 배열에 저장된 값의 타입과 동일한 타입이어야한다.
		 * 즉, 배열에서 순서대로 값을 하나 조회에서 앞에 생성한 변수에 저장하고, 코드블록을 실행시킨다.
		 * for (타입 변수명 : 배열) {
		 * 		수행문에서 변수에 저장된 값을 사용한다.
		 * 		수행문;
		 * 		수행문;		  
		 * }
		 */
		
		System.out.println("향상된 for문 사용하기");
		
		//
		// - names 배열에서 처음부터 끝까지 저장된 값을 하나씩 조회해서 변수 a에 순서대로 저장된다.
		// - 변수 a에 값이 저장되면 블록의 수행문이 실행된다.
		// - names 배열이 String값이 여러개 저장되는 배열이기 때문에 
		//	 값이 순서대로 저장된 변수 a의 타입도 String이다.
		for (String a : names) {
			System.out.println(a);
		}
		
		for (int b : scores) {
			System.out.println(b);
		}
		
		for (double c : rates) {
			System.out.println(c);
		}
	}

}
