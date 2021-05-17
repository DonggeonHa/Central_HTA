package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class jdbcSelectApp {

	public static void main(String[] args) {
		
		String driverClassName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "zxcv1234";
		
		String sql = "SELECT book_no, book_title, book_writer, book_price, book_discount_price, book_stock, book_created_date "
				   + "FROM sample_books "
				   + "ORDER BY book_no DESC ";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, user, password);
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					int no = rs.getInt("book_no");
					String title = rs.getString("book_title");
					String writer = rs.getString("book_writer");
					int price = rs.getInt("book_price");
					int discountPrice = rs.getInt("book_discount_price");
					int stock = rs.getInt("book_stock");
					Date createdDate = rs.getDate("book_created_date");
					
					System.out.println("----------------------------------");
					System.out.println("번호 : " + no);
					System.out.println("제목 : " + title);
					System.out.println("저자 : " + writer);
					System.out.println("가격 : " + price);
					System.out.println("할인가격 : " + discountPrice);
					System.out.println("재고수량 : " + stock);
					System.out.println("등록날짜 : " + createdDate);
					System.out.println("----------------------------------");
				}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("[오류코드]" + e.getErrorCode());
			System.out.println("[오류메시지]" + e.getMessage());
		} finally {
			try { if (rs != null) rs.close(); } catch(SQLException e) {}
			try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
			try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
		
		
		
		
	}
}
