package d0116;

public class SelectSort {
	
	int tmp;
	int num;

	
	void selectSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int min = 101;
			for(int j = i; j < arr.length; j++) { // 최소값 찾기
				if(arr[j] < min) { // 만약 값이 min보다 작으면 min에 해당 값 넣기
					min = arr[j];
					num = j;
				}
			}
			tmp = arr[i];
			arr[i] = min;
			arr[num] = tmp;
		}
		
	}
	
	
	static void printArr(int[] arr) {
		System.out.print("[ ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

}

	