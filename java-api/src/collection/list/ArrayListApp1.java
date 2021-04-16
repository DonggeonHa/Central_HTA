package collection.list;

import java.util.ArrayList;

public class ArrayListApp1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		// ArrayList객체에 데이터(문자열 데이터) 저장하기
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("유관순");
		
		// ArrayList객체에 저장된 데이터 갯수 조회하기
		int size = names.size();
		System.out.println("저장된 데이터 갯수 : "  + size);
		
		// ArrayList객체에 저장된 데이터 전부 출력하기
		System.out.println("### ArrayList에 저장된 데이터 출력");
		for (String item : names) {
			System.out.println(item);
		}
		
		// ArrayList객체에 "김유신" 데이터가 존재하는지 확인하기
		boolean isSaved = names.contains("김유신");
		System.out.println("김유신이 저장되어 있는가? " + isSaved);
		
		// ArrayList객체에서 "강감찬" 데이터 삭제하기
		System.out.println("### 강감찬 데이터 삭제하기");
		names.remove("강감찬");
		
		System.out.println("### ArrayList에 저장된 데이터 출력");
		for (String item : names) {
			System.out.println(item);
		}
		
		// ArrayList객체에서 저장된 모든 데이터 삭제하기
		System.out.println("### ArrayList에 저장된 데이터 전부 삭제");
		names.clear();
		
		System.out.println("### ArrayList에 저장된 데이터 출력");
		for (String item : names) {
			System.out.println(item);
		}
	}
}
