package d0109;

import java.util.Scanner;

public class VendingMachine_Main {

	public static void main(String[] args) {
		
		// 내가 가지고 있는 음료 및 개수 확인하는 기능, 음료수 넣을 때 수량 넣는 기능 구현!
		// 가지고 있는 음료 개수가 총 5개 이상이면 손이 없어서 구매 자체가 불가하게 구현해보기~~
		
		Scanner sc = new Scanner(System.in);
		VendingMachine_Drink vd = new VendingMachine_Drink();
		VendingMachine_DrinkInfo vdi = new VendingMachine_DrinkInfo();
		VendingMachine_Purchase vdp = new VendingMachine_Purchase();
		VendingMachine_Administrator va = new VendingMachine_Administrator();
		
		VendingMachine_User vu = new VendingMachine_User(5000, "이유림");
		
		while(true) {
			System.out.println("무엇을 하시겠습니까? (1 : 음료 구매, 2 : 음료 추가, 3 : 내 돈 보기, 4 : 종료)");
			// 나중에 여기에 2번 선택하면 비밀번호 확인해서 사장 맞나 체크하기!
			int in = sc.nextInt();
			sc.nextLine();
			if(in == 1) {
				vdp.insertMoney(vdi, vu);
			} else if (in == 2) {
				System.out.println("비밀번호를 입력해주세요 : ");
				int pw = sc.nextInt();
				sc.nextLine();
				if(pw == va.getPassword()) {
					va.addDrink(vdi);
				} else {
					System.out.println("사용할 수 없는 기능입니다.");
				}
			} else if (in == 3) {
				vu.checkMoney();
			} else if (in == 4) {
				System.out.println("자판기에서 멀어진다...");
				break;
			} else {
				System.out.println("옳바른 숫자를 입력해주세요.");
			}
		}
		
		
		
	}

}
