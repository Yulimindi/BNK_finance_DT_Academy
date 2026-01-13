package test_0113;

public class CanonPrinter implements Printable {
	
	String brand;
	
	@Override
	public void colorPrint() {
		this.brand = "Canon";
		System.out.println(brand + " 프린터로 컬러 프린트 합니다 지잉");
	}
	
	@Override
	public void blackPrint() {
		this.brand = "Canon";
		System.out.println(brand + " 프린터로 컬러 프린트 합니다 지잉");
	}
}
