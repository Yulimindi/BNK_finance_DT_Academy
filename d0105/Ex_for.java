package d0105;

public class Ex_for {

	public static void main(String[] args) {
	
		// 중첩 반복문
		/* 구구단 찍기 2 * 1 = 2 형태로
		for(int i = 1; i < 10; i++) {
			System.out.println();
			for(int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + ", ");
			}
		}
		*/
		
		// 별 찍기
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 별 반대로 찍기
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

}
