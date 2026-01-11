package d0109;

import java.util.Scanner;

//회원가입을 하는데 아이디 패스워드 이름 성별(문자열) 로 회원가입 할거에요
// 회원가입할때 아이디 패스워드 이름은 필수항목 성별은 안 적어도 됨
// 프로그램 시작되면 메뉴가 2개가 있어유 1번 메뉴는 회원가입 2번 메뉴는 로그인 / 회원가입을 하게 되면 아이디 패스워드 이름을 입력하세요 하고 끝나면 등록되었습니다.
// 회원가입이 완료되었습니다 라고 하면서 로그인하시겠습니까? 나옴
// 로그인 한다고 하면 아이디 비번 입력하세요 나옴 제대로 됐으면 OOO님 로그인 되었습니다~
// 아이디는 4글자 이상 비번은 8글자 이상
// 아이디 또는 패스워드가 틀렸다고 말해야함 해킹 위험!


// 회원가입
public class SignUp {
	
	
	// ========= 필드 =========
	
	String id;
	String pw;
	String name;
	String gender;

	
	// ========= 기본 생성자 =========
	
	public SignUp() {
		this.gender = "설정하지 않음";
		SignUp[] info = new SignUp[10];
	}
	
	// ========= 메서드 =========
	
	// 회원가입
	void signUp(String id, String pw, String name) {
		SignMemberSave sm = new SignMemberSave();
		Scanner sc = new Scanner(System.in);
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		
		while(true) {
			System.out.println("성별을 입력해주세요(남자/여자) : ");
			String g = sc.nextLine();
			if(g.equals("남자") || g.equals("여자")) {
				this.gender = g;
				break;
			} else if (g == " " || g == "") {
				this.gender = "설정하지 않음";
				break;
			} else {
				System.out.println("성별을 다시 입력해주세요.");
			}
		}
		
		System.out.println("회원가입이 완료되었습니다. 로그인 하시겠습니까? (네/아니오)");
		
		
		
	}

	@Override
	public String toString() {
		SignMemberSave sm = new SignMemberSave();
		
		return "[id=" + id + ", pw=" + pw + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}
