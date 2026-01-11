package d0109;

import java.util.Scanner;

public class VendingMachine_Administrator {

	VendingMachine_Drink vd = new VendingMachine_Drink();
	Scanner sc = new Scanner(System.in);
	private int password = 1234;
	

	public int getPassword() {
		return password;
	}
	
	void addDrink(VendingMachine_DrinkInfo vdi) {
		System.out.println("추가를 원하는 음료의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.println("추가를 원하는 음료의 가격을 입력해주세요 : ");
		int price = sc.nextInt();
		vd.addDrink(name, price);
		vdi.addArr(vd);
	}
	
}


