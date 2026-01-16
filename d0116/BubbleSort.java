package d0116;

public class BubbleSort {

	int tmp;
	
	void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
	}
}
