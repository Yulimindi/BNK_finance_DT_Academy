package d0113;

import java.util.Objects;

class A {
	String s;
	
	A() {
		s = "aaa";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true; // 1. 반사성
		if(!(obj instanceof A)) return false; // 2. 타입 검사
		
		A a = (A)obj;
		
		// null-safe 비교
		if(s == null) {
			return a.s == null;
		}
		
		// return this.s.equals(a.s);
		return Objects.equals(s, a.s);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(s);
	}
	
	
}

public class Test_Equals {
	public static  void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.equals(a2));
	}
}
