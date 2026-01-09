package d0108;

public class Member_Save {
	
	int idx;
	Member[] members; // 선언
	Member m = new Member();
	
	public Member_Save() { // 생성자에서 초기화!!!!!!!!!!!! 이부분잠깨고다시공부해라
		idx = 0;
		members = new Member[10];
	}
	
	void check() {
		for(int i = 0; i < idx; i++) {
			System.out.println((i+1) + ". " + members[i].toString());
		}
	}
	
	void addMember(Member m) {
		members[idx++] = m;
	}
}
