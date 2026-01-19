package d0119;

interface Role { // 인터페이스에 선언된 필드는 모두 public static final이다~ 인터페이스 구성 요소 : 스태틱 상수, 스태틱 메서드, 디폴트 메서드, 원래 인터페이스의 존재 이유는 추상 메서드
	int ADMIN = 1;
	int MEMBER = 2;
	int GUEST = 3;
}

public class Ex01_ClassBasedConst {
	public static void main(String[] args) {
		
		System.out.println(Role.ADMIN);
		
		int user = Role.ADMIN;
		
		switch(user) {
		case Role.ADMIN:
			System.out.println("관리자");
			break;
		case Role.MEMBER:
			System.out.println("회원");
			break;
		case Role.GUEST:
			System.out.println("손님");
			break;
		default:
			System.out.println("?");
		}
		
	}
}
