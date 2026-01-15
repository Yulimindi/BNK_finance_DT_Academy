package d0115.Board;

import java.util.ArrayList;

public class MemberDB {
	ArrayList<Join> list = new ArrayList<>();
	Join join;
	
	void add(Join j) {
		list.add(j);
	}
	
	void showMemberList() {
		for(int i = 0; i < list.size(); i++) {
			System.out.print("아이디 : " + list.get(i).id + " ");
			System.out.print("비번 : " + list.get(i).password + " ");
			System.out.print("닉네임 : " + list.get(i).name + " ");
			System.out.println();
		}
	}
	
	void updateMember(int index, String name, String id, String password) {
		// 해당 인덱스 번호에 저거 넣기
		list.get(index).name = name;
		list.get(index).id = id;
		list.get(index).password = password;
	}
	
	void deleteMember(int index) {
		list.remove(index);
	}

}
