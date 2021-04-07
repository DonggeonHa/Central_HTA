package day5;

public class BookApp {

	public static void main(String[] args) {
		
		// 객체 생성하기 - 기본 생성자 메소드 호출
		Book book1 = new Book();
		
		//book1.no = 100;
		//book1.title("이것이 자바다");
		//book1.write("신용권");
		//book1.publisher("한빛미디어");
		//book1.price(35000);
		//book.isSoldOut = false;
		//book1.discountRate = 0.15;
		
		// setter 메소드를 사용해서 멤버변수 초기화하기
		book1.setNo(100);
		book1.setTitle("이것이 자바다");
		book1.setWriter("신용권");
		book1.setPublisher("한빛미디어");
		book1.setPrice(35000);
		book1.setSoldOut(false);
		book1.setDiscountRate(0.15);
		
		// 생성자를 이용한 멤버변수 초기화
		Book book2 = new Book(200, "자바의정석", "남궁성", "도우출판사", 28000, false, 0.15);
//		System.out.println("번호 : " + book2.no);
//		System.out.println("제목 : " + book2.title);
//		System.out.println("저자 : " + book2.writer);
//		System.out.println("출판사 : "+ book2.publisher);
//		System.out.println("가격 : " + book2.price);
//		System.out.println("품절여부 : " + book2.isSoldOut);
//		System.out.println("할인가격 : " + book2.discountRate);
		System.out.println("번호 : " + book2.getNo());
		System.out.println("제목 : " + book2.getTitle());
		System.out.println("저자 : " + book2.getWriter());
		System.out.println("출판사 : "+ book2.getPublisher());
		System.out.println("가격 : " + book2.getPrice());
		System.out.println("품절여부 : " + book2.isSoldOut());
		System.out.println("할인가격 : " + book2.getDiscountRate());
	}
}
