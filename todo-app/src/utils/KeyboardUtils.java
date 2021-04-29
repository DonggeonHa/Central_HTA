package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KeyboardUtils {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * 키보드 입력을 읽어서 문자열로 반환한다.
	 * @return 문자열
	 */
	public static String readString() {
		try {
			return reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 키보드 입력을 읽어서 정수로 반환한다.
	 * @return 정수값
	 */
	public static int readInt() {
		try {
			return Integer.parseInt(reader.readLine());
		} catch (IOException | NumberFormatException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 키보드 입력을 읽어서 정수로 반환한다.
	 * @return 정수값
	 */
	public static long readLong() {
		try {
			return Long.parseLong(reader.readLine());
		} catch (IOException | NumberFormatException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 키보드 입력을 읽어서 실수로 반환한다.
	 * @return 실수값
	 */
	public static double readDouble() {
		try {
			return Double.parseDouble(reader.readLine());
		} catch (IOException | NumberFormatException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 키보드 입력을 읽어서 불린값을 반환한다.
	 * @return 불린값
	 */
	public static boolean readBoolean() {
		try {
			return Boolean.parseBoolean(reader.readLine());
		} catch (IOException | NumberFormatException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 키보드 입력을 읽어서 Date로 반환한다.
	 * @return 날짜
	 */
	public static Date readDate() {
		try {
			return dateFormat.parse(reader.readLine());
		} catch (IOException | ParseException e) {
			throw new RuntimeException(e);
		}
	}
	
}
