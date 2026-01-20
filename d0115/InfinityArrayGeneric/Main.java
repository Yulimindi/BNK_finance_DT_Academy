package d0115.InfinityArrayGeneric;

public class Main {

	public static void main(String[] args) {
		
//		InfinityArray<String> s = new InfinityArray<>();
		
//		s.add("바나나");
//		s.add("바나나");
//		s.add("바나나");
//		s.add("바나나");
//		s.add("바나나");
//		s.add("바나나");
//		s.add("바나나");
//		s.showArr();
		
		InfinityArray<Integer> i = new InfinityArray<>();
		Integer a = 0;
		Integer b = 2;
		Integer c = 4;
		
		i.add(4);
		i.add(a);
		i.add(a);
		i.add(a);
		
		i.set(1, c);
		i.showArr();
		// i.add2(2, c);

		// i.showArr();
		
		
		
	}

}

// 게시판 만들기 글 작성(제목 내용 작성자 번호) 게시글 목록(제목 번호) , 여기서 번호는 자동으로 생성, 로그인 한 사용자 이름으로 작성자 설정 
// arraylist로 저장소 써서 그 배열을 하나의 클래스로 감싸요 마치 인피티티어레이처럼 이 클래스의 이름은 BoardDB
// 거기에 crud 넣기
// crud에 대한걸 클래스로 빼고 거기에 arraylist 인스턴스 생성 코드가 있어야겟네
// 회원가입 및 로그인도 해야겠네.........