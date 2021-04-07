package day1;

public class PhoneApp {

	public static void main(String[] args) {
		// Phone 객체 생성하기
		System.out.println("### Phone 객체 사용하기");
		Phone phone = new Phone();
		phone.setTel("010-1234-5678");
		phone.call();
		
		// FeatherPHone 객체 생성하기
		System.out.println("### FeaturePhone 객체 사용하기");
		FeaturePhone featurePhone = new FeaturePhone();
		featurePhone.setTel("010-3333-3333");
		featurePhone.setPixel(7000000);					// FeaturePhone의 고유한 속성
		featurePhone.call();							// phone객체로부터 물려받은 기능
		featurePhone.takePicture();						// FeaturePhone의 고유한 속성
		
		// SmartPhone 객체 생성하기
		System.out.println("### SmartPhone 객체 사용하기");
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.setTel("010-4444-4444");
		smartPhone.call();
		smartPhone.setIp("192.168.0.1");
		smartPhone.setEmailAddress("hong@gmail.com");
		smartPhone.web();
		smartPhone.mail();
		
	}
}
