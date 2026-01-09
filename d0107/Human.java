package d0107;

// 클래스 이름은 휴먼, 똑같은 수명 갖고 태어남 (100살) 담배 또는 술 하면 수명이 줄어 담배 1개피 필 때마다 는 1살 술은 1병씩 마실 때마다 2살씩 줄어, 이름 있고 성별 있고, 그렇게 해서 생성된 사람 중에서 일부는 담배 술 하고 수명 조회 했을 때 그 수명이 줄었는지 확인
public class Human {
	
	
	private int life; // 수명
	String name;
	char gender;

	public Human(String name, char gender) {
		life = 100;
		this.name = name;
		this.gender = gender;
	}
	
	void cigarette(int stick) { // 담배 1개 == 1살
		this.life -= stick;
	}
	
	void alcohol(int bottle) { // 술 1병 == 2살
		this.life -= (bottle * 2);
	}
	
	
	public int getLife() {
		return life;
	}
	
	/*
	public void setLife(int life) {
		if(life >= 101 || 0 >= life) {
			System.out.println("Error");
		} else {
			this.life = life;
		}
		
	}
	*/
	
}


