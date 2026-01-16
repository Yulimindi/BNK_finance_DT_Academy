package d0115.Board;

public class Main {

	public static void main(String[] args) {
		
		MemberDB mdb = new MemberDB();
		BoardDB bdb = new BoardDB();
		Login l = new Login();
		
		Join j1 = new Join("마준배", "dldbfla", "1234", mdb);
		Join j2 = new Join("김성만두", "rlatjdals", "1234", mdb);
		
		Board b1 = new Board("마준배", "안녕", "반가워", bdb);
		Board b2 = new Board("김준배", "안뇽", "반가워", bdb);
		Board b3 = new Board("배준배", "안냥", "반가워", bdb);
		Board b4 = new Board("박준배", "안늉", "반가워", bdb);
		
		l.login(mdb, "dlddbfla", "1234");
		l.login(mdb, "rlatjdaksen", "1234");
		l.login(mdb, "dldbfla", "1234");
		l.login(mdb, "dldbfla", "1234");
		l.login(mdb, "rlatjdaksen", "1234");
		
		System.out.println();
		bdb.showBoardList();
		System.out.println();
		bdb.updateBoard(3, "김성만두", "내이름은", "만두");
		bdb.showBoardList();
		System.out.println();
		bdb.deleteBoard(3);
		bdb.showBoardList();
		
	}

}
