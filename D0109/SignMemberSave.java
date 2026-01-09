package D0109;

// 회원 목록 저장
public class SignMemberSave {
	SignUp[] info;
	SignUp su = new SignUp();
	int cnt;
	
	// ========= 메서드 =========
	
	public SignMemberSave() { // 자리 만들기
		info = new SignUp[10];
	}
	
	void addMember(SignUp su) { // 데이터 넣기
		info[cnt] = su;
		++this.cnt;
		print();
	}
	
	void print() {
		for(int i = 0; i < cnt; i++) {
			System.out.println((i+1) + ". " + info[i].toString());
		}
	}
}

// InfinityArr 클래스