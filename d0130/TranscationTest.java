package d0130;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class TranscationTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@//localhost:1521/testdb";
		String uid = "newgreen";
		String upw = "1234";
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs;
		Savepoint sp1 = null;
		
		try {
			con = DriverManager.getConnection(url, uid, upw);
			con.setAutoCommit(false); // AUTO COMMIT 해제
			

			
			// 1. A 계좌 출금
			String withdrawSql = "update account set balance = balance - ? where acid = ?";
			pstmt = con.prepareStatement(withdrawSql);
			pstmt.setInt(1, 100);
			pstmt.setInt(2, 1);
			pstmt.executeUpdate();

			// SAVEPOINT 설정
			sp1 = con.setSavepoint("sp1");
			
			// 2. B 계좌 입금
			String depositSql = "update account set balance = balance + ? where acid = ?";
			pstmt = con.prepareStatement(depositSql);
			pstmt.setInt(1, 300); 
			pstmt.setInt(2, 2);
			pstmt.executeUpdate();
			
			
			// 커밋 전 SQLException 에러 발생
			String depositSql2 = "update account set balance = balance + ? where acid = ?";
			pstmt = con.prepareStatement(depositSql2);
			pstmt.setInt(1, 300);
			pstmt.executeUpdate();
			
			con.commit();
			System.out.println("이체 성공!");
			
			// 출력
			String result = "select * from account";
			pstmt = con.prepareStatement(result);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("계좌 : " + rs.getInt("acid") + " 잔고 : " + rs.getInt("balance"));
			}
			
		} catch (SQLException e) {
			System.out.println("오류 발생 ▶ 롤백 수행");
			try {
				con.rollback(); // 괄호 안에 매개변수를 쓰지 않으면 전체 롤백이 됨
				con.commit();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
