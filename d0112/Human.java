package d0112;

public class Human extends God implements Flyable, Swimable {
	
	@Override
	public void fly() {
		System.out.println("아니 사람이 하늘을 어떻게 나냐고");
	}
	
	@Override
	public void swim() {
		System.out.println("앗 추워용 첨벙첨벙");
	}
}
