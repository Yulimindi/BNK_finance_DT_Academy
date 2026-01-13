package test_0113;

public interface Printable {
	
	
	public void colorPrint();
	
	public void blackPrint();
	
	default void showEndMSG() {
		System.out.println("출력을 종료합니다.");
	}
	
}

// MultiFunctionPrinter 복합기 : 복합기의 기능은 인터페이스로 만들기 printable은 있고 scanable, copyable