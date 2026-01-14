package d0114.InfinityArray;

public class B extends Boss {
	
	int b = 1;
	
	@Override
	public String toString() {
		String s = "B 클래스의 필드값은 " + b + "입니다.";
		return s;
	}
	
	@Override
	void repeat() {
		System.out.println("B의 bf 함수 실행");
	}
	
}
