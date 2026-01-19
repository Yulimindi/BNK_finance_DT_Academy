package d0119;

public class MemberTest {

	public static void main(String[] args) {

		// 스위치문 사용해서 각자 멤버가 뭐냐에 따라 이동하게 하기
		Member m1 = new Member("마준배", Member_Role.ADMIN);
		Member m2 = new Member("GG", Member_Role.MEMBER);
		Member m3 = new Member("김성룡", Member_Role.GUEST);
		
		m1.getRole().go();
		m2.getRole().go();
		m3.getRole().go();
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		
	}

}
