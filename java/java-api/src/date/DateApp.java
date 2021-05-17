package date;

import java.util.Date;

public class DateApp {

	public static void main(String[] args) {
		// java.util.Date
		// - 날짜와 시간정보를 표현하는 객체다.
		
		// 자바가 실행되고 있는 시스템의 현재 날짜와 현재 시간정보를 가진 객체가 생성된다
		Date now = new Date();
		System.out.println(now);
		
		// 유닉스타입값 조회하기
		long time = now.getTime();
		System.out.println(time);
		
		// 유닉스타임값 조회하기2
		long time2 = System.currentTimeMillis();
		System.out.println(time2);
	}
}
