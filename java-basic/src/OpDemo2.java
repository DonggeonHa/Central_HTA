
public class OpDemo2 {

	public static void main(String[] args) {
		// 대입 연산자
		// = += -= *= /= %=
		// 연산자 중에서 우선순위가 가장 낮은 연산자다.
		int num1 = 10;
		
		num1 += 1;		// num1 = num1 + 1
		num1 += 1;
		num1 += 1;
		System.out.println(num1);
		
		num1 += 5;		// num1 = num1 + 5
		num1 += 5;
		num1 += 5;
		System.out.println(num1);
		
		num1 -= 10;		// num1 = num1 - 10
		num1 -= 10;
		System.out.println(num1);

	}

}
