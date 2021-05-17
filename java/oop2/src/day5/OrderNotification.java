package day5;

public class OrderNotification {
	
	private Mail mail;
	private Messenger messenger;
	
	public void setMail(Mail mail) {
		this.mail = mail;
	}
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void noticeOrderInfo(String from, String to, String title, String content) {
		mail.sendMail(from, to, title, content);
		messenger.send(to, from, content);
		
	}
}
