package d0107;

import java.util.Scanner;

public class Ex_Char {

	public static void main(String[] args) {
		
		char c = 'A';
		char d = 66; // B
		char e = '\u0043'; // C, 16진수
		
		char f = '\uAC00';
		char g = '\uB098';
		char h = '\uB514';
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.print(f);System.out.print(g);System.out.println(h);
		
		System.out.println((int)c); // 형변환
		
		System.out.println("char 크기 : " + Character.BYTES + "bytes");
		System.out.println("Int 크기 : " + Integer.BYTES + "bytes");
		System.out.println("char 최대값 : " + (int)Character.MAX_VALUE);
		System.out.println("char 최소값 : " + (int)Character.MIN_VALUE);
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(char i = 65; i <= 90; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println('A' + 'B');
		
		
		char[] arr = {'A', 'P', 'P', 'L', 'E'};
		System.out.println(arr);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input : ");
		int input = sc.nextInt();
		sc.nextLine();
		System.out.println(input);
		
		System.out.print("Input : ");
		String cinput = sc.next();
		sc.nextLine();
		System.out.print(cinput);
		
		System.out.print("Input : ");
		String sinput = sc.nextLine();
		
		System.out.print(sinput);
		
		System.out.print("Input : ");
		String ssinput = sc.nextLine();
		
		System.out.print(ssinput);
		
		
		
	}

}
