package d0119;


/*
 * 클래스 내에 정의된 클래스 - Nested Class 
 * 1. Static Nested Class 
 *    - 외부 클래스(Outer)의 인스턴스와 상관없이 static Nested1 Class의 인스턴스를 생성한다.
 * 2. Non-Static Nested Class
 *    1) Member Inner Class(클래스 내)
 *    2) Local Inner Class(메소드 내) -> 클래스를 함수 안에 둘 수 있다
 *    3) Anonymous Inner Class(익명 클래스)
 */

class Outer {
	// Nested1 n;
	private static int num = 0;
	
	// 내부 클래스 1
	static class Nested1 {
		int count;
		
		void add(int n) {
			count++;
			System.out.println(count + ". add 실행");
			num += n;
		}
		
		void sub(int n) {
			count++;
			System.out.println(count + ". sub 실행");
			num -= n;
		}
	
	}
	
	// 내부 클래스 2
	static class Nested2 {
		void getNum() {
			System.out.println("num의 값 : " + num); // 같은 내부 클래스에 있기에 num에 그냥 접근할 수 있음 아니면 Outer.num 이렇게 접근 하겠지용
		}
	}
	
}

public class Ex04_NestedClass {
	public static void main(String[] args) {
		Outer.Nested1 n = new Outer.Nested1();
		Outer.Nested2 n2 = new Outer.Nested2(); 
		n.add(3);
		n2.getNum();
		n.sub(3);
		n2.getNum();
	}
}
