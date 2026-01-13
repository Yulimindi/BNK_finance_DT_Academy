package d0113;

public class LTv implements TV {

	boolean power;
	int volume;
	String brandName = "LG";
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println(brandName + " 티비를 켰습니다.");
	}
	
	@Override
	public void powerOff() {
		power = false;
		System.out.println(brandName + " 티비를 껐습니다.");
	}
	
	@Override
	public void volumeUp() {
		if(power == true) {
			this.volume++;
			System.out.println(brandName + " 티비의 볼륨을 올립니다.");
			System.out.println("현재 볼륨 : " + this.volume);
		} else {
			System.out.println(brandName + " 티비가 꺼져있습니다.");
		}
	}
	
	@Override
	public void volumeDown() {
		if(power == true) {
			if(volume == 0) {
				System.out.println(brandName + " 티비의 볼륨을 내립니다.");
				System.out.println("현재 볼륨 : " + this.volume);
			} else {
				this.volume--;
				System.out.println(brandName + " 티비의 볼륨을 내립니다.");
				System.out.println("현재 볼륨 : " + this.volume);
			}
		} else {
			System.out.println(brandName + " 티비가 꺼져있습니다.");
		}
	}
	
}
