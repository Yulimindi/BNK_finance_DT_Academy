package d0107;

//유닛 클래스를 만들어라 에너지가 있음 기본 에너지 = 5 얘는 누군가를 공격할 수가 있어 유닛 이름 넣어라잉
// 어택이라는 메서드를 만들어 그럼 어떤 대상을 공격해야해 공격 받은 대상의 에너지가 2만큼 줄어


public class Unit {

	private int energy;
	String name;
	
	Unit(String name) {
		energy = 5;
		this.name = name;
	}
	
	void attack(Unit unit) {
		unit.decreaseEnergy();
	}
	
	void absorb(Unit unit) {
		// 상대 에너지 빨아먹는 메서드
		unit.decreaseEnergy();
		this.increaseEnergy();
	}
	
	public int getEnergy() {
		return energy;
	}
	
	void decreaseEnergy() {
		this.energy = this.energy - 2;
	}
	
	void increaseEnergy() {
		this.energy = this.energy + 2;
	}
	
	public void infoUnitToString() {
		System.out.println("유닛 이름 : " + this.name + " 에너지 : " + this.energy);
	}
	
}
