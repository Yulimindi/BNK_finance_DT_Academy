package d0127;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class DateTest2 {
	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:oracle:thin:@//localhost:1521/testdb";
		String user = "green";
		String pw = "1234";
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDateTime today2 = LocalDateTime.now();
		
		Connection con = DriverManager.getConnection(url, user, pw);
		
//		PreparedStatement pstmt = con.prepareStatement("insert into testTime (date1, date2) values (?, ?)");
//		PreparedStatement pstmt = con.prepareStatement("insert into testTime (date1, date2) values (sysdate, sysdate)");
		PreparedStatement pstmt = con.prepareStatement("insert into testTime (name) values ('ccc')");
		// 문자열로 날짜 추가하기
		// pstmt.setString(1, "2025-12-11");
		
		// 날짜형으로 추가하기
//		LocalDateTime now = LocalDateTime.now();
//		pstmt.setTimestamp(1, Timestamp.valueOf(now));
//		pstmt.setTimestamp(2, Timestamp.valueOf(now));
		
		
		int result = pstmt.executeUpdate();
		System.out.println(result + "행 추가됨!");
//		
//		pstmt.close();
//		con.close();
		
		con = DriverManager.getConnection(url, user, pw);
		
		String query = "select * from testTime";
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		rs.next();
		
		System.out.println(rs.getString("date1"));
		
//		// 테이블의 name 컬럼의 값 받기
//		String name = rs.getString("name");
//		
//		// 테이블의 date1 컬럼의 값 받기
//		LocalDateTime date1 = rs.getTimestamp("date1").toLocalDateTime();
//		System.out.println("date1 : " + date1);
//		
//		// 테이블의 date2 컬럼의 값 받기
//		LocalDateTime date2 = rs.getTimestamp("date2").toLocalDateTime();
//		System.out.println("date2 : " + date2);
//		
//		// 날짜/시각 데이터 형식 지정하기
//		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		System.out.println(date1.format(df1));
//		
//		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss"); // M(Month)과 m(minute) 잘 구별해서 써야함!
//		System.out.println(date2.format(df2));
		
	}
	
}
