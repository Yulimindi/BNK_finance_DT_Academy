package d1018;

import java.util.Scanner;

public class Calculator_main {

	static void scan(Calculator c) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산을 원하는 첫번째 숫자를 입력해주세요.");
		c.num1 = sc.nextInt();

		System.out.println("계산을 원하는 두번째 숫자를 입력해주세요.");
		c.num2 = sc.nextInt();
	}
	
	// 만약 scan 함수를 이용해 직접 입력 받지 않고 그냥 숫자를 줘서 연산을 한다면 숫자를 저장할 필요가 없음
	// 이는 Calculator 클래스에 필드가 필요 없다는 말
	// 그렇다면 Calculator 클래스는 기능만 존재하는 클래스가 됨
	// = 유틸리티 클래스
	// 이런 유틸리티 클래스는 new를 이용한 객체 생성 없이 사용할 수 있음
	// 바로 클래스 안의 메서드에 static을 붙여서 사용하는 것!
	// 메인 함수에서 호출 시에는 객체 생성 없이 클래스이름.함수 로 사용하면 됨! 스태틱 공부할 때 해봤죠?
	// 예시로 더하는 함수를 static으로 설정하여 코드를 구성해봄!
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		
		System.out.println("===== 계산기를 깨우셨습니다. =====");

		int count = 0;
		
		while(true) {
			
			System.out.println("===== 무슨 일을 하시겠습니까? (1 = 더하기, 2 = 빼기, 3 = 곱하기, 4 = 나누기, 5 = 종료) =====");
			int cs = sc.nextInt();
		
			if(cs == 1) {
				Calculator.add(2, 3);
			} else if (cs == 2) {
				scan(c);
				c.sub();
			} else if (cs == 3) {
				scan(c);
				c.mul();
			} else if (cs == 4) {
				scan(c);
				c.div();
			} else if (cs == 5) {
				System.out.println("===== 계산기는 이만 자러 갑니다... 흠냐 =====");
				break;
			} else {
				if(count < 3) {
					System.out.println("올바른 숫자를 입력해주세요.");
					count++;
				} else {
					System.out.println("정신체리!!!!!!!!!!!!");
				}
			}
			
		}
		
	}

}
