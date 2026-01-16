package d0116;

import java.util.Arrays;

public class ArrayObjEqual {
	public static void main(String[] args) {
		INum[] ar1 = new INum[3];
		INum[] ar2 = new INum[3];
		String[] ar3 = {"a", "a", "a"};
		
		ar1[0] = new INum(1);
		ar1[1] = new INum(2);
		ar1[2] = new INum(3);
		
		ar2[0] = new INum(1);
		ar2[1] = new INum(2);
		ar2[2] = new INum(3);
		
		// System.out.println(Arrays.equals(ar1, ar2)); 
		// Arrays.equals(ar1, ar2); // 배열 전체 (하나하나 다) 비교
		
		// ar1.equals(ar2);
		ar1.equals(ar3);
		System.out.println(ar1[0].equals(ar2[0]));
		
		// System.out.println(Arrays.equals(ar1, ar2));
		
		
	}
}
