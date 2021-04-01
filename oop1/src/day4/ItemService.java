package day4;

public class ItemService {
	
	Item[] items = new Item[100];
	int position = 0;
	
	ItemService() {
		// items 배열에 Item객체 5개 등록하기
		items[position++] = new Item(100, "노트북", "갤럭시북", "삼성", 2_000_000); 
		items[position++] = new Item(200, "핸드폰", "아이폰", "애플", 1_800_000); 
		items[position++] = new Item(300, "시계", "아이워치", "애플", 2_400_000); 
		items[position++] = new Item(400, "모니터", "삼성모니터", "삼성", 200_000); 
		items[position++] = new Item(500, "바지", "청바지", "리바이스", 100_000); 
	}
	
	// items 배열에 저장된 모든 Item객체의 번호, 상품명, 가격을 출력한다
	void printAllItems() {
		System.out.println("=== 전체 상품 정보 ==============================");
		System.out.printf("%-5s \t %5s \t %s \n", "상품번호", "상품이름", "가격");
		
		for (Item item : items) {
			if (item == null) {
				break;
			}
			System.out.printf("%-5d \t \t %5s \t %-8d \n", item.no, item.name, item.price);
		}
		System.out.println("=================================================");
	}
	
	// items 배열에 저장된 Item객체 중에서 전달받은 category에 속하는 Item객체의 번호, 상품명, 가격을 출력한다.
	void printItemsByCategory(String category) {
		Item foundItem = null;
		for (Item item : items) {
			if (item == null) {
				break;
			}
			
			if (category.equals(item.category)) {
				foundItem = item;
				break;
			}
		}
		
		if (foundItem == null) {
			System.out.println("["+ category +"] 해당 카테고리가 존재하지 않습니다.");
		} else {
			System.out.println("상품번호 : " + foundItem.no);
			System.out.println("상품이름 : " + foundItem.name);
			System.out.println("상품가격 : " + foundItem.price);
		}
	}
	
	// items 배열에 저장된 Item객체 중에서 전달받은 상품명을 포함하고 있는 Item객체의 번호, 상품명, 가격을 출력한다.
	// .equals(name)은 상품명이 name과 일치하면 true
	// .contains(name)은 상품명에 name이 포함되어 있으면 true
	void printItemsByName(String name) {
		Item foundItem = null;
		for (Item item : items) {
			if (item == null) {
				break;
			}
			
			if ((item.name).contains(name)) {
				foundItem = item;
				break;
			}
		}
		
		if (foundItem == null) {
			System.out.println("["+ name +"] 해당 상품이름이 존재하지 않습니다.");
		} else {
			System.out.println("상품번호 : " + foundItem.no);
			System.out.println("상품이름 : " + foundItem.name);
			System.out.println("상품가격 : " + foundItem.price);
		}
	}
	
	// items 배열에 저장된 Item객체 중에서 전달받은 가격범위에 속하는 Item객체의 번호, 상품명, 가격을 출력한다
	void printItemsByPrice(int minPrice, int maxPrice) {
		Item foundItem = null;
		
		for (Item item : items) {
			if (item == null) {
				break;
			}
			
			if (minPrice <= item.price && maxPrice >= item.price) {
				System.out.println("상품번호 : " + item.no);
				System.out.println("상품이름 : " + item.name);
				System.out.println("상품가격 : " + item.price);
				System.out.println();
			} 
		}
	}
	
	// items 배열에 저장된 Item객체중에서 전달받은 번호와 일치하는 Item객체의 모든 정보를 출력한다.
	void printItemDetail(int no) {
		Item foundItem = null;
		for (Item item : items) {
			if (item == null) {
				break;
			}
			
			if (no == item.no) {
				foundItem = item;
				break;
			}
		}
		
		System.out.println("=== 상품 상세 정보 =================");
		if (foundItem == null) {
			System.out.println("["+ no +"] 해당 번호가 존재하지 않습니다.");
		} else {
			System.out.println("상품번호 : " + foundItem.no);
			System.out.println("카테고리 : " + foundItem.category);
			System.out.println("상품이름 : " + foundItem.name);
			System.out.println("제조회사 : " + foundItem.maker);
			System.out.println("상품가격 : " + foundItem.price);
		}
		System.out.println("====================================");
	}
	
	// items 배열에 전달받은 Item 객체를 등록한다.
	void insertItem(Item item) {
		items[position++] = item;
		System.out.println("### 새로운 상품이 등록되었습니다.");
	}
	
	// items 배열에서 전달받은 번호에 해당하는 Item객체를 제거한다.
	// 제거된 자리에는 다음 Item객체들이 채운다.(조금 어려움)
	// 제거된 자리에는 맨마지막번쨰에 저장된 Item객체를 옮긴다 (조금 어려움)
	void deleteItem(int no) {
		for (Item item : items) {
			if (item == null) {
				break;
			}
			
			items[no] = items[no + 1];
		}
	}
}
