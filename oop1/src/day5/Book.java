package day5;

public class Book {

	private int no;
	private String title;
	private String writer;
	private String publisher;
	private int price;
	private boolean isSoldOut;
	private double discountRate;
	private Event event;
	private Gift gift;
	

	// getter / setter 메소드 정의하기
	/*
	 * getter 메소드
	 * 		멤버변수의 값을 반환하는 메소드다.
	 * 		반환타입은 void가 될 수 없다.
	 * 		메소드명은 get멤버변수명 이다.
	 * 		매게변수는 없다.
	 * 		public 타입 get멤버변수명() {
	 * 			return 멤버변수명
	 * 		}
	 * 
	 * setter 메소드
	 * 		멤버변수의 값을 변경하는 메소드다.
	 * 		반환타입은 항상 void다.
	 * 		매개변수가 항상 있다
	 * 		메소드명은 set멤버변수명(해당 멤버변수의 타입 매개변수)
	 * 		public set set멤버변수명(해당 멤버변수의 타입 변수명) {
	 * 			this.멤버변수명 = 멤버변수명;
	 * 		}
	 */
	public Book() {}
	
	public Book(int no, String title, String writer, String publisher, int price, boolean isSoldOut,
			double discountRate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.isSoldOut = isSoldOut;
		this.discountRate = discountRate;
	}
	
	public Book(int no, String title, String writer, String publisher, int price, boolean isSoldOut,
			double discountRate, Event event, Gift gift) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.isSoldOut = isSoldOut;
		this.discountRate = discountRate;
		this.event = event;
		this.gift = gift;
	}
	
	// 멤버변수 no에 대한 Getter 메소드 정의하기
	public int getNo() {
		return no;
	}
	
	// 멤버변수 no에 대한 Setter 메소드 정의하기
	public void setNo(int no) {
		this.no = no;
	}
	
	// 멤버변수 title에 대한 Getter 메소드 정의하기
	public String getTitle() {
		return title;
	}
	// 멤버변수 title에 대한 setter 메소드 정의하기
	public void setTitle(String title) {
		this.title = title;
	}
	
	// 멤버변수 writer에 대한 Getter 메소드 정의하기
	public String getWriter() {
		return writer;
	}
	// 멤버변수 writer에 대한 Setter 메소드 정의하기
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	// 멤버변수 publisher에 대한 Getter 메소드 정의하기
	public String getPublisher() {
		return publisher;
	}
	// 멤버변수 publisher에 대한 Setter 메소드 정의하기
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// 멤버변수 price에 대한 Getter 메소드 정의하기
	public int getPrice() {
		return price;
	}
	// 멤버변수 price에 대한 Setter 메소드 정의하기
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 멤버변수 isSoldOut에 대한 Getter 메소드 정의하기
	public boolean isSoldOut() {
		return isSoldOut;
	}
	// 멤버변수 isSoldOut에 대한 Setter 메소드 정의하기
	public void setSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}
	
	// 멤버변수 discountRate에 대한 Getter 메소드 정의하기
	public double getDiscountRate() {
		return discountRate;
	}
	// 멤버변수 discountRate에 대한 Setter 메소드 정의하기
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public Event getEvent() {
		return event;
	}
	
	public void setEvent(Event event) {
		this.event = event;
	}
	
	public Gift getGift() {
		return gift;
	}
	
	public void setGift(Gift gift) {
		this.gift = gift;
	}
	
}
