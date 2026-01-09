package d0105;

public class Ex_Array02 { // 2차원 배열

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		int[][] newArr = new int[2][2];
		newArr[1][1] = 10;
		System.out.println();
		System.out.print(newArr[1][1]);
		System.out.println();
		
		int num = 1;
		
		
		boolean flag = true; // 상태 변수
		
		// 4행 5열 배열 생성
		int[][] hiArr = new int[4][5];
		
		for(int i = 0; i < hiArr.length; i++) { // 행만큼
		
			if (flag) {
				for (int j = 0; j < hiArr[i].length; j++) { // 정상
					hiArr[i][j] = num;
					num++;
				}
				flag = false;
			
			} else if (!flag) {
				for (int j = hiArr.length; j >= 0; j--) {
					hiArr[i][j] = num;
					num++;
				}
				flag = true;
			}
			
			System.out.println();
		}
		
		
		// 잘 들어갔나 확인 출력
		for(int i = 0; i < hiArr.length; i++) { 
			for (int j = 0; j < hiArr[i].length; j++) {
				System.out.print(hiArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
