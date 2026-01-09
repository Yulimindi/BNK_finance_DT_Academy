package d0107;

public class Human_Main {

	public static void main(String[] args) {
		
		Human h1 = new Human("이유림", 'F'); // 술 담배 X
		Human h2 = new Human("마준배", 'F'); // 술 O 담배 X
		Human h3 = new Human("하철용", 'F'); // 술 X 담배 O
		Human h4 = new Human("곽두팔", 'F'); // 술 O 담배 O
		
		h2.alcohol(3); // 술 3병 -> 예상 수명 94세
		
		h3.cigarette(30); // 담배 30개피 -> 예상 수명 70세
		
		h4.cigarette(10); // 담배 10개피
		h4.alcohol(7); // 술 7병 -> 예상 수명 76세

		h1.getLife();
		h2.getLife();
		h3.getLife();
		h4.getLife();
		
		System.out.println("예상 수명 (술X 담배X) : " + h1.getLife());
		System.out.println("예상 수명 (술O 담배X) : " + h2.getLife());
		System.out.println("예상 수명 (술X 담배O) : " + h3.getLife());
		System.out.println("예상 수명 (술O 담배O) : " + h4.getLife());
		
		/*
		// 혹시나 수명 조정하고 싶을 때 쓰는 메서드~ Human 클래스에도 주석 처리 되어있음
		h1.setLife(101);
		System.out.println("예상 수명 (술X 담배X) : " + h1.getLife());
		h2.setLife(-100);
		System.out.println("예상 수명 (술X 담배X) : " + h2.getLife());
		*/
		
		Human[] hs = new Human[4];
		
		hs[0] = h1;
		hs[1] = h2;
		hs[2] = h3;
		hs[3] = h4;
		
		
		for(int i = 0; i < 4; i++) {
			System.out.println(hs[i].name);
			System.out.println(hs[i].getLife());
			System.out.println(hs[i].gender);
		}
	}

}
