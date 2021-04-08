package day4.markup;

public class Account {

	private String name;
	private long balance;
	private int password;
	
	public Account() {}
	
	public Account(String name, long balance, int password) {
		this.name = name;
		this.balance = balance;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
}
