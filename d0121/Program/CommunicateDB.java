package d0121.Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class CommunicateDB {
	
	private final String url = "jdbc:oracle:thin:@//localhost:1521/testdb";
	private final String user = "green";
	private final String password = "1234";
	
	Connection con;
	Scanner sc = new Scanner(System.in);
	
	public CommunicateDB() throws Exception {
		con = DriverManager.getConnection(url, user, password);
	}
	
	boolean idCheck(String id) throws Exception {
		boolean state = true;
		
		PreparedStatement stmt = con.prepareStatement("select id from program where id = ?");
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		
		 if(rs.next()) {
			 System.out.println("아이디가 중복됩니다.");
			 state = false;
		 }
		 return state;
		 
	}
	
	void regist(Member m) throws Exception {

		PreparedStatement pstmt = con.prepareStatement("insert into program (id, pw, name) values (?, ?, ?)");
					
		pstmt.setString(1, m.getId());
		pstmt.setString(2, m.getPassword());
		pstmt.setString(3, m.getName());
					
		pstmt.execute();
					
		System.out.println(m.getName() + "님 회원가입 성공!");
		
	}
	
	boolean login (Member m) throws Exception {
		
		PreparedStatement stmt = con.prepareStatement("select name from program where id = ? AND pw = ?");
		
		stmt.setString(1, m.getId());
		stmt.setString(2, m.getPassword());
			
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getString("name") + "님 환영합니다!");
			return true;
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
			return false;
		}
	}
	
	void modify(Member m) throws Exception {
		boolean b = login(m);
		PreparedStatement stmt;
		
		if(b == true) {
			System.out.println("인증이 완료되었습니다. 무엇을 변경 하시겠습니까? (1 : 이름, 2 : 비밀번호, 3 : 둘 다, 4 : 변경 취소");
			int choose = sc.nextInt();
			sc.nextLine();
			
			if(choose == 1) {
				
				System.out.println("변경하실 이름을 입력해주세요 ▼");
				String newName = sc.nextLine();
				
				stmt = con.prepareStatement("update program set name = ? where id = ?");
				stmt.setString(1, newName);
				stmt.setString(2, m.getId());
				stmt.executeQuery();
				
				System.out.println("성공적으로 이름이 변경되었습니다.");
				
			} else if (choose == 2) {
				
				System.out.println("변경하실 비밀번호를 입력해주세요 ▼");
				String newPw = sc.nextLine();
				
				stmt = con.prepareStatement("update program set pw = ? where id = ?");
				stmt.setString(1, newPw);
				stmt.setString(2, m.getId());
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
				stmt.setString(3, m.getId());
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
	
	// 사용자 전용 회원 조회
	void inquiry(Member m) throws Exception {
		PreparedStatement stmt = con.prepareStatement("select * from program where id = ?");
		stmt.setString(1, m.getId());
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			System.out.println("아이디 : " + rs.getString("id"));
			System.out.println("이름 : " + rs.getString("name"));
			System.out.println("비밀번호 : " + rs.getString("pw"));
		}
	}
	
	// 관리자 전용 회원 조회
	ArrayList<Member> adInquiry() throws Exception {
		PreparedStatement stmt = con.prepareStatement("select * from program");
		ResultSet rs = stmt.executeQuery();
		
		ArrayList<Member> arr = new ArrayList<>();
		
		Member m;
		
		while(rs.next()) {
			m = new Member(rs.getString("id"), rs.getString("pw"), rs.getString("name"));
			arr.add(m);
		}
		
		return arr;
		
	}
	
	// 사용자 전용 회원 탈퇴
	boolean resignation(Member m) throws Exception {
		PreparedStatement stmt = con.prepareStatement("insert into resignation (id) values (?)");
		stmt.setString(1, m.getId());
		stmt.execute();
		
		return true; 
	}
	
	// 관리자 전용 회원 탈퇴
	boolean adResignation() throws Exception {
		
		System.out.println("탈퇴 메서드 진입");
		PreparedStatement stmt = con.prepareStatement("select id from resignation");
		ResultSet rs = stmt.executeQuery();
		
		ArrayList<Member> arr = new ArrayList<>();
		
		while(rs.next()) {
			arr.add(new Member(rs.getString("id")));
		}
		
		boolean b = false;
		
		stmt = con.prepareStatement("delete from program where id = ?");
		
		for(Member m : arr) {
			System.out.println("탈퇴 중");
			stmt.setString(1, m.getId());
			stmt.execute();
		}
		
		System.out.println("탈퇴 완료");

		System.out.println("탈퇴 종료 후 체크");
		stmt = con.prepareStatement("select id from resignation");
		rs = stmt.executeQuery();
		
		
		if(rs.next()) {
			
		} else {
			b = true;
		}
		
		return b; 
	}
	
}
