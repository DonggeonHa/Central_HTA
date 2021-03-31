
public class VarDemo3 {

	public static void main(String[] args) {
		/*
		 * 이름, 전화번호, 이메일, 주소, 나이, 키, 몸무게, 결혼여부 등을 저장할 수 있는 변수를 정의하고
		 * 그 변수에 값을 저장하기
		 * System.out.println(변수명)을 이용해서 변수에 저장된 값 출력하기
		 */
		
		String name = "홍길동";
		String phone = "010-1234-5678";
		String email = "Honggildong@naver.com";
		String address = "서울시 강남구";
		int age = 100;
		double tall = 192.4;
		double weight = 87.01;
		boolean marital = false;
		
		System.out.println("이름 : " + name + "\n전화번호 : " + phone + "\n이메일 : " + email);
		System.out.println("주소 : " + address + "\n나이 : " + age + "\n키 : " + tall);
		System.out.println("몸무게 : " + weight + "\n결혼여부 : " + marital);

	}

}
