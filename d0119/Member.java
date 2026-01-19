package d0119;

public class Member {
	
	// ========== 필드 ==========
	private static int cnt;
	private int mno;
	private String name;
	private Member_Role role;
	
	// ========== 생성자 ==========
	public Member(String name, Member_Role role) {
		cnt++;
		this.mno = cnt;
		this.name = name;
		this.role = role;
	}
	
	// ========== 게터 세터 ==========
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Member.cnt = cnt;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Member_Role getRole() {
		return role;
	}
	public void setRole(Member_Role role) {
		this.role = role;
	}
	
	// ========== toString ==========
	@Override
	public String toString() {
		return  "[" + mno + "번] 이름 : " + name + ", 역할 : " + role;
	}
	
}
