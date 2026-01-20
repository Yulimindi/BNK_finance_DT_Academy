package d0120;

import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521/testdb";
		String user = "green";
		String password = "1234";
		
		Connection conn = null; // 연결 담당 객체
		
		try {
			// 얘는 자바 높은 버전이면 생략 가능~
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("Oracle DB 연결 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Oracle JDBC 드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					System.out.println("DB 연결 종료");
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		

		

	}

}
