package d0121.Program;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Member m = new Member();
		Scanner sc = new Scanner(System.in);
		boolean in = false;
		String id;
		String pw;
		Service s = new Service();
		
		while(true) {
			System.out.println("무엇을 하시겠습니까? (1 : 회원가입, 2 : 로그인, 3 : 정보 수정, 4 : 회원 조회, 5 : 로그아웃, 6 : 탈퇴 7 : 관리자 페이지, 8 : 종료)");
			int choose = sc.nextInt();
			sc.nextLine();
			
			if(choose == 1) {
				if(in == false) {
					while(true) {
						System.out.println("회원가입을 시작합니다.");
						System.out.println("사용하실 아이디를 입력해주세요 ▼");
						id = sc.nextLine();
						boolean check = m.check(id);
						
						if(check == true) {
							System.out.println("사용하실 비밀번호를 입력해주세요 ▼");
							pw = sc.nextLine();
							System.out.println("사용하실 이름을 입력해주세요 ▼");
							String name = sc.nextLine();
							
							m.addMember(id, pw, name, s);
							break;
						} else {
							
						}
					}
				} else {
					System.out.println("로그아웃 후 진행해주세요.");
				}
				
				
			} else if (choose == 2) {
				
				while(true) {
					System.out.println("로그인을 시작합니다.");
					System.out.println("아이디를 입력해주세요 ▼");
					id = sc.nextLine();
					System.out.println("비밀번호를 입력해주세요 ▼");
					pw = sc.nextLine();
					
					m.setId(id);
					m.setPassword(pw);
					
					boolean b = s.login(m);
					if(b == true) {
						in = true;
						break;
					} else {
						System.out.println("첫 화면으로 돌아갑니다.");
						break;
					}
				
				}
				
			} else if (choose == 3) {
				
				if(in == true) {
					System.out.println("정보 수정을 위해 본인 인증을 다시 진행합니다.");
					System.out.println("회원님의 아이디를 입력해주세요 ▼");
					id = sc.nextLine();
					System.out.println("회원님의 비밀번호를 입력해주세요 ▼");
					pw = sc.nextLine();
					
					if(m.getId().equals(id)) {
						m.setId(id);
						m.setPassword(pw);
						
						s.modify(m);
					} else {
						System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
					}
					
					
				} else {
					System.out.println("로그인 된 상태로 회원 수정을 진행해주세요.");
				}
				
			} else if (choose == 4) {
				
				if(in == true) {
					s.inquiry(m);
				} else {
					System.out.println("비회원은 회원 정보를 확인할 수 없습니다.");
					
				}
				
			} else if (choose == 5) {
				
				if(in == true) {
					System.out.println("로그아웃 합니다.");
					in = false;
				} else {
					System.out.println("로그인 하지 않았습니다.");
				}
				
				
			} else if (choose == 6) {
				if(in == true) {
					boolean l = s.resignation(m);
					if(l == true) {
						System.out.println("성공적으로 탈퇴 되었습니다.");
						in = false;
					}
				} else {
					System.out.println("로그인되지 않았습니다.");
				}
				
				
			} else if (choose == 7) {
				if(m.getId().equals("admin")) {
					System.out.println("1. 회원 조회 2. 탈퇴 관리");
					int c = sc.nextInt();
					sc.nextLine();
					if(c == 1) {
						System.out.println("관리자용 회원 조회");
						
						ArrayList<Member> arr = s.adInquiry();
						
						for(Member mem : arr) {
							System.out.println(mem.getName() + " " + mem.getId() + " " + mem.getPassword());
						}
						
					} else if (c == 2) {
						boolean b = s.adResignation();
						if(b == true) {
							System.out.println("성공적으로 삭제됨");
						} else {
							System.out.println("내부 오류 발생으로 삭제 실패");
						}
					} else {
						System.out.println("Error");
					}
				
				} else {
					System.out.println("관리자 전용 페이지입니다.");
				}
				
			} else if (choose == 8) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
	}

}
