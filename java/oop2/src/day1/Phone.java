package day1;

public class Phone extends Object {

	private String tel;
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void call() {
		System.out.println("지정된 번호 [" + tel + "]로 전화를 겁니다.");
	}
	
	public void receive() {
		System.out.println("전화를 받습니다.");
	}
}
