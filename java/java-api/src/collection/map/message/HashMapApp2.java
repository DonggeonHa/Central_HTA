package collection.map.message;

public class HashMapApp2 {

	public static void main(String[] args) {
		MessageNotification1 notification1 = new MessageNotification1();
		
		Customer c1 = new Customer("홍길동", new String[] {"sms", "mail"});
		Customer c2 = new Customer("이순신", new String[] {"katalk"});
		Customer c3 = new Customer("김유신", new String[] {"sms", "mail", "katalk"});
		
		System.out.println("### 메세지 발송 --------------------------------------------");
		notification1.notice(c1, "홍보팀", "여름 신상품 할인", "미리 여름 신상을 준비하세요");
		System.out.println("### 메세지 발송 --------------------------------------------");
		notification1.notice(c2, "홍보팀", "여름 신상품 할인", "미리 여름 신상을 준비하세요");
		System.out.println("### 메세지 발송 --------------------------------------------");
		notification1.notice(c3, "홍보팀", "여름 신상품 할인", "미리 여름 신상을 준비하세요");
		
		String result = 3 + 6 + "abc" + 1 + 5;
		System.out.println(result);
		
		boolean hi = false;
		Boolean hi2 = false;
		String hii = "";
		int x = 20;
	}
}
