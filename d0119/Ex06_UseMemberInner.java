package d0119;

interface Printable {
	void print();
}

class Papers {
	private String con;
	
	public Papers (String s) {
		con = s;
	}
	
	public Printable getPrinter() {
		// 이 메소드 안에서만 Printer 인스턴스를 생성할 수 있다
		// 얘는 내부 클래스라서 final 또는 abstract만 가능
		class Printer implements Printable {
			@Override
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer();
	}
	
	
}

public class Ex06_UseMemberInner {

	public static void main(String[] args) {
		Papers p = new Papers("서류 내용 : 안녕하새우");
//		Papers.Printer printer = p.new Printer();
//		printer.print();
		
//		p.getPrinter();
		Printable prn = p.getPrinter();
		prn.print();
		
	}
	
}
