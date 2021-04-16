package collection.set;

import java.util.HashSet;

public class HashSetApp1 {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		
		System.out.println("### HashSet 객체에 문자열 저장하기");
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("유관순");
		names.add("안창호");
		names.add("유관순");	// 저장되지 않음
		names.add("안중근");
		
		System.out.println("### 저장된 문자열 출력하기");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
