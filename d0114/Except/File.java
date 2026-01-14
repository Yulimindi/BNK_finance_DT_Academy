package d0114.Except;

// import java.io.FileNotFoundException;
// import java.io.FileReader;

public class File {

	public void f1() throws NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException {
		f2();
	}
	
	public void f2() throws NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException {
		String s = null;
		int n = s.length();

	}
	
	public static void main(String[] args) throws MyException {
		
		File f = new File();
		
		try {
			f.f1();
		} catch(NullPointerException n) {
			System.out.println("f1() catch");
			throw new MyException(n.getMessage());
		} catch(ArithmeticException a) {
			System.out.println("ArithmeticException");
		} catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
//		try {
//			FileReader fr = new FileReader("a.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("end....");
	}
	
}
