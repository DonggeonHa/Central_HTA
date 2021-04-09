package day5;

public class EventNotification {

	// EventNotification객체가 의존하는 객체의 주소값을 저장할 참조변수 정의
	private Mail mail;
	private Messenger messenger;
	private SNS sns;
	
	// EventNotifincation객체가 의존하는 객체의 주소값을 전달받아서
	// 멤버변수에 대입하는 Setter 메소드 정의
	// 이 Setter 메소드는 EventNotification객체가 필요로 하는 객체를
	// 제공하는 측에서 호출하는 메소드
	public void setMail(Mail mail) {
		this.mail = mail;
	}
	
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void setSns(SNS sns) {
		this.sns = sns;
	}
	
	public void notice(String from, String to, String title, String cotent) {
		// 메일, 메신저, SNS에 이벤트 내용 발송 및 포스팅하기
		mail.sendMail(from, to, title, cotent);
		messenger.send(to, from, cotent);
		sns.post(title, from, cotent);
	}
	
	
}
