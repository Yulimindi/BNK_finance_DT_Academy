package d0213;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dbtest {
	
	
	private final String url = "jdbc:oracle:thin:@//localhost:1521/testdb";
	private final String user = "green";
	private final String password = "1234";
	
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void connect() throws Exception {
		con = DriverManager.getConnection(url, user, password);
		pstmt = con.prepareStatement("select * from test1 where id = ?");
		
		pstmt.setString(1, "1");
		
		rs = pstmt.executeQuery();
		while(rs.next()) {
			rs.getString("id");
		}
		
		
	}
}
