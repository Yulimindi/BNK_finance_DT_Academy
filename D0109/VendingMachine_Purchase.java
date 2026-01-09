package D0109;

import java.util.Scanner;

public class VendingMachine_Purchase {
	
	Scanner sc = new Scanner(System.in);
	VendingMachine_Drink vmd = new VendingMachine_Drink();
	int m;
	
	void insertMoney(VendingMachine_DrinkInfo vdi, VendingMachine_User vu) { // 1. 돈 넣기
		vdi.showArr();
		while(true) {
			System.out.println("자판기에 얼마를 넣으시겠습니까?");
			m = sc.nextInt();
			sc.nextLine();
			if(m > vu.money) {
				System.out.println("가진 돈이 부족합니다. " + vu.money + "원 있습니다.");
			} else {
				vu.money -= m;
				break;
			}
		}
		purchase(vdi, vu);
	}
	
	
	void purchase(VendingMachine_DrinkInfo vdi, VendingMachine_User vu) { // 2. 구매하기

		System.out.println("어떤 음료를 구매하시겠습니까?");
		String c = sc.nextLine();
			
		for(int i = 0; i < vdi.cnt; i++) {
			if(c.equals(vdi.vdi[i].name)) {
				if(vdi.vdi[i].price > m) {
					System.out.println("돈이 부족합니다. 현재 돈을 " + m + "원 넣으셨습니다.");
					System.out.println("돈을 추가로 넣으시려면 1, 음료를 다시 선택하시려면 2, 이용을 그만 하시려면 3을 입력해주세요.");
					int a = sc.nextInt();
					sc.nextLine();
					if(a == 1) {
						insertMoney(vdi, vu);
					} else if (a == 2) {
						purchase(vdi, vu);
					} else {
						System.out.println("돈이 없으시면 다음에 오세요");
					}
				} else {
					System.out.println(vdi.vdi[i].price + "원입니다.");
					System.out.println("구매중 . . .");
					System.out.println("구매 완료!");
					m -= vdi.vdi[i].price;
					System.out.println("거스름돈 " + m + "원 가져가세요!");
					vu.money += m;
					break;
				}
			} else {
				System.out.println("올바른 제품명을 입력해주세요.");
			}
		}
	}

}
