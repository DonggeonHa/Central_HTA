package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class BridgeStreamApp {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://sample-videos.com/csv/Sample-Spreadsheet-100-rows.csv");
		// 1byte 씩 읽어오는 스트림 획득
		InputStream is = url.openStream();
		// 1글자씩 읽어오는 스트림과 연결
		InputStreamReader isr = new InputStreamReader(is);
		// 
		BufferedReader reader = new BufferedReader(isr);
		
		String text = null;
		while ((text = reader.readLine()) != null) {
			System.out.println(text);
		}
	}
}
