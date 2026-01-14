package d0114.InfinityArray;

public class C extends Boss {
	
	Boolean c = true;
	
	@Override
	public String toString() {
		String s = "C 클래스의 필드값은 " + c + "입니다.";
		return s;
	}
	
	@Override
	void repeat() {
		System.out.println("C의 cf 함수 실행");
	}
	
}
