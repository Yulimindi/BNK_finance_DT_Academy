package d0112;

public class TestFly {

	public static void main(String[] args) {
		Bird b = new Bird();
		Car c = new Car();
		Human h = new Human();
	
		// 인터페이스는 타입으로 존재한다!
		Flyable[] f = new Flyable[3];
		
		f[0] = b;
		f[1] = c;
		f[2] = h;
		
		for(int i = 0; i < f.length; i++) {
			System.out.print((i + 1) + "번 : ");
			f[i].fly();
		}
		
	}

}
