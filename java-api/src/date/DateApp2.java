package date;

import java.util.Calendar;
import java.util.Date;

public class DateApp2 {

	public static void main(String[] args) {
		// 현재 날짜 및 시간정보를 포함하고 있는 Date객체 생성하기
		Date now = new Date();
		System.out.println(now);
		
		// 현재 날짜 및 시간정보를 포함하고 있는 Calendar객체 생성하기
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		// 특정한 날짜와 시간정보를 포함하고 있는 Calendar객체 생성하기.
		Calendar cal2 = Calendar.getInstance();
		// 1993년 7월 26일 05시 30분 10초에 해당하는 날짜 정보를 Calendar에 설정 
		cal2.set(1993, 6, 26, 05, 30, 10);	// 무슨 이유인지 모르겠지만 월에 해당되는 숫자는 1월이 0부터 시작해서 해당 월 - 1을 해주어야 한다.
		System.out.println(cal2);
		
		// Calendar객체로부터 Date객체 조회하기
		Date date = cal2.getTime();
		System.out.println(date);
		
		// Calendar객체로부터 유닉스타임 조회하기
		long unixTime = cal2.getTimeInMillis();
		System.out.println("유닉스타임 : " + unixTime);
		
		// 유닉스타임값으로 Date객체 생성하기
		Date date2 = new Date(1000);
		System.out.println(date2);
	}
}
