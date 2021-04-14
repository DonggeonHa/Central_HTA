package format;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatApp {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("날짜 시간정보 : " + today);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
//		String text = dateFormat.format(today);
//		System.out.println(text);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
//		String text = dateFormat.format(today);
//		System.out.println(text);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 M월");
//		String text = dateFormat.format(today);
//		System.out.println(text);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String text = dateFormat.format(today);
//		System.out.println(text);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
//		String text = dateFormat.format(today);
//		System.out.println(text);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("a h시 m분 s초");
//		String text = dateFormat.format(today);
//		System.out.println(text);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("a hh:mm:ss", Locale.US);
//		String text = dateFormat.format(today);
//		System.out.println(text);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 M월 d일 EEEE");
//		String text = dateFormat.format(today);
//		System.out.println(text);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 M월 d일 EEEE a h시 m분 s초");
		String text = dateFormat.format(today);
		System.out.println(text);
		
	}
}
