package d0116;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
		
//		for(double a : arCpy1) {
//			System.out.print(a + "\t");
//		}
		
		double[] arCpy2 = Arrays.copyOf(arOrg, 3);
		
//		for(double a : arCpy2) {
//			System.out.print(a + "\t");
//		}
		
		double[] arCpy3 = Arrays.copyOfRange(arOrg, 1, 3);
		
//		for(double a : arCpy3) {
//			System.out.print(a + "\t");
//		}
		
		double[] cpy = new double[3];
		System.arraycopy(arOrg, 0, cpy, 0, 3);
		
		for(double d : cpy) {
			System.out.print(d + "\t");
		}
		
	}
}
