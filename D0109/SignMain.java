package D0109;

import java.util.Scanner;

// 회원가입 메인
public class SignMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SignUp su = new SignUp();
		SignIn si = new SignIn();
		SignMemberSave sm = new SignMemberSave(); 
		
		String id;
		String pw;
		String name;
		
		
		while(true) {
			System.out.println("환영합니다. 무엇을 하시겠습니까?");
			System.out.println("1. 회원가입 2. 로그인 3. 종료");
			int c = sc.nextInt();
			sc.nextLine();
			if(c == 1) { // 회원가입
				System.out.println("회원가입을 시작합니다.");
				while(true) {
					System.out.println("아이디를 입력해주세요(4글자 이상) : ");
					id = sc.nextLine();
					if(id.length() < 4) {
						System.out.println("아이디를 4자 이상으로 설정해주세요.");
						id = sc.nextLine();
					} else {
						break;
					}
				}
				
				while(true) {
					System.out.println("비밀번호를 입력해주세요(8글자 이상) : ");
					pw = sc.nextLine();
					if (pw.length() < 8) {
						System.out.println("비밀번호를 8자 이상으로 설정해주세요.");
					} else {
						break;
					}
				}
				
				while(true) {
					System.out.println("이름을 입력해주세요 : ");
					name = sc.nextLine();
					if(name.isEmpty()) {
						System.out.println("이름을 올바르게 입력해주세요.");
					} else {
						break;
					}
				}

				su.signUp(id, pw, name);
				sm.addMember(su);
						
			} else if (c == 2) { // 로그인
				si.signIn(su, sm);
				break;
			} else if (c == 3) { // 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바른 숫자를 입력해주세요.");
			}
			
		}

	}

}
