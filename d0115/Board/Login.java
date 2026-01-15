package d0115.Board;


public class Login {

	void login(MemberDB db, String id, String password) {
		boolean a = false;
		boolean b = false;
		
		for(int i = 0; i < db.list.size(); i++) {
			if(db.list.get(i).id.contains(id) && db.list.get(i).password.equals(password)) {
				a = true;
			}
			if(a == true) {
				if(db.list.get(i).id.equals(id) && db.list.get(i).password.equals(password)) {
					System.out.println("로그인 완료");
					b = true;
				}
			}
		}
		
		if(b == false) {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		}
		
	}
}
