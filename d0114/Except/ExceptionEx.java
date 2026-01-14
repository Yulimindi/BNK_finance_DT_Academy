package d0114.Except;

// import d0107.Student;

public class ExceptionEx {

	public static void main(String[] args) {
		
		// ArithmeticException
		// int n = 4 / 0;
		
		// ArrayIndexOutOfBoundsException
		// int[] arr = new int[3];
		// System.out.println(arr[3]);
		
		// NullPointerException
		// Student s = null;
		// s.getName();
		
		try {
			int[] arr = new int[3];
			System.out.println(arr[3]);
		} catch(ArithmeticException r) {
			System.out.println("ArithmeticException 발생");
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		} catch(NullPointerException n) {
			System.out.println("NullPointerException 발생");
		} catch(Exception e) {
			System.out.println("예외 발생");
		}
		
		
		System.out.println("end");

	}
}
