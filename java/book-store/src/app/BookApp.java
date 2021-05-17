package app;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import exception.BookStoreException;
import service.BookStoreService;
import vo.Book;
import vo.User;

public class BookApp {

	private BookStoreService service = new BookStoreService();
	private Scanner scanner = new Scanner(System.in);
	
	public void menu() {
		try {
			
			boolean isLogined = service.isLogined();
			
			if (!isLogined) {
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("1.도서목록  2.로그인  3.회원가입  0.종료");
				System.out.println("-----------------------------------------------------------------------");
				
				System.out.print("메뉴 선택 > ");
				int menuNo = scanner.nextInt();
				System.out.println();
				
				if (menuNo == 1) {
					displayAllBooks();
				} else if (menuNo == 2) {
					login();
				} else if (menuNo == 3) {
					register();
				} else if (menuNo == 0) {
					exit();
				}
				
			} else {
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("1.도서목록  2.검색  3.주문  4.내정보  5.주문내역 6.로그아웃  0.종료");
				System.out.println("-----------------------------------------------------------------------");
				
				System.out.print("메뉴 선택 > ");
				int menuNo = scanner.nextInt();
				System.out.println();
				
				if (menuNo == 1) {
					displayAllBooks();
				} else if (menuNo == 2) {
					searchBook();
				} else if (menuNo == 3) {
					orderBook();
				} else if (menuNo == 4) {
					displayMyInfo();
				} else if (menuNo == 5) {
					displayMyOrderHistory();
				} else if (menuNo == 6) {
					logout();
				} else if (menuNo == 0) {
					exit();
				}
			}
		} catch (InputMismatchException ime) {
			scanner = new Scanner(System.in);
			System.out.println("[오류] 잘못입력하셨습니다. 정수만 입력 가능합니다.");
		} catch (BookStoreException e) {
			System.out.println("[오류] " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		menu();
	}
	
	/**
	 * 모든 책 정보 출력하기.
	 */
	private void displayAllBooks() {
		System.out.println("[모든 도서 정보 조회]");
		
		List<Book> books = service.getAllBookList();
		
		if (books.isEmpty()) {
			System.out.println("[안내] 등록된 도서정보가 없습니다.");
		} else {
			System.out.println("========================================================================");
			System.out.println("책번호\t가격\t할인가격\t재고\t제목");
			System.out.println("------------------------------------------------------------------------");
			for (Book book : books) {
				System.out.print(book.getNo() + "\t");
				System.out.print(book.getPrice() + "\t");
				System.out.print(book.getDiscountPrice() + "\t\t");
				System.out.print(book.getStock() + "\t");
				System.out.println(book.getTitle());
			}
			System.out.println("========================================================================");
		}
	}
	
	/**
	 * 로그인하기
	 */
	private void login() {
		System.out.print("아이디를 입력하세요 : ");
		String id = scanner.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String password = scanner.next();
		
		service.login(id, password);
	}
	
	/**
	 * 회원가입하기
	 */
	private void register() {
		System.out.println("[회원 가입]");
		
		System.out.print("아이디를 입력하세요 : ");
		String id = scanner.next();
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next();
		System.out.println("비밀번호를 입력하세요 : ");
		String password = scanner.next();
		
		User newUser = new User(id, name, password, 0, "일반");
		service.addNewUser(newUser);
	}
	
	/**
	 * 도서 검색
	 */
	private void searchBook() {
		while(true) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.제목검색  2.카테고리검색  3.가격검색  0.종료");
			System.out.println("-----------------------------------------------------------------------");

			System.out.print("검색 메뉴 선택 > ");
			int searchMenuNo = scanner.nextInt();
			System.out.println();
			
			if (searchMenuNo == 1) {
				System.out.println("[제목 검색]");
				
				System.out.print("제목을 입력해주세요 : ");
				String title = scanner.next();
				
				List<Book> books = service.searchBooksByTitle(title);
				if (books.isEmpty()) {
					System.out.println("[안내] 검색결과가 없습니다.");
				} else {
					System.out.println("==================================================================================");
					System.out.println("책번호\t가격\t할인가격\t재고\t제목");
					System.out.println("----------------------------------------------------------------------------------");
					
					for (Book book : books) {
						System.out.print(book.getNo() + "\t");
						System.out.print(book.getPrice() + "\t");
						System.out.print(book.getDiscountPrice() + "\t\t");
						System.out.print(book.getStock() + "\t");
						System.out.println(book.getTitle());
					}
					System.out.println("==================================================================================");
				}
				
			} else if (searchMenuNo == 2) {
				System.out.println("[카테고리 검색]");
				
				System.out.print("카테고리를 입력해주세요 : ");
				String category = scanner.next();
				
				List<Book> books = service.searchBooksByCategory(category);
				if (books.isEmpty()) {
					System.out.println("[안내] 검색결과가 없습니다.");
				} else {
					System.out.println("==================================================================================");
					System.out.println("책번호\t카테고리\t가격\t할인가격\t재고\t제목");
					System.out.println("----------------------------------------------------------------------------------");
					
					for (Book book : books) {
						System.out.print(book.getNo() + "\t");
						System.out.print(book.getCategory() + "\t\t");
						System.out.print(book.getPrice() + "\t");
						System.out.print(book.getDiscountPrice() + "\t\t");
						System.out.print(book.getStock() + "\t");
						System.out.println(book.getTitle());
					}
					System.out.println("==================================================================================");
				}
			} else if (searchMenuNo == 3) {
				System.out.println("[가격 검색]");
				
				System.out.print("최소 가격을 입력해주세요 : ");
				int minPrice = scanner.nextInt();
				
				System.out.print("최대 가격을 입력해주세요 : ");
				int maxPrice = scanner.nextInt();
				
				List<Book> books = service.searchBooksByPrice(minPrice, maxPrice);
				if (books.isEmpty()) {
					System.out.println("[안내] 검색결과가 없습니다.");
				} else {
					System.out.println("==================================================================================");
					System.out.println("책번호\t가격\t할인가격\t재고\t제목");
					System.out.println("----------------------------------------------------------------------------------");
					
					for (Book book : books) {
						System.out.print(book.getNo() + "\t");
						System.out.print(book.getPrice() + "\t");
						System.out.print(book.getDiscountPrice() + "\t\t");
						System.out.print(book.getStock() + "\t");
						System.out.println(book.getTitle());
					}
					System.out.println("==================================================================================");
				}
				
			} else if (searchMenuNo == 0) {
				break;
			}
			System.out.println();
			
		}
	}
	
	/**
	 * 책 주문하기
	 */
	private void orderBook() {
		System.out.println("[책 주문하기]");
		
		System.out.print("책 번호를 입력해주세요 : ");
		int bookNo = scanner.nextInt();
		System.out.print("구매 수량을 입력해주세요 : ");
		int amount = scanner.nextInt();
		
		service.orderBook(bookNo, amount);
	}
	
	/**
	 * 내 정보 보기
	 */
	private void displayMyInfo() {
		User user = service.getMyInfo();
		
		System.out.println("=================================================");
		System.out.println("사용자 아이디 : " + user.getId());
		System.out.println("이름 : " + user.getName());
		System.out.println("고객등급 : " + user.getGrade());
		System.out.println("포인트 : " + user.getPoint());
		System.out.println("=================================================");
	}
	
	/**
	 * 내주문내역 보기
	 */
	private void displayMyOrderHistory() {
		List<Map<String, Object>> orderHistory = service.getMyOrderList();
		
		System.out.println("======================================================================");
		System.out.println("책번호\t책제목\t\t구매수량\t총구매가격\t적립포인트");
		System.out.println("======================================================================");
		for (Map<String, Object> order : orderHistory) {
			System.out.print(order.get("no") + "\t");
			System.out.print(order.get("title") + "\t");
			System.out.print(order.get("amount") + "\t\t");
			System.out.print(order.get("totalPrice") + "\t\t");
			System.out.println(order.get("point"));
		}
		
	}
	
	/**
	 * 로그아웃하기
	 */
	private void logout() {
		service.logout();
	}
	
	/**
	 * 종료하기
	 */
	private void exit() {
		System.out.println("[프로그램 종료]");
		service.restore();
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new BookApp().menu();
	}
}
