package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListApp5 {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(10, "노트북", 1200000, 120));
		products.add(new Product(100, "이어폰", 400000, 45));
		products.add(new Product(160, "스피커", 600000, 60));
		products.add(new Product(30, "태블릿", 1200000, 120));
		products.add(new Product(70, "갤럭시", 1300000, 130));
		products.add(new Product(20, "아이폰", 1600000, 150));
		
		// 오름차순 정렬
		Collections.sort(products);
		// 내림차순 정렬
		Collections.reverse(products);
		
		for (Product item : products) {
			System.out.println(item.getNo()+ "\t" + item.getName() + "\t" + item.getPoint());
		}
	}
}
