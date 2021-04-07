package day4;

public class ItemService {
	
	Item[] items = new Item[100];
	int position = 0;
	
	ItemService() {
		// items 배열에 Item객체 5개 등록하기
		items[position++] = new Item(101, "노트북", "맥북", "애플", 1900000);
		items[position++] = new Item(102, "노트북", "맥북에어", "애플", 1200000);
		items[position++] = new Item(103, "노트북", "맥북프로", "애플", 2500000);
		items[position++] = new Item(104, "노트북", "LG그램", "LG", 2000000);
		items[position++] = new Item(105, "노트북", "소니바이오", "소니", 1400000);
		items[position++] = new Item(106, "노트북", "씽크패드", "레노버", 2800000);
		items[position++] = new Item(107, "스마트폰", "iphone12", "애플", 1400000);
		items[position++] = new Item(108, "스마트폰", "iphoneSE", "애플", 600000);
		items[position++] = new Item(109, "스마트폰", "갤럭시S20", "삼성", 1300000);
		items[position++] = new Item(110, "워치", "애플워치", "애플", 500000);
		items[position++] = new Item(111, "워치", "갤럭시워치", "삼성", 450000);
		items[position++] = new Item(112, "워치", "가민945", "가민", 750000);
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
		boolean isExist = false;
		
		System.out.println("====" + category +" 아이템 목록==================");
		for (Item item : items) {
			if (item == null) {
				break;
			}
			
			if (item.category.equals(category)) {
				isExist = true;
				System.out.println(item.no + "\t" + item.name + "\t" + item.price);
			}
		}
		
		if (!isExist) {
			System.out.println("["+ category+"]에 해당하는 상품이 존재하지 않습니다");
		}
		System.out.println("===========================================");
		
	}
	
	// items 배열에 저장된 Item객체 중에서 전달받은 상품명을 포함하고 있는 Item객체의 번호, 상품명, 가격을 출력한다.
	// .equals(name)은 상품명이 name과 일치하면 true
	// .contains(name)은 상품명에 name이 포함되어 있으면 true
	void printItemsByName(String name) {
		boolean isExist = false;
		for (Item item : items) {
			if (item == null) {
				break;
			}
			
			if ((item.name).contains(name)) {
				isExist = true;
				System.out.println(item.no + "\t" + item.name + "\t" + item.price);
			}
		}
		
		if (!isExist) {
			System.out.println("["+ name +"]에 해당하는 상품이 존재하지 않습니다");
		}
		System.out.println("===========================================");
	}
	
	// items 배열에 저장된 Item객체 중에서 전달받은 가격범위에 속하는 Item객체의 번호, 상품명, 가격을 출력한다
	void printItemsByPrice(int minPrice, int maxPrice) {
		boolean isExist = false;
		for (Item item : items) {
			if (item == null) {
				break;
			}
			
			if (minPrice <= item.price && maxPrice >= item.price) {
				isExist = true;
				System.out.println(item.no + "\t" + item.name + "\t" + item.price);
			} 
		}
		
		if (!isExist) {
			System.out.println(minPrice + "~" + maxPrice + "에 해당하는 상품이 존재하지 않습니다");
		}
		System.out.println("===========================================");
	}
	
	// items 배열에 저장된 Item객체중에서 전달받은 번호와 일치하는 Item객체의 모든 정보를 출력한다.
	// Item마다 고유한 아이템번호를 가지고 있다.
	// 아이템번호로 아이템을 조회하면 한 개만 조회되거나, 조회되지 않는다.
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
	// 제거된 자리에는 맨마지막번쨰에 저장된 Item객체를 옮긴다 (조금 어려움)
	void deleteItem(int no) {
		// 삭제할 아이템이 저장된 인덱스를 저장하는 변수
		int foundItemIndex = -1;
		// 향상된 for문을 사용해서 배열에 저장된 Item객체를 순서대로 하나씩 조회하는 동안
		// 지금 조회된 ITem 객체가 배열의 몇번째 칸에서 조회된 아이템인지를 저장하는 변수
		
		int index = 0; // 배열에서 조회한 아이템의 현재 순번을 저장하는 변수
		for (Item item : items) {
			if (item == null) {
				break;
			}
			if (item.no == no) {
				foundItemIndex = index;
				break;
			}
			index++;
		}
		
		// foundItemIndex값이 -1이면 아이템번호와 일치하는 아이템이 배열에 존재하지 않는 경우임
		if (foundItemIndex == -1) {
			System.out.println("상품번호 [" + no + "]에 해당하는 아이템은 존재하지 않습니다");
			return; // 메소드의 실행을 즉시 종료한다.
		} 

		// foundItemIndex가 -1이 아닌 경우 아래의 수행문이 실행된다.
		// lastItemSavedIndex는 items 배열에서  Item객체가 저장된 맨 마지막 Index를 저장하는 변수다
		int lastItemSavedIndex = position - 1;
		
		// foundItemIndex와 lastItemSavedIndex가 같으면 지금 삭제할 Item객체는
		// 맨마지막으로 저장된 Item객체다. 
		// 	- 배열에서 foundItemIndex 칸으로 null로 만든다.
		if (foundItemIndex == lastItemSavedIndex) {
			// 삭제할 아이템이 맨 마지막에 저장되어 있다.
			items[foundItemIndex] = null;
			position--;
		} else {
			// 삭제할 아이템이 중간에 저장되어 있다.
			//	- 배열에서 foundItemIndex 칸을 null로 만든다
			//	- 맨마지막으로 저장된 Item객체의 주소값을 foundItemIndex칸에 대입한다.
			//	- 배열에서 맨 마지막으로 Item객체가 저장되었던 칸을 null로 만든다.
			items[foundItemIndex] = null;
			items[foundItemIndex] = items[lastItemSavedIndex];
			items[lastItemSavedIndex] = null;
			position--;
		}
		
	}
}
