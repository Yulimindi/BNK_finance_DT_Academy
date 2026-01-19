package d0119;

interface Printable2 {
	void print2();
}

class Papers2 {
	private String con;
	
	public Papers2 (String s) {
		con = s;
	}
	
	public Printable2 getPrinter() { // 인터페이스의 구현체는 클래스인데 클래스 없이 클래스 기능 구현

//		class Printer implements Printable {
//			@Override
//			public void print() {
//				System.out.println(con);
//			}
//		}
//		return new Printable2() {
//			@Override
//			public void print2() {
//				System.out.println(con);		
//			}
//		};

		
		return () -> System.out.println(con);
	
	}

}


public class Ex06_UseAnonymousInner {
	public static void main(String[] args) {
		Papers2 p = new Papers2("안녕 반가웜");
		Printable2 pnt = p.getPrinter();
		pnt.print2();
	}
}
