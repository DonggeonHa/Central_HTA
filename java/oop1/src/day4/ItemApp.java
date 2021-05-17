package day4;

import java.util.Scanner;

public class ItemApp {

	public static void main(String[] args) {
		final int PRINT_ALL_ITEMS = 1;
		final int PRINT_ITEMS_BY_CATEGORY = 2;
		final int PRINT_ITEM_BY_NAME = 3;
		final int PRINT_ITEMS_BY_PRICE = 4;
		final int PRINT_ITEM_DETAIL = 5;
		final int INSERT_ITEM = 6;
		final int DELETE_ITEM = 7;
		final int EXIT = 0;
		
		Scanner sc = new Scanner(System.in); 
		// Item객체에 대한 조회/검색/추가/삭제 기능을 제공하는 객체 생성
		ItemService service = new ItemService();
		
		while (true) {
			System.out.println("==================================================================");
			System.out.println("1.전체		2.카테고리		3.이름		4.가격");
			System.out.println("5.번호		6.등록			7.삭제		0.종료");
			System.out.println("==================================================================");
			
			System.out.print("메뉴번호를 선택하세요 : ");
			int menuNo = sc.nextInt();
			
			if (menuNo == PRINT_ALL_ITEMS) {
				System.out.println("[모든 상품정보 출력]");
				service.printAllItems();
				
			} else if (menuNo == PRINT_ITEMS_BY_CATEGORY) {
				System.out.println("[카테고리 상세정보 출력]");
				
				System.out.print("카테고리를 입력하세요 : ");
				String category = sc.next();
				
				service.printItemsByCategory(category);
				
			} else if (menuNo == PRINT_ITEM_BY_NAME) {
				System.out.println("[상품명 상세정보 출력]");
				
				System.out.print("상품명 입력하세요 : ");
				String itemName = sc.next();
				
				service.printItemsByName(itemName);
			} else if (menuNo == PRINT_ITEMS_BY_PRICE) {
				System.out.println("[가격범위 상세정보 출력]");
				
				System.out.print("최소가격 : ");
				int minPrice = sc.nextInt();
				System.out.print("최대가격 : ");
				int maxPrice = sc.nextInt();
				
				service.printItemsByPrice(minPrice, maxPrice);
				
			} else if (menuNo == PRINT_ITEM_DETAIL) {
				System.out.println("[상품상세 조회]");
				
				System.out.print("상품번호를 입력하세요 : ");
				int itemNo = sc.nextInt();
				
				service.printItemDetail(itemNo);
				
			} else if (menuNo == INSERT_ITEM) {
				System.out.println("[상품정보 등록]");
				
				System.out.print("상품번호를 입력하세요 : ");
				int no = sc.nextInt();
				System.out.print("카테고리를 입력하세요 : ");
				String category = sc.next();
				System.out.print("상품명을 입력하세요 : ");
				String name = sc.next();
				System.out.print("제조사를 입력하세요 : ");
				String maker = sc.next();
				System.out.print("가격을 입력하세요 : ");
				int price = sc.nextInt();
				
				Item item = new Item(no, category, name, maker, price);
				service.insertItem(item);
				
			} else if (menuNo == DELETE_ITEM) {
				System.out.println("[상품정보 삭제]");
				
				System.out.print("삭제할 상품번호를 입력하세요 : ");
				int no = sc.nextInt();
				
				service.deleteItem(no);
				
			} else if (menuNo == EXIT){
				System.out.println("[프로그램 종료]");
				break;
			}
			
			System.out.println();
			System.out.println();
		}
		
		sc.close();
	}
}
