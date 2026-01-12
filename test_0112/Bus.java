package test_0112;

public class Bus extends Transport {
	
	public void goWith(int money) {
		this.price = 1000;
		System.out.println(this.price + "원짜리 버스 타고 갈게용");
	}
}
