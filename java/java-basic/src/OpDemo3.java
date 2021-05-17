
public class OpDemo3 {

	public static void main(String[] args) {
		// 증감 연산자
		// ++ --
		int num1 = 10;
		
		num1++;
		num1++;
		num1++;
		System.out.println(num1);
		
		++num1;
		++num1;
		++num1;
		System.out.println(num1);

		// 증감연산자를 다른 연산자와 같이 사용하는 경우 연산자를 붙이는 위치에 따라서 결과값이 달라진다.
		// 증감연산자를 다른 연산자와 같이 사용하지 말라. 가독성이 엄청 떨어진다
		int num2 = 100;
		int num3 = 100;
		
		int x = ++num2;		// num2의 값을 1 증가시킨 후 x에 대입한다.
		int y = num3++;		// num3의 값을 y에 대입한 후 num3의 값을 1증가시킨다.
		
		System.out.println(x); // 101이 출력됨
		System.out.println(y); // 100이 출력됨
		
		// 증감식과 다른 연산자를 분리해서 코딩한다.
		int num4 = 300;
		int num5 = 300;
		
		num4++;
		++num5;
		
		int l = num4;
		int m = num5;
		
		System.out.println(l);
		System.out.println(m);
		
	}

}
