package d0115.Board;

import java.util.ArrayList;

public class BoardDB {
	ArrayList<Board> list = new ArrayList<>();
	Board board;

	void create(Board b) {
		list.add(b);
		Board.num++;
	}
	
	void showBoardList() {
		for(Board b : list) {
			System.out.println(b);
		}
	}
	
	void readTitle(String title) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).title.contains(title)) {
				System.out.print("번호 : " + list.get(i).saveNum + " ");
				System.out.print("제목 : " + list.get(i).title + " ");
				System.out.print("닉네임 : " + list.get(i).name + " ");
				System.out.print("내용 : " + list.get(i).contents + " ");
			}
		}
	}
	
	void updateBoard(int index, String name, String title, String contents) {
		// 해당 인덱스 번호에 저거 넣기
		list.get(index).title = title;
		list.get(index).name = name;
		list.get(index).contents = contents;
	}
	
	void deleteBoard(int index) {
		list.remove(index);
	}
	
}
