package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteApp {
	
	public static void main(String[] args) {
		// ojdbc6.jar 라이브러리에 포함되어 있는 오라클용 jdbc 지원 핵심 클래스
		String driverClassName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "zxcv1234";

		String sql = "DELETE FROM sample_books WHERE book_no = ?";  //  ? -> 바인딩변수, 값이 들어가야할 자리를 미리 표시.
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driverClassName);
			
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql); // 실질적으로 SQL을 데이터베이스에다 전송하고 결과를 받아온다.
			pstmt.setInt(1, 101);
			
			int rowCount = pstmt.executeUpdate();
			System.out.println(rowCount + "개의 행이 삭제되었습니다.");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
