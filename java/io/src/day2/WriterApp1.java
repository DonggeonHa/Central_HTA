package day2;

import java.io.IOException;
import java.io.PrintWriter;

public class WriterApp1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * PrintWriter
		 * 		- 출력전용 문자스트림 클래스다.
		 * 		- 직접 텍스트 데이터를 쓰기 가능한 스트림이다.
		 * 		- OutputStream, Writer 스트림에 추가기능을 제공하는 보조스트림으로 사용할 수 있다.
		 * 		- 추가기능
		 * 			* 줄바꿈문자를 자동으로 추가하는 출력메소드를 제공한다. println(데이터);
		 * 			* auto-flush 기능을 제공한다.
		 * 		- 생성자
		 * 			PrintWriter(String filename)
		 * 			PrintWriter(File file)
		 * 			PrintWriter(File file, String charsetName)
		 * 				File객체가 지정하는 파일에 기록한다.
		 * 				charsetName은 문자 인코딩 방식을 지정하는 것이다.
		 * 			PrintWriter(String filename)
		 * 			PrintWriter(String filename, String charsetName)
		 * 				filename이 지정하는 파일에 기록한다.
		 * 			PrintWriter(OutputStream out)
		 * 			PrintWriter(OutputStream out, boolean autoFlush)
		 * 			PrintWriter(OutputStream out, boolean autoFlush, Charset charset)
		 * 				연결되는 OutputStream으로 텍스트를 출력한다.
		 * 				autoFlush가 true로 지정되면(기본값은 false) println()으로 출력하는 내용은 내부 버퍼가 가득차지 않아도 자동으로 출력된다
		 * 				Charset 객체로 문자 인코딩 방식을 지정한다.
		 * 			PrintWriter(Writer out)
		 * 			PrintWriter(Writer out, boolean autoFlush)
		 * 				연결되는 Writer 스트림으로 텍스트를 출력한다.
		 * 		- 주요 메소드
		 * 			* void writer(String text)
		 * 				텍스트를 출력한다.
		 * 			* void println(String text)
		 * 				텍스트를 출력하고 줄바꿈 문자를 추가한다.
		 */
		PrintWriter writer = new PrintWriter("src/day2/sample1.txt");
		
		// 파일에 기록된 데이터가 줄바꿈 되지 않음
		writer.write("김유신,100,100,100");
		writer.write("김유신,100,100,100");
		writer.write("김유신,100,100,100");
		writer.write("김유신,100,100,100");
		writer.write("김유신,100,100,100");
		writer.println();
		// 파일에 기록된 데이터가 줄바꿈 됨
		writer.println("김유신,100,100,100");
		writer.println("김유신,100,100,100");
		writer.println("김유신,100,100,100");
		writer.println("김유신,100,100,100");
		writer.println("김유신,100,100,100");
		writer.println("김유신,100,100,100");
		
		writer.close();
	}
}
