package day1;

public class SmartPhone extends Phone {

	private String ip;
	private String emailAddress;
	

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void web() {
		System.out.println("[" + ip + "] ip 주소로 인터넷을 사용합니다.");
	}
	
	public void mail() {
		System.out.println("[" + emailAddress + "] 이메일 계정으로 메일을 주고 받습니다.");
	}
}
