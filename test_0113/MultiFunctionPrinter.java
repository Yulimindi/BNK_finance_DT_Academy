package test_0113;

public class MultiFunctionPrinter implements Scanable, Copyable, Printable {
	
	String brand;
	
	@Override
	public void blackPrint() {
		this.brand = "복합기";
		System.out.println(brand + "로 컬러 프린트 합니다 지잉");
	}
	
	@Override
	public void colorPrint() {
		this.brand = "복합기";
		System.out.println(brand + "로 컬러 프린트 합니다 지잉");
		
	}
	
	@Override
	public void copy() {
		System.out.println("복사 할게용 찌이잉");
		
	}
	
	@Override
	public void scan() {
		System.out.println("스캔 할게용 쥐이잉");
		
	}
	
}
