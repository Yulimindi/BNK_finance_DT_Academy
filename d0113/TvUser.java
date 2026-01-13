package d0113;

public class TvUser {

	public static void main(String[] args) {
		
		TV tv = new TvFactory("삼성").getBrand();
		
		tv.powerOff();
		tv.powerOn();
		tv.volumeDown();
		tv.volumeUp();
		tv.volumeUp();
		
	}

}
