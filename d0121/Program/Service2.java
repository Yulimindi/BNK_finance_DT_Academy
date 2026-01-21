package d0121.Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Service2 {
	
	final static String url = "jdbc:oracle:thin:@//localhost:1521/testdb";
	final static String user = "green";
	final static String password = "1234";
	
	// 회원 등록
	static void regist(Member m) throws Exception {
		
		String id = m.id;
		String pw = m.password;
		String name = m.name;
		
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement("insert into program (id, pw, name) values (?, ?, ?)");
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		pstmt.setString(3, name);
		
		pstmt.execute(); // 실행 시키는 애
		System.out.println(name + "님 회원가입 성공!");
	}
	
	// 로그인
	static public boolean login(String id, String pw) throws Exception {
		
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement stmt = con.prepareStatement("select count(*) from program where id = ? AND pw = ?");
		
		stmt.setString(1, id);
		stmt.setString(2, pw);
		
		ResultSet rs = stmt.executeQuery();
		
		rs.next();
		int count = rs.getInt("count(*)");
		
		if(count > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// 정보 수정
	static public void modify(String id, String pw) throws Exception {
		boolean b = false;
		
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement stmt = con.prepareStatement("select count(*) from program where id = ? AND pw = ?");
		
		stmt.setString(1, id);
		stmt.setString(2, pw);
		
		ResultSet rs = stmt.executeQuery();
		
		rs.next();
		int count = rs.getInt("count(*)");
		
		if(count > 0) {
			b = true;
		} else {
			b = false;
		}
		
		if(b == true) {
			System.out.println("인증이 완료되었습니다. 무엇을 변경 하시겠습니까? (1 : 이름, 2 : 비밀번호, 3 : 둘 다, 4 : 변경 취소");
			int choose = sc.nextInt();
			sc.nextLine();
			
			if(choose == 1) {
				
				System.out.println("변경하실 이름을 입력해주세요 ▼");
				String newName = sc.nextLine();
				
				stmt = con.prepareStatement("update program set name = ? where id = ?");
				stmt.setString(1, newName);
				stmt.setString(2, id);
				stmt.executeQuery();
				
				System.out.println("성공적으로 이름이 변경되었습니다.");
				
			} else if (choose == 2) {
				
				System.out.println("변경하실 비밀번호를 입력해주세요 ▼");
				String newPw = sc.nextLine();
				
				stmt = con.prepareStatement("update program set pw = ? where id = ?");
				stmt.setString(1, newPw);
				stmt.setString(2, id);
				stmt.executeQuery();
				
				System.out.println("성공적으로 비밀번호가 변경되었습니다.");
				
			} else if (choose == 3) {
				
				System.out.println("변경하실 이름을 입력해주세요 ▼");
				String newName = sc.nextLine();
				System.out.println("변경하실 비밀번호를 입력해주세요 ▼");
				String newPw = sc.nextLine();
				
				stmt = con.prepareStatement("update program set name = ?, pw = ? where id = ?");
				stmt.setString(1, newName);
				stmt.setString(2, newPw);
				stmt.setString(3, id);
				stmt.executeQuery();
				
				System.out.println("성공적으로 이름과 비밀번호가 변경되었습니다.");
				
			} else if (choose == 4) {
				
				System.out.println("회원 정보 수정을 종료합니다.");
			} else {
				System.out.println("제대로 입력하세요.");
			}
			
		} else {
			
			System.out.println("회원 정보가 일치하지 않습니다. 회원 정보 변경을 종료합니다.");
		}
		
		
	}
	
	// 회원 조회
	static public void inquiry() throws Exception {
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement stmt = con.prepareStatement("select name from program");
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			System.out.println("이름 : " + rs.getString("name"));
		}
	}
	
}
