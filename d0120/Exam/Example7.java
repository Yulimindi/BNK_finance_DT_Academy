package d0120.Exam;

public class Example7 {
	
	public interface HowLong {
		int len(String s);
	}
	
	
	public static void main (String[] args) {
		String word = "Hello";
		HowLong hw = s -> s.length();
		System.out.println(hw.len(word));
	}
	
}
