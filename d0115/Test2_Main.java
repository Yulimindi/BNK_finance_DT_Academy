package d0115;

public class Test2_Main {

	public static void main(String[] args) {
		// 정수 실수 문자열 배열 3개를 만들어
		Integer[] arr = {1, 2, 3};
		Double[] arr2 = {1.1, 2.1, 3.1}; // Float는 숫자 뒤에 f 붙어야함
		String[] arr3 = {"aa", "bb", "cc"};
		
		Test2.printArr(arr);
		
		System.out.println();
		
		Test2.printArr(arr2);
		
		System.out.println();
		
		Test2.printArr(arr3);

	}

}
