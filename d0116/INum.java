package d0116;

public class INum {
	
	private int num;
	
	public INum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) { // 배열 전체가 아닌 객체 하나 비교
		if(obj instanceof INum) {
			INum i = (INum)obj;
			return num == i.num;
		} else {
			System.out.println(obj + "는 INum에 속하지 않습니다.");
			return false;
		}
		
	}
	
}
