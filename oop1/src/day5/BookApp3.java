package day5;

public class BookApp3 {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		
		Event event1 = new Event("20%할인", "4월구매도서 할인행사", "4/1", "4/31", false);
		Event event2 = new Event("신규가입 할인", "4월 두번째 가입고객 할인", "4/5", "4/12", false);
		
		Gift gift = new Gift("머그컵", 3400);
		
		// event1과  gift1이 각각 참조하는 Event객체와 Gift객체의 주소값을 생성자의 매개변수로 전달
		Book book1 = new Book(100, "이것이 자바다", "신용권", "한빛미디어", 35000, false, 0.15, event1, gift);
		
		// event2가 참조하는 Event객체의 주소값과, 객체를 직접 생성해서 그 객체의 주소값이 생성자의
		// 매개변수로 전달
		Book book2 = new Book(120, "자바의 정석", "남궁성", "도우출판사", 28000, false, 0.15, event2, new Gift("책갈피", 1000));
		
		// book3가 참조하는 Book객체에 정의된 setter 메소드에 직접 생성한 Event객체와 Gift객체의 주소값을
		// 메소드의 매게변수로 전달.
		Book book3 = new Book(130, "스프링 인 액션", "심채절", "한빛미디어", 34000, false, 0.1);
		book3.setEvent(new Event("특가할인", "추가구매 고객대상", "4/1", "4/15", false));
		book3.setGift(new Gift("별책부록", 3000));
		
		// books 참조변수가 참조하는 배열객체의 각각의 칸 에 순서대로 위에서 생성한 book 객체의 주소값을 저장하기
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		// books 배열에 저장된 모든 Book객체의 책정보, 해당 이벤트 정보, 사은품정보 출력하기
		for (Book book : books) {
			System.out.println("책 번호 : " + book.getNo());
			System.out.println("책 제목 : " + book.getTitle());
			System.out.println("책 저자 : " + book.getWriter());
			System.out.println("책 출판사 : " + book.getPublisher());
			System.out.println("책 가격 : " + book.getPrice());
			System.out.println("책 할인율 : " + book.getDiscountRate());
			System.out.println("책 품절여부 : " + book.isSoldOut());
			System.out.println("책 이벤트 제목 : " + book.getEvent().getTitle());
			System.out.println("책 이벤트 상세내용 : " + book.getEvent().getDescription());
			System.out.println("책 이벤트 시작일 : " + book.getEvent().getStartDate());
			System.out.println("책 이벤트 종료일 : " + book.getEvent().getEndDate());
			System.out.println("책 사은품 이름 : " + book.getGift().getName());
			System.out.println("책 사은품 가격 : " + book.getGift().getPrice());
		}
		
	}
}
