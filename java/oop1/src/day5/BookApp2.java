package day5;

public class BookApp2 {

	public static void main(String[] args) {
		
		Book book1 = new Book(100, "자바의 정석", "남궁성", "도우출판사", 35000, false, 0.15);
		Event event1 = new Event("동영상강의 특가", "구매고객에게 저자의 동영상 강의를 제공합니다.", "4월1일", "4월 15일", false);
		Gift gift1 = new Gift("책받침", 500);
		
		// book1이 참조하는 Book객체의 event 멤버변수에 event1이 참조하는 Event객체의 주소값을 전달한다
		book1.setEvent(event1);
		// book1이 참조하는 Book객체의 gift 멤버변수에 gift1이 참조하는 Event객체의 주소값을 전달한다
		book1.setGift(gift1);
		
		// book1이 참조하는 Book객체에 연결된 Event객체의 주소값 조회하기
		Event e = book1.getEvent();
		
		// Book객체에 event1이 참조하는 Event객체가 연결되어있는 경우
		// event1, e, book1.getEvent() 전부다 같은 Event객체의 주소값을 가지고 있거나, 반환한다.
		// System.out.println(event1);
		// System.out.println(e);
		// System.out.println(book1.getEvent());
		
		// Book객체에 event2이 참조하는 Event객체가 연결되어있는 경우
		// event1, e, book1.getEvent() 전부다 같은 Event객체의 주소값을 가지고 있거나, 반환한다.
		// System.out.println(event2);
		// System.out.println(e);
		// System.out.println(book1.getEvent());
		
		// book1이 참조하는 Book객체에 연결된 Event객체의 정보 출력하기
		System.out.println(e.getDescription());
		System.out.println(book1.getEvent().getDescription());
		
		// book1이 참조하는 Book이 할인이벤트 진행중인지 확인해보기
		if (book1.getEvent().getTitle().contains("할인")) {
			System.out.println("할인 이벤트 진행중입니다.");
		} else {
			System.out.println("현재 할인 이벤트는 진행하지 않습니다.");
		}
		
	}
}
