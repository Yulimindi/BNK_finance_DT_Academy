package d0106;

import java.util.Scanner;


public class Calculating_static {

	
	public static void input(saveNum savenum) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산을 원하는 첫번째 숫자를 입력해주세요. : ");
		int num1 = sc.nextInt();
		System.out.println("연산을 원하는 두번째 숫자를 입력해주세요. : ");
		int num2 = sc.nextInt();
		
		savenum.num1 = num1;
		savenum.num2 = num2;
	}
	
	public static void plus(saveNum savenum) {
		input(savenum);
		System.out.println("덧셈 결과 : " + (savenum.num1 + savenum.num2));
	}
	
	public static void sub(saveNum savenum) {
		input(savenum);
		System.out.println("뺄셈 결과 : " + (savenum.num1 - savenum.num2));
	}
	
	public static void mul(saveNum savenum) {
		input(savenum);
		System.out.println("곱셈 결과 : " + savenum.num1 * savenum.num2);

	}
	
	public static void div(saveNum savenum) {
		input(savenum);
		System.out.println("나눗셈 결과 : " + savenum.num1 / savenum.num2);
	}
	
	static class saveNum {
		int num1;
		int num2;
		
		saveNum() {
			num1 = 0;
			num2 = 0;
		}
	}
	
	static class sum { // 계산 결과 저장
		int plus;
		int sub;
		int mul;
		int div;
		
		sum() {
			plus = 0;
			sub = 0;
			mul = 0;
			div = 0;
		}
	}
	
	public static void main(String[] args) {
		
		saveNum savenum = new saveNum();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			System.out.println("계산기를 깨우셨습니다. 하암냐.");
			
			
			System.out.println("어떤 연산을 원하시나요? (더하기 = 1, 빼기 = 2, 곱하기 = 3, 나누기 = 4, 종료 = 5) : ");
			int choose = sc.nextInt();
			
			if(choose == 1) {
				plus(savenum);
			} else if(choose == 2) {
				sub(savenum);
			} else if (choose == 3) {
				mul(savenum);
			} else if (choose == 4) {
				div(savenum);
			} else if (choose == 5) {
				System.out.println("피곤한 계산기는 자러 갑니다... 흠냐");
				break;
			} else if (choose == 6) {
				
			}
				else {
				System.out.println("알맞은 숫자를 입력해주세요.");
				count++;
				
				if(count > 2) {
					System.out.println("갈!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("숫자를 올바르게 입력해주세요.");
				}
			}
			
		}
		
	}
	

}
