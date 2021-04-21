package day3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ExceptionApp1 {

	public static void main(String[] args) {
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("src/day3/sample1.txt"); // 컴퓨터의 입출력 자원 점유
			
			writer.write("finally 블록 연습\n");	// 컴퓨터의 입출력 자원 사용 - 파일에 기록
			writer.write("finally 블록 연습\n");	// 컴퓨터의 입출력 자원 사용 - 파일에 기록
			writer.write("finally 블록 연습\n");	// 컴퓨터의 입출력 자원 사용 - 파일에 기록
			writer.write("finally 블록 연습\n");	// 컴퓨터의 입출력 자원 사용 - 파일에 기록
			writer.write("finally 블록 연습\n");	// 컴퓨터의 입출력 자원 사용 - 파일에 기록
			writer.write("finally 블록 연습\n");	// 컴퓨터의 입출력 자원 사용 - 파일에 기록
			writer.write("finally 블록 연습\n");	// 컴퓨터의 입출력 자원 사용 - 파일에 기록
			
			// 아래의 코드는 try블록내의 모든 수행문이 오류없이 실행ㄷ왼 후에 실행되는 수행문이다.
			// try블록내의 수행문 실행 중 오류가 발생하면 실행되지 않는 수행문이다.
			// * 점유했던 자원을 해제시키는 수행문의 위치로 적절하지 않음.
			// writer.close(); // 프로그램이 점유했던 컴퓨터의 자원을 해제하는 수행문
			
		} catch (IOException e) {
			e.printStackTrace();
			// 아래의 코드는 try블록내의 수행문에서 오류가 발생할 떄만 실행되는 수행문이다
			// * 점유했던 자원을 해제시키는 수행문의 위치로 적절하지 않음.
			// writer.close(); // 프로그램이 점유했던 컴퓨터의 자원을 해제하는 수행문
		} finally {
			// FileWriter객체 생성 후 점유했던 컴퓨터의 자원을 해제하는 수행문
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				// 수행할 작업 없음
			}
		}
	}
}
