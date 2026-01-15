package d0115.InfinityArrayGeneric;

public class InfinityArray<T> {
	// 무한 배열을 제네릭 문법 사용해서 만들기 근데 배열 자체는 제네릭으로 쓸수가 없대요 첨에 배열 자체는 object로 받아서 넣고
	// 대신 infinityArray라고 하는 그 클래스에 다이아몬드 넣어서 타입 지정하래 그러면 object에 들어갈 타입은 하나로 정해질수있지 그렇게 써봅시다
	
	Object[] arr;
	int count;
	
	public InfinityArray() {
		arr = new Object[3];
	}
	
	void add(T t) { // 제네릭 파라미터 메소드
		if (count < arr.length) {
			System.out.println("배열에 새로운 값을 추가합니다.");
			arr[count] = t;
			
			count++;
			
		} else {
	
			System.out.println("배열이 꽉 차 새로운 배열을 생성합니다.");
			Object[] newArr = new Object[arr.length+3];
			newArr[count] = t;
			
			for(int i = 0; i < count; i++) {
				newArr[i] = arr[i];
			}
			
			arr = new Object[newArr.length];
			
			count++;
			
			for(int i = 0; i < count; i++) {
				arr[i] = newArr[i];
			}
			
		}
	}
	
	void add2(int index, T t) {
		if(index < arr.length) {
			// 인덱스 자리에 있는 애부터 뒤에 애들 다 한칸씩 뒤로 밀려야함 그러면 새로운 배열 만들어서 해야겟지요
			System.out.println(t + "를 인덱스 " + index +"에 삽입합니다. 원래 인덱스 값 : " + arr[index]);
			Object[] newArr = new Object[arr.length];
			System.out.println("newArr 크기 : " + newArr.length);
			
			
	
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			
		} else {
			System.out.println("배열 그만큼 없다 임마");
		}
	}
	
	
	void showArr() {
		System.out.println("배열의 값을 출력합니다.");
		System.out.print("[ ");
		for(int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	

	void set(int index, T t) { // 특정 위치의 값 수정
		if (index >= arr.length) {
			System.out.println("생성되지 않은 위치에 값을 넣으셨습니다.");
		} else {
			this.arr[index] = t;
		}
	}
	
	
	
}
