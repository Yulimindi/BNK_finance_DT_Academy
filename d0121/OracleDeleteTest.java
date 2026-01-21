package d0121;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OracleDeleteTest {

	public static void main(String[] args) throws Exception {
		
		final String url = "jdbc:oracle:thin:@//localhost:1521/testdb";
		final String user = "green";
		final String password = "1234";
		
		int id = 3;
		
		Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement psmt = conn.prepareStatement("DELETE from testtbl where id = ?");
		
		psmt.setInt(1, id);
		
		int result = psmt.executeUpdate();
		System.out.println(result + "건 삭제 완료!");

	}

}
