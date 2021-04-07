package day3;


/*
 * static import문
 *  - 클래스의 static 변수, static 메소드를 import한다.
 *  - static import문을 사용하면, 소스코드에서 static 변수나 static 메소드를 사용할 떄
 *    클래스이름을 생략하고 사용 할 수 있다.
 *  - 작성 예
 *  	import static java.lang.Math.*;
 *  		Math 클래스의 모든 static 변수와 static 메소드를 import 한다.
 *  	import static java.lang.Math.PI;
 *  		Math 클래스의 static 변수(상수) PI를 import한다.
 *  	import static java.lang.Math.random;
 *  		Math 클래스의 static 메소드 random()을 import한다.
 */
import static java.lang.Math.*;

public class StaticImportApp {

	public static void main(String[] args) {
//		double value1 = Math.random();
//		double value2 = Math.cos(3.14);
//		long value3 = Math.round(12.54);
//		double value4 = Math.floor(1.6);
		
		// static import문을 사용해서 클래스이름없이 static 메소드를 사용하는 예
		System.out.println("임의의 수 : " + random());
		
		System.out.println();
		System.out.println("반올림된 값(3.2) : " + round(3.2));
		System.out.println("반올림된 값(3.7) : " + round(3.7));
		
		System.out.println();
		System.out.println("바닥값(-3.2) : " + floor(-3.2));
		System.out.println("바닥값(-3.7) : " + floor(-3.7));
		System.out.println("바닥값(3) : " + floor(3));
		System.out.println("바닥값(3.2) : " + floor(3.2));
		System.out.println("바닥값(3.7) : " + floor(3.7));
		
		System.out.println();
		System.out.println("천장값(-3.2) : " + ceil(-3.2));
		System.out.println("천장값(-3.7) : " + ceil(-3.7));
		System.out.println("천장값(3) : " + ceil(3));
		System.out.println("천장값(3.2) : " + ceil(3.2));
		System.out.println("천장값(3.7) : " + ceil(3.7));
		
	}
}
