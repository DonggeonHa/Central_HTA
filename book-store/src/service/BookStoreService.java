package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exception.BookException;
import exception.UserException;
import repository.BookRepository;
import repository.OrderRepository;
import repository.UserRepository;
import vo.Book;
import vo.Order;
import vo.User;

public class BookStoreService {

	private BookRepository bookRepository = new BookRepository();
	private UserRepository userRepository = new UserRepository();
	private OrderRepository orderRepository = new OrderRepository();
	private User loginedUser = null;
	
	/**
	 * 모든 책정보를 반환한다.
	 * @return 도서 목록
	 */
	public List<Book> getAllBookList() {
		return bookRepository.getAllBooks();
	}
	
	/**
	 * 지정된 카테고리에 해당하는 책 정보들을 반환한다.
	 * @param category 조회할 도서 카테고리
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByCategory(String category) {
		List<Book> searchCategory = new ArrayList<Book>();
		
		for (Book book : bookRepository.getAllBooks()) {
			if (book.getCategory().equals(category)) {
				searchCategory.add(book);
			}
		}
		
		return searchCategory;
	}
	
	/**
	 * 지정된 책 제목을 포함하고 잇는 책 정보들을 반환한다.
	 * @param title 조회할 도서 제목
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByTitle(String title) {
		List<Book> searchTitle = new ArrayList<Book>();
		
		for (Book book : bookRepository.getAllBooks()) {
			if (book.getTitle().contains(title)) {
				searchTitle.add(book);
			}
		}
		return searchTitle;
	}
	
	/**
	 * 지정된 가격범위에 속하는 책 정보들을 반환한다.
	 * @param minPrice 최소 가격
	 * @param maxPrice 최대 가격
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByPrice(int minPrice, int maxPrice) {
		List<Book> searchPrice = new ArrayList<Book>();
		
		for (Book book : bookRepository.getAllBooks()) {
			if (book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
				searchPrice.add(book);
			}
		}
		return searchPrice;
	}
	
	/**
	 * 지정된 책번호에 해당하는 책정보를 반환한다.
	 * @param no 조회할 책 번호
	 * @return 도서
	 */
	public Book findBook(int no) {
		Book book = bookRepository.getBookByNo(no);
		if (book == null) {
			throw new BookException("[" + no + "] 과 일치하는 도서정보가 존재하지 않습니다");
		}
		return book;
	}
	
	/**
	 * 지정된 책번호의 재고를 변경한다.
	 * @param no 책번호
	 * @param stock 변경된 재고량
	 */
	public void updateBookStock(int no, int stock) {
		Book book = bookRepository.getBookByNo(no);
		if (book == null) {
			throw new BookException("[" + no + "] 과 일치하는 도서정보가 존재하지 않습니다.");
		}
		
		book.setStock(stock);
		
	}
	
	/**
	 * 새 사용자정보를 등록한다.
	 * @param user 새 사용자
	 */
	public void addNewUser(User user) {
		userRepository.insertUser(user);
	}
	
	/**
	 * 지정된 아이디와 비밀번호로 사용자를 인증한다.
	 * @param id 아이디
	 * @param password 비밀번호
	 */
	public void login(String id, String password) {
		User user = userRepository.getUserById(id);
		if (user == null) {
			throw new UserException("아이디 혹은 비밀번호가 일치하지 않습니다.");
		} 
		
		if (!(user.getPassword().equals(password))) {
			throw new UserException("아이디 혹은 비밀번호가 일치하지 않습니다.");
		}
		
		this.loginedUser = user;
	}
	
	/**
	 * 로그인된 사용자 정보를 삭제한다.
	 */
	public void logout() {
		this.loginedUser = null;
	}
	
	/**
	 * 로그인여부를 반환한다.
	 * @return 로그인된 사용자정보가 존재하면 true를 반환한다.
	 */
	public boolean isLogined() {
		if (this.loginedUser != null) {
			return true;
		}
		return false;
	}
	
	/**
	 * 주문하기 기능
	 * @param bookNo 책번호
	 * @param amount 주문수량
	 */
	public void orderBook(int bookNo, int amount) {
		if (this.loginedUser == null) {
			throw new UserException("로그인이 필요한 서비스 입니다");
		}
		
		Book book = bookRepository.getBookByNo(bookNo);
		if (book == null) {
			throw new BookException("책번호가 올바르지 않습니다");
		}
		
		if (book.getStock() < amount) {
			throw new BookException("재고량이 부족합니다");
		}
		
		Order order = new Order(this.loginedUser.getId(), book.getNo(), amount);
		orderRepository.insertOrder(order);
		
		book.setStock(book.getStock() - amount);
		int getPoint = (int) ((int) (book.getPrice() * amount) * 0.01);
		this.loginedUser.setPoint(this.loginedUser.getPoint() + getPoint);
		
		   // 일반 :                 ~    99,999
	      // 로얄 :      100,000    ~   999,999
	      // 골드 :    1,000,000    ~ 4,999,999
	      // 플레티넘 : 5,000,000
		if (this.loginedUser.getPoint() >= 5_000_000) {
			this.loginedUser.setGrade("플레티넘");
		} else if (this.loginedUser.getPoint() >= 1_000_000 && this.loginedUser.getPoint() < 5_000_000) {
			this.loginedUser.setGrade("골드");
		} else if (this.loginedUser.getPoint() >= 100_000 && this.loginedUser.getPoint() < 999_999) {
			this.loginedUser.setGrade("로얄");
		} else if (this.loginedUser.getPoint() < 100_000) {
			this.loginedUser.setGrade("일반");
		}
	}
	
	/**
	 * 로그인한 사용자의 주문내역을 조회하는 기능
	 * @return 주문 목록
	 */
	public List<Map<String, Object>> getMyOrderList() {
		List<Map<String,Object>> orderList = new ArrayList<Map<String, Object>>();
		
		if (this.loginedUser == null) {
			throw new UserException("로그인이 필요한 서비스 입니다");
		}
		
		for (Order order : orderRepository.getAllOrders()) {
			if(order.getUserId().equals(this.loginedUser.getId())) {
				Book book = bookRepository.getBookByNo(order.getBookNo());
				
				HashMap<String, Object> map = new HashMap<String, Object>();
				int totalPrice = book.getPrice() * order.getAmount();
				map.put("no", book.getNo());
				map.put("title", book.getTitle());
				map.put("amount", order.getAmount());
				map.put("totalPrice", totalPrice);
				map.put("point", totalPrice * 0.01);
				
				orderList.add(map);
			}
				
		}
		
		
		
		return orderList;
	}
	
	/**
	 * 로그인한 사용자의 상세정보를 반환한다.
	 * @return
	 */
	public User getMyInfo() {
		if (this.loginedUser == null) {
			throw new UserException("로그인이 필요한 서비스입니다");
		}
		
		return this.loginedUser;
	}
	
	/**
	 * 모든 정보를 저장한다.
	 */
	public void restore() {
		userRepository.saveData();
		bookRepository.saveData();
		orderRepository.saveData();
	}
}

