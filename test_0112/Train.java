package test_0112;

public class Train extends Transport{

	public void goWith(int money) {
		this.price = 3000;
		System.out.println(this.price + "원짜리 기차 타고 갈게용");
	}
}
