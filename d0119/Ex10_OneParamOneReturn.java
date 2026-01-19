package d0119;

interface HowLong {
	int len(String s);
}

interface WhichClass {
	Object which(Object o);
}

public class Ex10_OneParamOneReturn {

	public static void main(String[] args) {
		
		HowLong h1 = s -> s.length();
		System.out.println(h1.len("안녕빤쓰"));
		
		WhichClass wc = o -> o.getClass();
		
		String g = "안녕반가웜";
		System.out.println(wc.which(g));
		
		
		
		
	}

}
