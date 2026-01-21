package d0120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleSelectTest {

	public static void main(String[] args) throws Exception { // 예외처리를 jvm으로 뺌
		
		final String url = "jdbc:oracle:thin:@//localhost:1521/testdb";
		final String user = "green";
		final String pw = "1234";
		
		Connection conn = DriverManager.getConnection(url, user, pw);
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT id, name FROM testTbl");
		
		while (rs.next()) { // 다수의 데이터가 나온다는 전제로 while문 사용
			System.out.println(rs.getInt("id") + " " + rs.getString("name"));
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
	}

}
