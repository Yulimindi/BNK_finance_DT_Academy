package d0107;

//유닛 클래스를 만들어라 에너지가 있음 기본 에너지 = 5 얘는 누군가를 공격할 수가 있어
//어택이라는 메서드를 만들어 그럼 어떤 대상을 공격해야해 공격 받은 대상의 에너지가 2만큼 줄어

public class Unit_Main {

	public static void main(String[] args) {
		
		Unit maJunbae = new Unit("maJunbae");
		Unit yulimindi = new Unit("yulimindi");
		
		System.out.println(maJunbae.getEnergy());
		
		maJunbae.attack(yulimindi);
		
		yulimindi.absorb(maJunbae);
		
		yulimindi.infoUnitToString();
	}

}
