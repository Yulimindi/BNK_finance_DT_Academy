package test_0113;

public class PrinterFactory {
	String brand;
	
	// ============= 생성자 =============
	public PrinterFactory(String brand) {
		this.brand = brand;
	}
	
	// ============= 메서드 =============
	Printable printerFactory() {
		if(brand.equals("Hp")) {
			Printable print = new HpPrinter();
			return print; 
		} else if (brand.equals("Canon")) {
			Printable print = new CanonPrinter();
			return print;
		} else if (brand.equals("복합기")) {
			Printable print = new MultiFunctionPrinter();
			return print;
		} else {
			return null;
		}
	}
	
}

// 멀티펑셔너블 인터페이스를 만ㄷ는데 얘는 프린터블 스캐너블 카피어블 3개 인스턴스를 상속 받아야함