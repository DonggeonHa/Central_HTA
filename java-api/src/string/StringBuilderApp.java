package string;

public class StringBuilderApp {

	public static void main(String[] args) {
		// 하나의 문자열(String객체)에 담아서 반환한다.
		// * StringBuilder는 String이 아니다.
		// * StringBuilder는 String을 제공하는 기능을 가지고 있는 완전 다른 객체다
		
		// StringBuilder append(값)
		// - 메소드 중복정의 되어 있다.
		// - 전달받은 값을 임시저장소에 추가한다.
		// - StringBuilder를 다시 반환한다
		
		StringBuilder sb =new StringBuilder();
		sb.append("홍길동");			// 이름				- String 값 추가
		sb.append(",");
		sb.append("010-1111-1111");		// 전화번호			- String 값 추가
		sb.append(",");
		sb.append("hong@gmail.com");	// 이메일			- String 값 추가
		sb.append(",");
		sb.append(34);					// 나이				- 정수값 추가
		sb.append(",");
		sb.append(182.6);				// 키				- 실수값 추가
		sb.append(",");
		sb.append(75.2);				// 몸무게			- 실수값 추가
		sb.append(",");
		sb.append('A');					// 혈액형			- 문자값 추가
		sb.append(",");
		sb.append(false);				// 결혼여부			- 불린값 추가
		
		// String toString() 메소드
		// - 임시저장소에 저장된 모든 값을 하나의 문자열에 담아서 반환한다.
	}
}
