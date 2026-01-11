package d0109;

import java.util.Scanner;


// 로그인
public class SignIn {
	
	
	// ========= 메서드 =========

	// 로그인
	static void signIn(SignUp su, SignMemberSave sm) {
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("아이디를 입력해주세요 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호를 입력해주세요 : ");
			String pw = sc.nextLine();
			
			for(int i = 0; i < sm.cnt; i++) {
				if(sm.info[i].id.equals(id) && sm.info[i].pw.equals(pw)) {
					System.out.println(sm.info[i].name + "님 환영합니다.");
					break;
				} else {
					System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
				}
			}
			break;
			
		}
		
		
				
	}
	
}
