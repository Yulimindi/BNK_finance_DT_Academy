package D0109;

public class VendingMachine_DrinkInfo {
	
	VendingMachine_Drink[] vdi; 
	int cnt;
	VendingMachine_Drink vd = new VendingMachine_Drink();
	

	// ================ 생성자 ================
	public VendingMachine_DrinkInfo() {
		vdi = new VendingMachine_Drink[20];
	}
	
	
	// ================ 메서드 ================
	// 추가한 거 배열에 넣기
	void addArr(VendingMachine_Drink vd) {
		this.vdi[cnt] = vd;
		++this.cnt;
		System.out.println(vd.name + "(이)가 자판기에 들어갔습니다! 가격은 " + vd.price + "입니다.");
	}
	
	// 배열 안에 내용 확인
	void showArr() {
		for(int i = 0; i < cnt; i++) {
			System.out.print("제품명 : " + vdi[i].name);
			System.out.println(" 가격 : " + vdi[i].price);
		}
		
	}
	
	
}
