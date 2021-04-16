package collection.map.message;

public interface MessageSender {

	public void sendMessage(String from, String to, String title, String content);
}
