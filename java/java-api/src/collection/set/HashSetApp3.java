package collection.set;

import java.util.HashSet;

public class HashSetApp3 {

	public static void main(String[] args) {
		HashSet<Contact> contacts = new HashSet<Contact>();
		
		contacts.add(new Contact("홍길동", "010-1111-2222", "hong@gmail.com"));
		contacts.add(new Contact("홍길동", "010-2222-2222", "hong231@gmail.com"));
		contacts.add(new Contact("김유신", "010-1111-3332", "kimys@gmail.com"));
		contacts.add(new Contact("홍길동", "010-1111-2222", "hong@gmail.com"));
		
		for (Contact contact : contacts) {
			System.out.println("이름 : " + contact.getName());
			System.out.println("전화 : " + contact.getTel());
			System.out.println("메일 : " + contact.getEmail());
			System.out.println();
		}
	}
}
