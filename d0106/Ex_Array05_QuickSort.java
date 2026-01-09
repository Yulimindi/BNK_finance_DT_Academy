package d0106;

public class Ex_Array05_QuickSort {

	public static void main(String[] args) {
		// 퀵소트
		// pivot, start, end 필요 start >= end 종료, 해당 배열 자리 선택 완료
		
		int[] arr = {3, 1, 4, 5, 7, 8, 2};
		int[] newArr = new int[10]; // 최종적으로 정렬된 배열
		int start = 0;
		int end = arr.length;
		int pivot = arr.length / 2;
		int stopStart = 0;
		int stopEnd = 0;
		int tmp = 0;
		
		
		
		while(start < end) {
				
			// start가 pivot보다 크면 스탑
			if(arr[start] > arr[pivot]) {
				stopStart = start;
			}
			
			// end가 pivot보다 작으면 스탑
			if(arr[pivot] > arr[end]) {
				stopEnd = end;
			}
			
			// 스탑된 start와 end 비교
			tmp = stopStart;
			stopStart = stopEnd;
			stopEnd = tmp;
			
			// 탐색을 위해 start값 증가
			start++;
			// 탐색을 위해 end값 증가
			end--;
				
			}
		// while문 탈출하면 정해진 pivot의 위치를 newArr에 저장
			
			
		
	
		
	}

}
