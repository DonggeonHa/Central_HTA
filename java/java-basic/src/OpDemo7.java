
public class OpDemo7 {
	public static void main(String[] args) {
		// 기본자료형의 형변환
		// 기본자료형 타입의 값을 다른 타입의 값으로 변환하는 것이다.
		// 정수 -> 실수, 실수 -> 정수, 문자 -> 정수, 정수 -> 문자로 변환하는 것만 가능하다.
		//
		// byte -> short -> int -> long -> float -> double
		
		// 자동 형변환
		int a = 10;		// [0][0][0][00001010]
		long b = a;		// [0][0][0][00001010] -> [0][0][0][0][0][0][0][00001010]
		float c = a;	// 10 -> 10.0 a에서 복사해 온 값이 10.0으로 변환된 후 c에 대입된다
		double d = a;	// 10 -> 10.0 a에서 복사해 온 값이 10.0으로 변환된 후 d에 대입된다
		System.out.println("a의 값 : " + a);
		System.out.println("long타입의 변수 : " + b);
		System.out.println("float타입의 변수 : " + c);
		System.out.println("double타입의 변수 : " + d);
		
		System.out.println(3 / 4);			// 0		<-- 정수/정수
		System.out.println(3.0 / 4.0);		// 0.75		<-- 실수/실수
		System.out.println(3.0 / 4);		// 0.75		<-- 실수/정수
		System.out.println(3 / 4.0);		// 0.75		<-- 정수/실수
		
		// 수동 형변환
		double x = 3.14;
		float l = (float)x;		// double타입의 값을 float타입의 값으로 형변환 후 l에 대입한다.
		long m = (long)x;		// double타입의 값을 long타입의 값으로 형변환 후 m에 대입한다
		int n = (int)x;			// double타입의 값을 int타입의 값으로 형변환 후 n에 대입한다
		System.out.println("x의 값 : " + x);
		System.out.println("l의 값 : " + l);
		System.out.println("m의 값 : " + m);
		System.out.println("n의 값 : " + n);
		
		// 평균 계산하기
		int kor = 70;				// 국어점수
		int eng = 100;				// 영어점수
		int math = 74;				// 수학점수
		int subjectCount = 3;		// 과목 수
		
		// 소숫점 없는 평균값
		int average = (kor + eng + math) / subjectCount; 		// 정수 <- (정수+정수+정수)/정수
																// 81
		
		// 소숫점 있는 평균값
		double average2 = (kor + eng + math) / subjectCount; 	// 실수 <- 정수 <- (정수+정수+정수)/정수
																// 81.0 <- 81
		
		// 소숫점 있는 평균값
		double average3 = (kor + eng + math) / (double)subjectCount; 	// 실수 <- 정수 <- (정수+정수+정수)/정수
																		// 81.33333333
		
		System.out.println("소숫점이 없는 평균값: " + average);
		System.out.println("소숫점이 있는 평균값: " + average2);
		System.out.println("소숫점이 있는 평균값: " + average3);
				
		// 문자와 정수간의 형변환
		// int -> char
		// 정수 65에 해당하는 유니코드문자가 변수에 저장된다.
		//								 유니코드문자	16진수	   10진수
		char ch1 = 65;			// A	<-	\u0041	<-	0x41	<- 65
		char ch2 = 44032;		// 가	<-	\uac00	<-	0xac00	<- 44032
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println((char) 65);	// int	-> char
		System.out.println((int) 'A');	// char -> int
	}
}
