package day5;

public class GoogleMail implements Mail {

	@Override
	public void sendMail(String from, String to, String title, String text) {
		System.out.println("### Google Mail로 발송");
		System.out.println("-----------------------------------------------------");
		System.out.println("메일 보내는 곳 : " + from);
		System.out.println("메일 받는 곳 : " + to);
		System.out.println("메일 제목 : " + title);
		System.out.println("메일 내용 : " + text);
		System.out.println("-----------------------------------------------------");
	}
	
}
