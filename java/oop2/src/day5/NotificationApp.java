package day5;

public class NotificationApp {

	public static void main(String[] args) {
		// Notification 객체 생성
		EventNotification event = new EventNotification();
		OrderNotification order = new OrderNotification();
		
		// Mail, Messenger, SNS 구현객체 생성
		// Mail 구현객체 생성
		GoogleMail gmail = new GoogleMail();
		
		// Messenger 구현객체 생성
		KakaoTalk katalk = new KakaoTalk();
		Line line = new Line();
		
		// SNS 구현객체 생성
		Instagram instar = new Instagram();
		Facebook facebook = new Facebook();
		
		// EventNotification 객체에 Mail, Messenger, SNS 구현객체의 주소값 전달하기
		// EventNotification객체가 의존하는(필요로 하는, 사용하는) 객체를 제공함
		// 의존성 주입(Dependency Injection)
		//		- 특정 객체가 필요로 하는 객체를 제 3자를 통해서 제공받는 것
		//		- EventNotification객체가 필요로 하는 객체를 NotificationApp(제 3자)가 제공해 줌.
		event.setMail(gmail);
		event.setMessenger(katalk);
		event.setSns(instar);
		
		// OrderNotification 객체에 Mail, Messenger 구현객체의 주소값 전달하기
		// OrderNotification객체가 의존하는(필요로 하는, 사용하는) 객체를 제공함
		// 의존성 주입(Dependency Injection)
		order.setMail(gmail);
		order.setMessenger(line);
		
		// 이벤트 안내 보내기
		event.notice("홍보팀", "우수고객", "4월 우수고객 할인 이벤트", "구매금액의 5%를 포인트로 적립합니다");
		// 주문내역 보내기
		order.noticeOrderInfo("가구매장", "홍길동고객님", "배송안내", "입고지연으로 배송이 지연됩니다.");
	
	}
}
