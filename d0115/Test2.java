package d0115;

public class Test2 { // 배열 요소를 출력해주는 기능 갖고 있는 클래스를 활용해서 3개의 배열을 출력해봐라
	
	// 이 문제는 클래스 자체에 제네릭을 쓰지 않고 메소드에 써보는 문제임
	
//	T[] t;
//	
//	void set(T[] t) {
//		this.t = t;
//	}
	
	static <T> void printArr(T[] t) {
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " ");
		}
	}
}
