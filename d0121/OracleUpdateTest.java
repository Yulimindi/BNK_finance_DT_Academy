package d0121;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OracleUpdateTest {

	public static void main(String[] args) throws Exception {
		
		final String url = "jdbc:oracle:thin:@//localhost:1521/testdb";
		final String user = "green";
		final String password = "1234";
		
		Connection conn = DriverManager.getConnection(url, user, password);

		String name = "바보";
		int id = 2;
		
		PreparedStatement stmt = conn.prepareStatement("update testtbl set name = ? where id = ?");
		stmt.setString(1, name);
		stmt.setInt(2, id);
		
		int result = stmt.executeUpdate();
		System.out.println(result + "건 수정 완료!");

	}

}
