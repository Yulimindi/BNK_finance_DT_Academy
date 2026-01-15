package d0115.Box;

public class Box2<T> { // 타입 파라미터 지정해주기
	
	private T ob;
	
	public void set(T ob) {
		this.ob = ob;
	}
	
	public T get() {
		return this.ob;
	}
	
}