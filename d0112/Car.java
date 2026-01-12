package d0112;

public class Car implements Flyable, Swimable {
	
	@Override
	public void fly() {
		System.out.println("자동차가 하늘을 어떻게 날아?");
		
	}
	
	@Override
	public void swim() {
		System.out.println("차가 물로 들어갑니다 BRDM인가봐용");
		
	}
}
