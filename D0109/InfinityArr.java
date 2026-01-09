package D0109;

// 무한 배열 만들기 필드에 무한 배열이 들어가야하자나 최초의 유한 배열은 크기를 3으로 하자
// 배열 복사해서 배열 인덱스 초과하면 기존 배열 + 1 해서 복사한거 넣으면 되려나
// 지역변수를 쓸건지 전역변수를 쓸건지

// 무한배열 만들기

public class InfinityArr {
	
	// ============== 필드 ==============
	
	int i = 0;
	private int[] arr;
	private int[] newArr;
	
	// ============== 메서드 ==============
	
	public InfinityArr() {
		arr = new int[3];
	}
	
	void append(int a) {
		
		if(i < arr.length) {
			arr[i] = a;
		} else {
			newArr = new int[arr.length+3];
			
			for(int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			
			newArr[arr.length] = a;
			
			arr = new int[newArr.length];
			
			for(int i = 0; i < newArr.length; i++) {
				arr[i] = newArr[i];
			}
		}
		
		i++;
		
	}
	
	void printArr() {
		System.out.println("현재 배열의 길이는 '" + arr.length + "' 입니다.");
		System.out.print("현재 배열의 요소는 [ ");
		
		// 배열 안에 값이 널인지 아닌지 확인 하고 for문 돌리기
		for(int i = 0; i < this.i; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("] 입니다.");		
	}
}


