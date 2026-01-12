package d0112;


class Mouse {
	String str;
	
	public void clickLeft() {
		System.out.println(str + "로 왼쪽 클릭...");
	}
	
	public void clickRight() {
		System.out.println(str + "로 오른쪽 클릭...");
	}
}

class WheelMouse extends Mouse {
	
	@Override
	public void clickLeft() {
		System.out.println(str + "로 왼쪽 클릭...");
	}
	
	@Override
	public void clickRight() {
		System.out.println(str + "로 왼쪽 클릭...");
	}
	
	public void scroll() {
		System.out.println("스크롤...");
	}
}

class OpticalMouse extends Mouse {
	
	@Override
	public void clickLeft() {
		System.out.println(str + "로 왼쪽 클릭...");
	}
	
	@Override
	public void clickRight() {
		System.out.println(str + "로 오른쪽 클릭...");
	}
}

public class MouseTest {

	public static void main(String[] args) {
		// 반복문을 사용해서 3개의 마우스의 왼쪽 오른쪽 클릭을 테스트 해보아라
		
		
		
		Mouse[] m = new Mouse[3];
	
		m[0] = new Mouse();
		m[1] = new WheelMouse();
		m[2] = new OpticalMouse();
		
		m[0].str = "마우스";
		m[1].str = "휠마우스";
		m[2].str = "광마우스";
		
		
		for(int i = 0; i < m.length; i++) {
			m[i].clickLeft();
			m[i].clickRight();
		}
		
		
		m[1].clickLeft();
		
		WheelMouse wm = (WheelMouse)m[1];
		
		wm.scroll();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] instanceof OpticalMouse) {
				System.out.println("광마우스입니다.");
			} else if (m[i] instanceof WheelMouse) {
				System.out.println("휠마우스입니다.");
			} else if (m[i] instanceof Mouse) {
				System.out.println("기본마우스입니다.");
			}
		}
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getClass().equals(Mouse.class)) {
				System.out.println("기본 마우스입니다.");
			} else if (m[i].getClass().equals(WheelMouse.class)) {
				System.out.println("휠마우스입니다.");
			} else if (m[i].getClass().equals(OpticalMouse.class)) {
				System.out.println("광마우스입니다.");
			}
		}
		
		System.out.println("wm : " + (wm instanceof WheelMouse));
		
		System.out.println(Mouse.class);
		
		
	}

}
