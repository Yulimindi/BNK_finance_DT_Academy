package d0112;


class A {
	protected int n; // 접근 제한자 protected 
	String name;
	
	public A() {
		System.out.println("A 클래스 인스턴스 생성...");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	void f() {
		System.out.println("f() 함수 실행 : " + n);
	}
}

class B extends A {
	String s;
	
	public B() {
		System.out.println("B 클래스 인스턴스 생성...");
	}
	
	void f1() {
		System.out.println("f1 함수 실행 : " + s + ", n = " + n);
	}
	
	void sleep() {
		System.out.println(this.name + " zzz...");
	}
}

class C extends A {
	float f;
	
	void f2() {
		System.out.println("f2() 함수 실행..." + f);
	}
}

public class Test_Inheritence {


	public static void main(String[] args) {
		
		B b = new B();
		b.s = "안녕";
		
		b.n = 3;
		b.f1();
		b.f();
		
		System.out.println();
		b.setName("puppy");
		b.sleep();
		
		A a = new A();
		
		// B는 A와 B를 모두 담고 있는데 A로 선언하면 A 크기만큼의 평판이 나오니까 A만큼만 사용할 수 있는거임 B 영역을 볼 수가 없어!
		// 근데 나는 A만큼 말고 B를 전부 다 사용하고 싶어! 그래서 나는 A 크기 평판 말고 B 크기 평판이 필요해!
		// B x = ab; 이렇게 하면 타입 불일치 에러가 남 ab는 A 타입이니까 그래서 형변환을 해줘야함
		
		A ab = new B();
		// B x = (B)ab; 상속 관계는 형변환이 허용이 됨!
		A ac = new C(); // A타입으로 변수 선언하고 C타입으로 인스턴스 생성하기
		
		
		// ab와 ac 2개를 둘 다 다룰 순 없을까? A의 배열을 만들어보자
		A[] aa = new A[2];
		aa[0] = new B();
		aa[1] = new C();
		
		aa[0].setName("강아지");
		
		B x = (B)aa[0];
				
		
		
		
	}

}
