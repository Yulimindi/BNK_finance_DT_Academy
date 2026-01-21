package d0121.Program;

public class Service {
	
	// 서비스 클래스에 데이터 유효성 검사 같은게 들어갈 수 있대용
	
	CommunicateDB db;
	
	public Service() throws Exception {
		db = new CommunicateDB();
	}
	
	// 회원 등록
	public void regist(Member m) throws Exception {	
		db.regist(m);
	}
	
	// 로그인
	public boolean login(Member m) throws Exception {
		boolean in = db.login(m);
		return in;
	}
	
	// 정보 수정
	public void modify(Member m) throws Exception {
		db.modify(m);
	}
	
	// 회원 조회
	public void inquiry() throws Exception {
		db.inquiry();
	}
	
}
