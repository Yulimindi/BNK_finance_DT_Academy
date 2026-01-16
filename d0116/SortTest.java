package d0116;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		int[] ar1 = {1, 5, 2, 3, 4};
		
		Arrays.sort(ar1); // 배열을 정렬된 상태로 만듦 (원본 배열 바뀌니까 조심히 써야함)
		
		for(int n : ar1) {
			System.out.print(n + "\t");
		}

	}

}
