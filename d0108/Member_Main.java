package d0108;

import java.util.Scanner;

public class Member_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Member_Save ms = new Member_Save();
		while(true) {
			System.out.println("환영합니다. 무엇을 하시겠습니까?");
			System.out.println("1 : 회원가입, 2 : 회원조회, 3 : 종료");
			int choose = sc.nextInt();
			
			if(choose == 1) {
				signUp(ms);
			} else if(choose == 2) {
				ms.check();
			} else if (choose == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("제대로 입력하세요.");
			}
			
		}

	}
	
	public static void signUp(Member_Save ms) {
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
