package d0116;

public class SortMain {
	
	public static void main(String args[]) {
		int[] arr = {3, 1, 4, 6, 7};
		int[] arr2 = {3, 1, 4, 6, 7};
		SelectSort s = new SelectSort();
		BubbleSort b = new BubbleSort();
		
		s.selectSort(arr);
		SelectSort.printArr(arr);
		
		b.bubbleSort(arr2);
		SelectSort.printArr(arr2);
	}
}
