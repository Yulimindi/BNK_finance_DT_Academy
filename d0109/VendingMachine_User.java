package d0109;

public class VendingMachine_User {
	int money;
	String name;
	
	public VendingMachine_User(int money, String name) {
		this.money = money;
		this.name = name;
	}
	
	void checkMoney() {
		System.out.println("나는 지금 " + this.money + "원을 가지고 있다...");
	}
	
	public int getMoney() {
		return money;
	}

}
