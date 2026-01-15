package d0115.Box;

public class Box {

	// 내가 만든 객체를 여기 넣는 역할
	private Object ob;
	
	public void set(Object ob) {
		this.ob = ob;
	}
	
	public Object get() {
		return this.ob;
	}
}
