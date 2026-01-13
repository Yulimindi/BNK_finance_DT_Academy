package test_0113;

public class HpPrinter implements Printable {
	
	String brand;
	
	@Override
	public void colorPrint() {
		this.brand = "Hp";
		System.out.println(brand + " 프린터로 컬러 프린트 합니다 지잉");
	}
	
	@Override
	public void blackPrint() {
		this.brand = "Hp";
		System.out.println(brand + " 프린터로 컬러 프린트 합니다 지잉");
	}
	
	@Override
	public void showEndMSG() {
		System.out.println("Hp 프린터 프린트 끝났어용");
	}
	
}
