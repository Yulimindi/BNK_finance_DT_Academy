package d0107;



class A{
	char c; // 멤버변수, 필드, 인스턴스 변수(인스턴스가 만들어져야 사용할 수 있으니까) 인스턴스 <--> 스태틱
	static int n;
	
	public A() { // ctrl + shift + enter
		c = 'A';
		n = 9;	
	}
	
	// f 함수 만들고 그 함수가 호출되면 c라는 멤버변수의 값에 Z라는 문자열이 저장되어야함
	void f() {
		this.c = 'Z';
	}
	
	
}

public class Test_Instance { // 자바 파일 내에서는 public이라고 붙어있는 클래스가 1개여야함

	public static void main(String[] args) {
		
		A.n = 100;
		A a = new A(); // 참조변수 a, 왜 참조변수냐? new A()를 바라보고 있음
		System.out.println(a.c);
		System.out.println(a.n);
		
		A b = new A();
		A c = new A();
		
		a.c = 'A';
		a.c = 'B';
		a.c = 'C';
		
		System.out.println(a.c);
		System.out.println(b.c);
		System.out.println(c.c);
		
		a.c = 3;
		a.c = 6;
		a.c = 10;
		
		System.out.println(a.n);
		System.out.println(b.n);
		System.out.println(c.n);
		
		a.f();
		System.out.println(a.c);
		

	}

}
