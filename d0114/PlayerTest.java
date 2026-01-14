package d0114;

public class PlayerTest {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		System.out.println("==================");
		
		AdvancedLevel ad = new AdvancedLevel();
//		player.upgradeLevel(new AdvancedLevel());
		player.upgradeLevel(ad);
		player.play(2);
		
		SuperLevel sp = new SuperLevel();
		player.upgradeLevel(sp);
		player.play(3);
		
	}

}
