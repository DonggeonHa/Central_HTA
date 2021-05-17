package day4.markup;

public class AccountCopyApp {

	public static void main(String[] args) {
		Account[] arr = new Account[3];
		
		arr[0] = new Account("홍길동", 1000000, 1111);
		arr[1] = new SecretAccount("김유신", 2000000, 1111, 1234);
		arr[2] = new Account("강감찬", 3000000, 1111);
		
		for (Account item : arr) {
			// System.out.println(item);
			// System.out.println(item instanceof UnCopiable);
			if (!(item instanceof UnCopiable)) {
				System.out.println("[" + item.getName() + "] 님 계좌를 복사합니다.");
			} else {
				System.out.println("[" + item.getName() + "] 님 계좌는 비밀계좌여서 복사할 수 없습니다.");
			}
		}
	}
}
