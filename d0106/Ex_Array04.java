package d0106;

import java.util.Random;

public class Ex_Array04 {

	public static void main(String[] args) {
		// 로또 번호 추출기, 랜덤 번호 6개 배열 생성. 중복값 금지. 
		Random rd = new Random();
		int[] lotto = new int[6];
		
		System.out.println();
		System.out.println();
		System.out.println("1번 방식 : 우선 값을 넣은 후 비교");
		System.out.println();
		System.out.println();
		
		for(int i = 1; i < lotto.length + 1; i++) {
			
			int rdNum = rd.nextInt(45) + 1; // 랜덤 번호 생성
			System.out.println("뽑힌 "+ i + "번째 값은 " + rdNum + "입니다.");
			lotto[i - 1] = rdNum;

			for(int j = 0; j < i - 1; j++) { // 중복값
				if(rdNum == lotto[j]) {
						System.out.println("!! 중복값이 생성되었습니다. " + i +"번째 값을 다시 뽑습니다. !!");
						i--;
				}
				
			}	
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.println("최종적으로 뽑힌 "+ (i+1) + "번째 값은 " + lotto[i] + "입니다.");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("2번 방식 : 비교 후 값 넣기");
		System.out.println();
		System.out.println();
		
		for(int i = 1; i < lotto.length + 1; i++) {
			int rdNum = rd.nextInt(45) + 1; // 랜덤 번호 생성
			
			for(int j = 0; j < i - 1; j++) { // 중복값
				if(rdNum == lotto[j]) {
						System.out.println("!! 중복값이 생성되었습니다. " + (i-1) +"번째 값을 다시 뽑습니다. !!");
						i--;
				} else {
					lotto[i - 1] = rdNum;
				}
				
			}	
			System.out.println("뽑힌 "+ (i) + "번째 값은 " + lotto[i-1] + "입니다.");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("============================");
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.println("최종적으로 뽑힌 "+ (i+1) + "번째 값은 " + lotto[i] + "입니다.");
		}
		
		
	}

}
