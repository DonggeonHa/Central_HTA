package collection.map;

import java.util.HashMap;

public class HashMapApp1 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		System.out.println("### Map객체에 kmey, value 저장하기");
		map.put("hong", "홍길동");
		map.put("kimys", "김유신");
		map.put("lee", "이순신");
		map.put("kang", "강감찬");
		map.put("rks", "유관순");
		map.put("lee", "이성계"); // key값이 같으면 맨 마지막에 저장된 값이 해당 key의 값이다.
		
		System.out.println("### Map객체에 저장된 Entry(key와 value의 쌍) 삭제하기");
		map.remove("kang");
		
		System.out.println("### Map 객체에 저장된 값 출력해보기");
		String value1 = map.get("hong");
		String value2 = map.get("lee");
		String value3 = map.get("kang");
		
		System.out.println("hong ->" + value1);
		System.out.println("lee ->" + value2);
		System.out.println("kang ->" + value3);
	}
}
