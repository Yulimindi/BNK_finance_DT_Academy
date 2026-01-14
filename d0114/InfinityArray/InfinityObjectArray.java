package d0114.InfinityArray;

public class InfinityObjectArray {

	private Object[] arr;
	private int count;
	
	// ============ 기본 생성자 ============
	public InfinityObjectArray() {
		arr = new Object[3];
		count = 0;
	}
	
	// ============ 메서드 ============ 
	
	// arr 확인 (출력)
	void showArr() {
		for(int i = 0; i < count; i++) {
			System.out.println(arr[i].toString());
		}
	}
	
	// arr에 있는 값들이 Boss 자료형인지 확인 후 맞으면 repeat 함수 실행
	void repeat() { 
		for(int i = 0; i < count; i++) {
			if(arr[i] instanceof Boss) {
				Boss a = (Boss)arr[i];
				a.repeat();
			} else {
				System.out.println("Repeat Error");
			}
		}
	}
	
	// arr에 값 추가
	void addArr(Object o) {
		
		Object[] newArr;
		
		if(count >= arr.length) {
			System.out.println("배열을 새로 만들어 추가합니다.");
			System.out.println("이전 카운트 : " + count);
			count++;
			System.out.println("현재 카운트 : " + count);
			
			newArr = new Object[arr.length + 3];
			newArr[count - 1] = o;
			
			for(int i = 0; i < count - 1; i++) {
				newArr[i] = arr[i];
			}
			
			arr = new Object[newArr.length];
			
			for(int i = 0; i < count; i++) {
				arr[i] = newArr[i];
			}

		} else if (count < arr.length) {
		
			System.out.println("배열이 꽉 차있지 않아 그대로 추가합니다.");
			arr[count] = o;
			count++;
			
		} else {
			System.out.println("Error");			
		}
		
	}
	
	// arr 길이 확인
	public void getArrLength() {
		System.out.println(arr.length);
	}
	
	
}
