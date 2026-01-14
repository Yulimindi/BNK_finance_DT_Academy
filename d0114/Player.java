package d0114;

public class Player {
	
	private PlayerLevel level;
	
	public Player() {
		this.level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public void getLevel() {
		level.showLevelMessage();
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public int play(int count) {
		level.go(count);	
		return 0;
	}

}
