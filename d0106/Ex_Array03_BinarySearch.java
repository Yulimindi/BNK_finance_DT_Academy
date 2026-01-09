package d0106;

public class Ex_Array03_BinarySearch {
	
	public static void main(String[] args) {
		// 이진 탐색 구현하기
		
		int[] Arr = {1, 24, 33, 42, 55, 62, 79, 88, 90, 103};
		// 1. 배열 중간값 찾아서 해당 값이 배열 중간 값보다 큰지 작은지 비교
		
		// 찾을 숫자 랜덤으로 정하기
		// Random rd = new Random();
		// int randNum = rd.nextInt(10) + 1;
		int mid = 0;
		int start = 0;
		int end = Arr.length;
		int target = 103;
		
		System.out.println("타겟값 : " + target);

		while(start <= end) {
			
			mid = (start+end) / 2;
			System.out.println("중간 값 : " + Arr[mid]);
			
			if(target > Arr[mid]) { // 타겟값이 정한 값보다 크면
				System.out.println("타겟값이 중간 값보다 큽니다.");
				start = mid + 1;
			} else if (target < Arr[mid]) {
				System.out.println("타겟값이 중간 값보다 작습니다.");
				end = mid - 1;
			} else if (target == Arr[mid]) {
				System.out.println("=============================================");
				System.out.println("타겟값은 " + (mid) + "번째 인덱스에 있습니다.");
				break;
			} else {
				System.out.println("타겟값을 찾을 수 없습니다!");
				break;
			}
			
		}
		
		
		
		
	}
}
