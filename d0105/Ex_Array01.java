package d0105;

import java.util.Random;

public class Ex_Array01 {

	public static void main(String[] args) {
		
		int[] A = {1, 3, 5, 7, 9};
		int[] B = {2, 4, 6, 8, 10};
		int[] C = new int[10];
		int min = 100;
		
		// 1. A와 B 배열을 C배열에 삽입 후 정렬
		for(int i = 0; i < 5; i++) {
				C[i] = A[i];
		}
		
		for(int i = 5; i < 10; i++) {
			
				C[i] = B[i-5];
			
		}
		
		int k = 0;
		while(k < 10) {
			for(int i = 1; i < 9; i++) {	
				if (C[i-1] > C[i]) {
					min = C[i];
					C[i] = C[i-1];
					C[i-1] = min;
				}
			}
			k++;
		}
		
		// 배열 잘 들어갔나 확인
		for(int i = 0; i < 10; i++) {
			System.out.println(C[i]);
		}
		
		System.out.println("--------------------------");
		
		// 2. 짝수 홀수 이용해서 넣을 때부터 정렬되게 설정
		
		
		// 1번 문제 : C 배열 출력. 1줄로 콤마 나오게
		for(int i = 0; i < 10; i++) {
			if(i == 9) {
				System.out.print(C[i] + "\n\n\n");
			} else {
				System.out.print(C[i] + ", ");
			}
		}
		
		// 2번 문제 : 주사위를 10번 굴려용, 1~6이 각각 몇개 나오는지 집계
		
		System.out.println("===== 굴려 굴려 주사위! =====");
		
		int[] num = new int[6];
		
		
		for(int i = 0; i < 10; i++) {
			Random rd = new Random();
			int rdNum = rd.nextInt(6) + 1;
			if(rdNum == i) {
				num[i-1]++;
			} else if (rdNum == 2) {
				num[1]++;
			} else if (rdNum == 3) {
				num[2]++;
			} else if (rdNum == 4) {
				num[3]++;
			} else if (rdNum == 5) {
				num[4]++;
			} else if (rdNum == 6) {
				num[5]++;
			}
		}
		
		System.out.println("주사위를 모두 굴렸습니다.");
		System.out.print("1 : " + num[0] + "회, ");
		System.out.print("2 : " + num[1] + "회, ");
		System.out.print("3 : " + num[2] + "회, ");
		System.out.print("4 : " + num[3] + "회, ");
		System.out.print("5 : " + num[4] + "회, ");
		System.out.println("6 : " + num[5] + "회");
		
		
		
		
	}

}
