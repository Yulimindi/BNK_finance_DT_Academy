package d0114.InfinityArray;

public class A extends Boss{
	
	String a = "HelloA";
	
	@Override
	public String toString() {
		String s = "A 클래스의 필드값은 " + a + "입니다.";
		return s;
	}
	
	@Override
	void repeat() {
		System.out.println("A의 af 함수 실행");
	}
}