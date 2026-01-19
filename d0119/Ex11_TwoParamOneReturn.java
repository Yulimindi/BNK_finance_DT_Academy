package d0119;

interface Add {
	int add(int t1, int t2);
}

interface Info {
	String info(String name, int age);
}

interface MyPrinter {
	void print(String blah);
}

@FunctionalInterface
interface Calculate {
	void add(int a, int b);
	
	default int sub(int a, int b) {
		return a - b;
	}
	
	static int mul(int n, int m) {
		return n * m;
	}
	
}



public class Ex11_TwoParamOneReturn {

	public static void main(String[] args) {
		
		Add add = (t1, t2) -> t1 + t2;
		System.out.println(add.add(3, 4));
		
		Info info = (name, age) -> ("이름 : " + name + ", 나이 : " + age).toString();
		System.out.println(info.info("이유림", 25));
		
		MyPrinter printer = blah -> System.out.println(blah);
		printer.print("람다 어렵당");
		
		Calculate add1 = (a, b) -> System.out.println(a + b);
		add1.add(3, 40);
		
		System.out.println(add1.sub(3, 2));
		
		System.out.println(Calculate.mul(2, 3));
		
		
		
	}

}
