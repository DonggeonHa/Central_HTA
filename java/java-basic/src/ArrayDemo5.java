
public class ArrayDemo5 {
	public static void main(String[] args) {
		int[] scores = {79, 88, 91, 100, 55, 95};
		
		// 배열에 저장된 값을 대상으로 최소값, 최대값 구하기
		int min = 100;	// 최소값을 구할 때는 해당값이 가질 수 있는 가장 큰 값을 초기값으로 지정한다.
		int max = 0;	// 최대값을 구할 떄는 해당값이 가질 수 있는 가장 작은 값을 초기값으로 지정한다
		
		// 최소값을 min에 저장된 값보다 배열에서 조회한 값이 더 작을 때만 min의 값을 배열값으로 바꾼다.
		for (int score : scores) {
			if (score < min) {	// 최소값 구하기
				min = score;
			}
		}
		// 최대값은 min에 저장된 값보다 배열에서 조회한 값이 더 클때만 max의 값을 배열의 값으로 바꾼다.
		for (int score : scores) {
			if (score > max) {	// 최대값 구하기
				max = score;
			}
		}
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}
}
