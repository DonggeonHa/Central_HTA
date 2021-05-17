
package repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import vo.Book;

public class BookRepository {

	private List<Book> db = new ArrayList<>();
	
	public BookRepository() {
		
		loadData();
	}
	
	/**
	 * 모든 책정보를 반환한다.
	 * @return 도서 목록
	 */
	public List<Book> getAllBooks() {
		return db;
	}
	
	/**
	 * 지정된 책번호의 책을 반환한다.
	 * @param no 책번호
	 * @return 도서
	 */
	public Book getBookByNo(int no) {
		for (Book book : db) {
			if (book.getNo() == no) {
				return book;
			}
		}
		return null;
	}
	
	/**
	 * 지정된 책으로 책정보를 변경한다.
	 * @param book 변경된 책정보를 포함하고 있는 책
	 */
	public void updateBook(Book book) {
		for (Book book1 : db) {
			if (book.equals(book1)) {
				
			}
		}
	}
	
	private void loadData() {
		try (FileReader fileReader = new FileReader("src/books.csv");
				BufferedReader reader = new BufferedReader(fileReader);) {
			
			String text = null;
			while ((text=reader.readLine()) != null) {
				String[] values = text.split(",");
				
				int no = Integer.parseInt(values[0]);
				String category = values[1];
				String title = values[2];
				String writer = values[3];
				String publisher = values[4];
				int price = Integer.parseInt(values[5]);
				int discountPrice = Integer.parseInt(values[6]);
				int stock = Integer.parseInt(values[7]);
				
				Book book = new Book(no, category, title, writer, publisher, price, discountPrice, stock);
				
				db.add(book);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveData() {
		try (PrintWriter writer = new PrintWriter("src/books.csv")) {
			for (Book book : db) {
				StringBuilder sb = new StringBuilder();
				
				sb.append(book.getNo())
					.append(",")
					.append(book.getCategory())
					.append(",")
					.append(book.getTitle())
					.append(",")
					.append(book.getWriter())
					.append(",")
					.append(book.getPublisher())
					.append(",")
					.append(book.getPrice())
					.append(",")
					.append(book.getDiscountPrice())
					.append(",")
					.append(book.getStock());
				
				String text = sb.toString();
				
				writer.println(text);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
