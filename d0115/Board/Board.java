package d0115.Board;

public class Board {
	static int num;
	int saveNum;
	String name;
	String title;
	String contents;
	
	public Board(String name, String title, String contents, BoardDB db) {
		this.name = name;
		this.title = title;
		this.contents = contents;
		this.saveNum = num + 1;
		db.create(this);
	}
	
	@Override
	public String toString() {
		return "닉네임 : " + name + " 제목 : " + title + " 내용 : " + contents;
	}
	
}
