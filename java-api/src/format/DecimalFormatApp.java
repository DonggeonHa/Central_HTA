package format;

import java.text.DecimalFormat;

public class DecimalFormatApp {

	public static void main(String[] args) {
		int number = 10_000_000;
		
//		DecimalFormat decimalFormat = new DecimalFormat(",###");
//		String text = decimalFormat.format(number);
//		System.out.println("결과값 : " + text);
		
//		DecimalFormat decimalFormat = new DecimalFormat("#,000");
//		String text = decimalFormat.format(number);
//		System.out.println("결과값 : " + text);
		
		double number2 = 123.4;
		
//		DecimalFormat decimalFormat = new DecimalFormat("#.##");
//		String text = decimalFormat.format(number2);
//		System.out.println("결과값 : " + text);
		
//		DecimalFormat decimalFormat = new DecimalFormat("0.00");
//		String text = decimalFormat.format(number2);
//		System.out.println("결과값 : " + text);
		
		double value = 1.0/3.0;
		System.out.println(value);
		
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		String text = decimalFormat.format(value);
		System.out.println("결과값 : " + text);
		
		
		
	}
}
