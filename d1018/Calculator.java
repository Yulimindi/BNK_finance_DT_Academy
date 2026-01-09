package d1018;

// 계산기 add sub mul div 파일 분리 / 실행 클래스 있음 그건 UI 담당(출력문, 사용자입력) / calculater라는 클래스 만들어서
// 계산 담당 클래스

public class Calculator {
	
	int num1;
	int num2;

	// ================= 메서드 =================
	
	// 더하기
	static void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	// 빼기
	void sub() {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}
	
	// 곱하기
	void mul() {
		System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
	}
	
	// 나누기
	void div() {
		System.out.println(num1 + " / " + num2 + " = 몫 : " + num1 / num2 + " 나머지 : " + (num1 % num2));
	}
	

}
