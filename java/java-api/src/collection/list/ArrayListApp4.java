package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListApp4 {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(10, "노트북", 200, 2));
		products.add(new Product(20, "핸드폰", 160, 1));
		products.add(new Product(30, "태블릿", 85, 1));
		products.add(new Product(40, "스마트워치", 50, 1));
		
		System.out.println("### Iterator를 사용해서 ArrayList객체에 저장된 Product객체 조회하기");
		Iterator<Product> iter = products.iterator();
		while (iter.hasNext()) {
			Product p = iter.next();
			System.out.println("번호 : " + p.getNo());
			System.out.println("이름 : " + p.getName());
			System.out.println("가격 : " + p.getPrice());
			System.out.println("포인트 : " + p.getPoint());
			System.out.println();
		}
		
		
	}
}
