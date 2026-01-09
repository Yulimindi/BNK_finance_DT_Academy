package d1018;

import java.util.Random;
import java.util.Scanner;

public class Hangman_Extend {

	String rdWord;
	char correctArr[];
	char showArr[]; // 플레이어가 맞추면서 점점 변경될 배열. 보여주기용임.
	int arrLength;
	char word;
	int count;
	
	public Hangman_Extend() {
		randWord();
		this.correctArr = new char[rdWord.length()];
		this.showArr = new char[rdWord.length()];
		count = 0;
		makeArr();
	}
	
	void randWord() {
		System.out.println("랜덤 문장을 설정하는 중입니다 . . .");
		Random rd = new Random();
		int rn = rd.nextInt(5); 
		
		String[] rdWordArr = {"Believe in yourself", "Live as if you were to die tomorrow", "Life is full of ups and downs", "Past is just past", "Life is not all beer and skittles"};
		rdWord = new String (rdWordArr[rn]);
				
		System.out.println("설정 완료!");
		System.out.println(rdWord);
	}
	
	void makeArr() {
		
		for(int i = 0; i < correctArr.length; i++) { // 단어를 correctArr에 넣기
			correctArr[i] = rdWord.charAt(i);
		}
		
		for(int i = 0; i < correctArr.length; i++) { // correctArr를 '*'로 채우기
			if(showArr[i] == ' ') {
				this.showArr[i] = ' ';
			} else {
				this.showArr[i] = '*';
			}
			
			 
		}
		
	}
	
	void gameStart() {
		System.out.print("당신이 맞출 문장은 : ");
		
		for(int i = 0; i < correctArr.length; i++) {
			if(showArr[i] == ' ') {
				System.out.print("　　");
			} else {
				System.out.print("* ");
			}
			
		}
		System.out.println("입니다.");
		scan();
	}
	
	void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("예상되는 단어의 철자를 하나 입력해주세요 (정답을 맞추시려면 '정답'를 입력해주세요.) : ");
		count++;
		String words = sc.nextLine();
		this.word = words.charAt(0);
		
		if(words.length() == 1) {
			judge();
		} else if(words.equals("정답")) {
			count -= 1;
			challenge();
		} else {
			System.out.println("한글자만 입력해주세요!");
		}
		
		
	}
	
	
	// 한글자 판단
	void judge() {
		for(int i = 0; i < showArr.length; i++) {
			if(showArr[i] == '*') {
				if(word == correctArr[i]) {
					showArr[i] = word;
					System.out.print(showArr[i] + " ");
					
				} else {
					showArr[i] = '*';
					System.out.print(showArr[i] + " ");
				}
			} else {
				System.out.print(showArr[i] + " ");
			}
		}
		System.out.println();
		scan();
	}
	
	void challenge() { // 정답 말하기 도전
		Scanner sc = new Scanner(System.in);
		System.out.println("정답을 외쳐주세요!");
		String correct = sc.nextLine();
		
		if(correct.equals(rdWord)) {
			System.out.println("정답입니다!");
			System.out.println(count + "번만에 맞추셨습니다~");
		} else {
			System.out.println("틀렸다 이 바보야!");
			scan();
		}
	}
	
	
	
	
}
