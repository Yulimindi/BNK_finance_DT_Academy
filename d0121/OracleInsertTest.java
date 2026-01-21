package d0121;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class OracleInsertTest {

	public static void main(String[] args) throws Exception{

		final String url = "jdbc:oracle:thin:@//localhost:1521/testdb";
		final String user = "green";
		final String password = "1234";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		// Statement stmt = conn.createStatement();
		
		int id = 3;
		String name = "도라에몽";
		
		// 쿼리 실행 객체에게 쿼리를 미리 넣어주는 것
		PreparedStatement pstmt = conn.prepareStatement("INSERT INTO testTbl (id, name) VALUES (?, ?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		
		int result = pstmt.executeUpdate();
		System.out.println(result + "건 등록 완료!");

	}

}