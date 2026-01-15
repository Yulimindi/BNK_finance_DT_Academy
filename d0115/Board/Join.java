package d0115.Board;

import java.util.Scanner;

public class Join {

	Scanner sc = new Scanner(System.in);
	String name; // 닉네임
	String id; // id
	String password; // 비번 
	
	public Join(String name, String id, String password, MemberDB db) {
		this.name = name;
		this.id = id;
		this.password = password;
		db.add(this);
	}

}
