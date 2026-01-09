package d0107;

import java.util.Random;

public class Mission_Student {
	// 학생은 이름, 학년, 가진 돈으로 구성된다.
	// 학생은 버스를 탈 때마다 1000원을 버스 요금으로 지불한다. 학생은 자기 정보 출력 기능을 제공한다.
	
	private String name; // 이름
	private int grade; // 학년
	private int money; // 가진 돈
	
	// =============================== 생성자 ===============================
	public Mission_Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	// =============================== 메서드 ===============================
	
	void busIn(Mission_Bus num) { // 버스를 탈 때 가진 돈의 1000원을 버스 요금으로 지불한다.
		
		if(money >= 1000) {
			System.out.println("버스 타기를 시도합니다 . . . . .");
			System.out.println("버스 요금으로 1000원이 빠져나갑니다.");
			money -= 1000;
			num.charge();
		} else {
			System.out.println("돈이 없지만 버스 타기를 시도합니다 . . . . .");
			System.out.println("썩 내려라!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		
	}
	
	void studentInfo() { // 자기 정보 출력 기능
		System.out.println("이름 : " + name + " 학년 : " + grade + " 가진 돈 : " + money);
	}
	
	void poor(Mission_Student ms) { // 싹싹 빌어서 다른 사람이 대신 내주는 기능
		System.out.println("나 돈이 없는데 오늘만 대신 내주면 안될까? ㅠㅠ");
		
		Random rd = new Random();
		int num = rd.nextInt(2) + 1;
		if(num == 1) {
			System.out.println("흠... 알겠어 오늘만이야.");
			System.out.println("불쌍한 척에 성공했습니다! " + ms.name + "(이)가 대신 돈을 지불합니다.");
			ms.money -= 1000;
		} else {
			System.out.println("넌 왜 맨날 돈이 없냐? 확씨 -_-");
			System.out.println("불쌍한 척에 실패했습니다... " + ms.name + "(이)가 당신을 타격합니다. 아야!");
		}
	}
	
	// =============================== 게터 세터 ===============================
	
	// 이름
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 학년
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	// 가진 돈
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
