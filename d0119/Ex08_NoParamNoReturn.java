package d0119;

interface Flyable {
	void fly();
}

public class Ex08_NoParamNoReturn {

	public static void main(String[] args) {
//		Flyable f;
//		f = new Flyable() {
//			@Override
//			public void fly() {
//				System.out.println("날쟈~~~~~~~~");
//			}
//		};
		
		Flyable f = () -> { System.out.println("날쟈~~~~"); System.out.println("안뇽티비"); };
		f.fly();
		
	}

}