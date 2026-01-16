package d0116;

public class MySystemMain {
	
	static void printArray(Object[] obj) {
		for(Object d : obj) {
			System.out.print(d + " ");
		}
	}

	public static void main(String[] args) {
		
	
		
		Integer[] arr1 = {1, 2, 3, 4, 5};
		Integer[] newArr1 = new Integer[3];
		
		String[] arr2 = {"a", "b", "c", "d", "e"};
		String[] newArr2 = new String[3];
		
		MySystem.arrayCopy(arr1, 2, newArr1, 0, 3);
		MySystem.arrayCopy(arr2, 2, newArr2, 0, 3);
		
		printArray(newArr1);
		
	}
}
