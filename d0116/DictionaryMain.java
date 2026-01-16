package d0116;

import java.util.Scanner;

public class DictionaryMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Dictionary d = new Dictionary();
		
		while(true) {
			
			System.out.println("\r\n"
					+ "     _____                      ___                                   ___           ___           ___           ___                 \r\n"
					+ "    /  /::\\       ___          /  /\\          ___       ___          /  /\\         /__/\\         /  /\\         /  /\\          ___   \r\n"
					+ "   /  /:/\\:\\     /  /\\        /  /:/         /  /\\     /  /\\        /  /::\\        \\  \\:\\       /  /::\\       /  /::\\        /__/|  \r\n"
					+ "  /  /:/  \\:\\   /  /:/       /  /:/         /  /:/    /  /:/       /  /:/\\:\\        \\  \\:\\     /  /:/\\:\\     /  /:/\\:\\      |  |:|  \r\n"
					+ " /__/:/ \\__\\:| /__/::\\      /  /:/  ___    /  /:/    /__/::\\      /  /:/  \\:\\   _____\\__\\:\\   /  /:/~/::\\   /  /:/~/:/      |  |:|  \r\n"
					+ " \\  \\:\\ /  /:/ \\__\\/\\:\\__  /__/:/  /  /\\  /  /::\\    \\__\\/\\:\\__  /__/:/ \\__\\:\\ /__/::::::::\\ /__/:/ /:/\\:\\ /__/:/ /:/___  __|__|:|  \r\n"
					+ "  \\  \\:\\  /:/     \\  \\:\\/\\ \\  \\:\\ /  /:/ /__/:/\\:\\      \\  \\:\\/\\ \\  \\:\\ /  /:/ \\  \\:\\~~\\~~\\/ \\  \\:\\/:/__\\/ \\  \\:\\/:::::/ /__/::::\\  \r\n"
					+ "   \\  \\:\\/:/       \\__\\::/  \\  \\:\\  /:/  \\__\\/  \\:\\      \\__\\::/  \\  \\:\\  /:/   \\  \\:\\  ~~~   \\  \\::/       \\  \\::/~~~~     ~\\~~\\:\\ \r\n"
					+ "    \\  \\::/        /__/:/    \\  \\:\\/:/        \\  \\:\\     /__/:/    \\  \\:\\/:/     \\  \\:\\        \\  \\:\\        \\  \\:\\           \\  \\:\\\r\n"
					+ "     \\__\\/         \\__\\/      \\  \\::/          \\__\\/     \\__\\/      \\  \\::/       \\  \\:\\        \\  \\:\\        \\  \\:\\           \\__\\/\r\n"
					+ "                               \\__\\/                                 \\__\\/         \\__\\/         \\__\\/         \\__\\/                \r\n"
					+ "");
			
			System.out.println("환영합니다. 무엇을 하시겠습니까?");
			System.out.println("1. 단어 추가 2. 단어 삭제 3. 사전 읽기 4. 게임 5. 종료");
			
			int choose = sc.nextInt();
			sc.nextLine();
			
			if(choose == 1) {
				
				while(true) {
					System.out.println("추가할 단어의 한글을 입력해주세요.");
					String kor = sc.nextLine();
					char k = kor.charAt(0);
					
						if((k >= '가' && k <= '힣')) { 
							System.out.println("추가할 단어의 영어를 입력해주세요.");
							String eng = sc.nextLine();
							char e = eng.charAt(0);
							if((e >= 'a' && e <= 'z') || (e >= 'A' && e <= 'Z')) {
								d.put(kor, eng);
								break;
							} else {
								System.out.println("영어로 입력해주세요.");
							}
							
						} else {
							System.out.println("한글로 입력해주세요.");
						}
					}
	
			} else if(choose == 2) {
				
				System.out.println("어떤 단어를 삭제하시겠습니까?");
				String word = sc.nextLine();
				
				d.delete(word);
			} else if(choose == 3) {
				
				d.get();
				
			} else if(choose == 4) {
				
				System.out.println("원하는 게임의 횟수를 입력해주세요.");
				int num = sc.nextInt();
				d.game(num);
				
			} else if(choose == 5) {
				
				System.out.println("사전을 닫습니다...");
				break;
				
			} else {
				
				System.out.println("유효한 숫자를 입력해주세요.");
				
			}
			
		}
	}

}
