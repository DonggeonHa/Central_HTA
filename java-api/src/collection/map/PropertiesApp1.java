package collection.map;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp1 {

	public static void main(String[] args) throws IOException {
		// Properties
		// 		Map<K, Y> 인터페이스를 구현한 클래스다
		// 		K와 V의 타입으로 String타입만 사용한다.
		//		K와 V를 설정하지 않는다.
		//		properties파일에 설정된 설정정보를 읽어온다.
		
		// properties파일에 정의된 설정정보를 처리하는 Properties객체 생성하기
		Properties prop = new Properties();
		// database.properties파일을 읽어오는 FileReader객체를 생성한다.
		FileReader reader = new FileReader("src/collection/map/database.properties");
		// Properties객체의 load()메소드로 properties파일을 읽어온다.
		// properties파일을 읽어올 때 필요한 FileReader객체를 전달한다.
		prop.load(reader);
		System.out.println(prop);
		
		// properties파일에 설정된 설정정보 조회하기
		String value1 = prop.getProperty("db.driver-className");
		String value2 = prop.getProperty("db.url");
		String value3 = prop.getProperty("db.username");
		String value4 = prop.getProperty("db.password");
		
		System.out.println("### 데이터베이스 연결관련 설정정보 ###");
		System.out.println("클래스명 : " + value1);
		System.out.println("접속URL  : " + value2);
		System.out.println("접속계정 : " + value3);
		System.out.println("접속비번 : " + value4);
		
		String value5 = prop.getProperty("file.upload.max-upload-size");
		String value6 = prop.getProperty("file.upload.save-directory");
		System.out.println("### 파일업로드 관련 설정정보 ###");
		System.out.println("최대 업로드 사이즈 : " + value5);
		System.out.println("업로드파일 저장경로 : " + value6);
		
	}
	
}
