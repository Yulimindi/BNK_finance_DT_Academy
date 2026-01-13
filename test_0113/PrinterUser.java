package test_0113;

public class PrinterUser {

	public static void main(String[] args) {
		Printable p1 = new HpPrinter();
		Printable p2 = new CanonPrinter();
		
		System.out.println("========== 1 ==========");
		p1.colorPrint();
		p2.colorPrint();
		
		p1.blackPrint();
		p2.blackPrint();
		
		System.out.println("========== 2 ==========");
		
		Printable p3 = new PrinterFactory("Hp").printerFactory();
		Printable p4 = new PrinterFactory("Canon").printerFactory();
		Printable p5 = new PrinterFactory("복합기").printerFactory();
		
		p3.colorPrint();
		p3.showEndMSG();
		
		p4.colorPrint();
		p4.showEndMSG();
		
		p3.blackPrint();
		p3.showEndMSG();
		
		p4.blackPrint();
		p4.showEndMSG();
		
		System.out.println("========== 3 ==========");
		
		p5.colorPrint();
		p5.blackPrint();
		p5.showEndMSG();
		
		System.out.println("========== 4 ==========");
		
		MultiFunctionPrinter mp = (MultiFunctionPrinter)p5;
		mp.copy();
		mp.scan();
		mp.showEndMSG();
	}

}
