package collection.map.message;

public class MessageNotification1 {
	
	private KakaoTalkMessageSender katalkSender = new KakaoTalkMessageSender();
	private EmailMessageSender emailSender = new EmailMessageSender();
	private SmsMessageSender smsSender = new SmsMessageSender();
	
	public void notice(Customer customer, String from, String title, String content) {
		String[] messageTypes = customer.getMessages();
		
		for (String messageType : messageTypes) {
			if ("sms".equals(messageType)) {
				smsSender.sendMessage(from, customer.getName(), title, content);
			} else if ("katalk".equals(messageType) ) {
				katalkSender.sendMessage(from, customer.getName(), title, content);
			} else if ("mail".equals(messageType) ) {
				emailSender.sendMessage(from, customer.getName(), title, content);
			} 
		}
	}
}
