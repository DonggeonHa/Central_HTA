package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StandardInputApp {

	public static void main(String[] args) throws IOException {
		
		// Scanner와 표준입력스트림을 연결해서 키보드 입력값 읽어오기
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("메세지를 입력하세요");
//		String text = scanner.nextLine();
//		System.out.println("입력 메세지" + text);
//		scanner.close();
		
		// BufferedReader, InputStreamReader와 표준 입력스트림을 연결해서 키보드 입력값 읽어오기
		InputStream is = System.in;							// 키보드와 연결된  InputStream
		InputStreamReader isr = new InputStreamReader(is);	// InputStreamReader와 표준입력스트림 연결
		BufferedReader reader = new BufferedReader(isr);	// 표준입력스트림이 BufferedReader와
		
		// 프로그램 <- BufferedReader <- InputStreamReader <- InputStream <- 키보드
		System.out.print("메세지를 입력하세요 : ");
		String text = reader.readLine();
		System.out.println("입력 메세지 : " + text);
	}
}
