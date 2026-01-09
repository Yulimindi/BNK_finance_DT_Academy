package d1018;

import java.util.Scanner;

public class Member_SignUp {
	static void signUp(Member_Save ms) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입을 시작합니다.");
		
		System.out.println("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.println("전화번호를 띄어쓰기 없이 입력해주세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별을 입력해주세요(남자/여자) : ");
		String gender = sc.nextLine();
		
		System.out.println("사는 곳을 시/도 단위로 입력해주세요 : ");
		String adress = sc.nextLine();
		
		Member m = new Member();
		m.name = name;
		m.num = num;
		m.gender = gender;
		m.adress = adress;
		
		ms.addMember(m);
		
		System.out.println("회원가입이 완료되었습니다!");
	}
}