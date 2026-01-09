package d0107;

public class Mission_Bus { 
	// 버스는 버스 번호와 승객 수, 요금 합계로 구성된다.
	// 버스는 돈을 받으면 승객수를 1 증가시키고, 요금합계가 받은 요금만큼 증가한다.

	// =============================== 생성자 ===============================
	
	private int bNum; // 버스 번호
	int pNum; // 승객 수
	int sumCharge; // 요금 합계
	
	
	// =============================== 메서드 ===============================
	public Mission_Bus(int bNum) {
		this.bNum = bNum;
		pNum = 0;
		sumCharge = 0;
	}
	
	void charge() {
		System.out.println("승객 1명이 탑승합니다.");
		sumCharge += 1000;
		pNum++;
	}
	
	void bus_info() { // 버스는 자기 정보 출력 기능을 제공한다.
		System.out.println("버스 번호 : " + this.bNum + " 승객 수 : " + this.pNum + " 요금 합계 : " + this.sumCharge);
	}
	
	// =============================== 게터 세터 ===============================
	
	public int getB_num() {
		return bNum;
	}
	
	public int getP_num() {
		return pNum;
	}
	
	public int sumCharge() {
		return sumCharge;
	}

}

