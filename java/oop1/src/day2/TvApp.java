package day2;

public class TvApp {
	public static void main(String[] args) {
		// Tv 객체 생성하기
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		// Tv 객체의 전원 켜기
		tv1.on();
		// Tv 객체의 현재 채널번호 조회하기
		int channelNumber = tv1.getCurrentChannel();
		System.out.println("현재 채널번호 : " + channelNumber);
		// Tv객체의 채널을 하나 증가시키기
		tv1.channelUp();
		tv1.channelUp();
		
		
		
		// Tv객체의 채널을 24번으로 변경하기
		tv1.changeChannel(24);
		channelNumber = tv1.getCurrentChannel();
		System.out.println("현재 채널번호 : " + channelNumber);
		
		// Tv객체의 채널을 -100번으로 변경하기
		tv1.changeChannel(-100);
		// channel은 은닉화되었따.
		// 외부에서 tv객체의  channel, pwer 멤버변수의 값을 직접 변경할수 없게 되었다.
		// tv1.channel = -100;
		channelNumber = tv1.getCurrentChannel();
		System.out.println("현재 채널번호 : " + channelNumber);
		
		tv2.on();
		
	}
}
