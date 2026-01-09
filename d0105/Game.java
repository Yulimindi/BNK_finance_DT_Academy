package d0105;

import java.util.Random;
import java.util.Scanner;


public class Game {
	
	static class countRock {
		int count;
		int lose;
		int win;
		int draw;
		
		countRock() { // 기본 생성자
			count = 0;
			lose = 0;
			win = 0;
			draw = 0;
		}
	}
	
	static class countFind {
		int count;
		
		countFind() { // 기본 생성자
			count = 0;
		}
	}
	
	static void rockStart() {
		System.out.println("===== 가위바위보 게임을 시작합니다. =====");
	}
	
	static void diceStart() {
		System.out.println("===== 주사위 굴리기 게임을 시작합니다. =====");
	}
	
	static void findStart() {
		System.out.println("===== 숫자 찾기 게임을 시작합니다. =====");
	}
	
	static int selectGame() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 원하는 게임을 선택해주세요. (1 = 가위바위보, 2 = 주사위 굴리기, 3 = 숫자 찾기, 4 = 종료) =====");
		int choose = sc.nextInt();
		return choose;
	}
	
	static void rockGame(countRock count) {
		rockStart();
		
		// Count count = new Count();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			Random rd = new Random();
			
			int randNum = rd.nextInt(3) + 1;
			
			System.out.print("원하는 숫자를 입력해주세요 (1: 가위, 2: 바위, 3: 보, 4: 종료) : ");
			int userNum = sc.nextInt();
			
			
			if (userNum == 4) { // 게임 종료
				System.out.println("게임을 종료합니다.\n게임을 총 " + count.count + "번 진행하셨습니다.\n이긴 횟수 : " + count.win + "\n진 횟수 : " + count.lose + "\n비긴 횟수 : " + count.draw);
				break;
			}
			else if (randNum - userNum == 1 || randNum - userNum == -2) { // 컴퓨터 승
				System.out.println("컴퓨터는 " + randNum +", 당신은 " + userNum + " 힝... 졌당");
				count.count++;
				count.lose++;
			}
			else if (randNum - userNum == -1 ||randNum - userNum == 2) { // 플레이어 승
				System.out.println("컴퓨터는 " + randNum +", 당신은 " + userNum + " 와~ 이겼다!");
				count.count++;
				count.win++;
			}
			else if (randNum == userNum) { // 비김
				System.out.println("컴퓨터는 " + randNum +", 당신은 " + userNum + " 앗! 비겼다!");
				count.count++;
				count.draw++;
			}
			else {
				System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	
	
	static void diceGame() {
		diceStart();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		System.out.println("주사위를 굴릴 횟수를 입력해주세요 : ");
		int play = sc.nextInt();
		
		// 무한반복 하니까 게임 횟수 입력 받아서 그만큼 진행하기
		while(i < play) {
			int[] num = new int[6];
			for(int j = 0; j < 10; j++) {
				Random rd = new Random();
				int rdNum = rd.nextInt(6) + 1;
				if(rdNum == 1) {
					num[0]++;
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
		 
			i++;
		}
		System.out.println("게임을 종료합니다.\n게임을 총 " + play + "번 진행하셨습니다.");
	}
	
	static void findGame(countFind count) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int rdNum = rd.nextInt(100) + 1;
		
		int[] arr = new int[100]; // 사이즈 100 배열 선언
		for(int i = 0; i < 100; i++) { // 배열값 입력
			arr[i] = i;
		}
		
		int start = 0;
		int end = arr.length;
		
		while(start <= end) {
			
			System.out.println("1~100 사이 찾을 숫자를 입력해주세요. : ");
			int num = sc.nextInt();
			
			if(0 < num && num < 101) {
				if(num > rdNum) {
					System.out.println("찾는 값은 입력값보다 작습니다!");
					end = num - 1;
					count.count++;
				} else if (num < rdNum) {
					System.out.println("찾는 값은 입력값보다 큽니다!");
					start = num + 1;
					count.count++;
				} else if (num == rdNum) {
					System.out.println("숫자를 찾았습니다!");
					count.count++;
					System.out.println("시도 횟수 : " + count.count);
					break;
				}
			} else {
				System.out.println("숫자를 다시 입력해주세요!");
			}
			
			
		}
		
		
	}
	// ========================================== 메인 함수 ==========================================
	public static void main(String[] args) {
		countRock countR = new countRock();
		countFind countF = new countFind();
		
		
		while(true) {
			int choose = selectGame();
			
			if (choose == 1) {
				rockGame(countR);
			} else if (choose == 2) {
				diceGame();
			} else if (choose == 3) {
				findGame(countF);
			} else if (choose == 4) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("숫자를 다시 입력해주세요!");
			}
			
		}
		
	}

}
