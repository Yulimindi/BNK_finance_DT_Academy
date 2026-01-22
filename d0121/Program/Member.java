package d0121.Program;

public class Member {
	private String id;
	private String password;
	private String name;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String id) {
		this.id = id;
	}
	
	public Member(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	public void addMember(String id, String password, String name, Service s) throws Exception {
		
		this.id = id;
		this.password = password;
		this.name = name;
		s.regist(this);
		
	}
	
	boolean check(String id) throws Exception {
		CommunicateDB db = new CommunicateDB();
		boolean state = db.idCheck(id);
		return state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}




// 로그인을 하려면 아이디 비번 입력해서 DB에 있는 아이디 비번과 같은지 비교 후 같으면 그 아이디가 로그인 되어야함