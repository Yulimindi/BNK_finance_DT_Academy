package d0106;

import java.util.Scanner;

public class Ex_Class01 {

	// 학생 클래스 만들기
	static class Student {
		int num;
		char gender;
		String name;
		
		Student() {
			num = 0;
			gender = 'F';
			name = "yulimindi";
		}
		
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.num = 13;
		
		System.out.println(student.num);
		System.out.println(student.gender);
		System.out.println(student.name);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("환영합니다. 회원 가입을 시작합니다.");
		
		System.out.println("학번을 입력해주세요. : ");
		int num = sc.nextInt();
		System.out.println("성별을 입력해주세요. (M/F) : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("이름을 입력해주세요. : ");
		String name = sc.nextLine();
		sc.nextLine();

		System.out.println("입력하신 학번은 : " + num + "입니다.");
		System.out.println("입력하신 성별은 : " + gender + "입니다.");
		System.out.println("입력하신 이름은 : " + name + "입니다.");
		
	}

}
