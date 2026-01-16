package d0116;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {

	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	
	HashMap<String, String> map = new HashMap<>();
	
	int score;
	String[] arr;
	String[] arr2;

	void put(String kor, String eng) {
		System.out.println("입력하신 단어를 사전에 추가합니다...");
			map.put(kor, eng);
		
	}
	
	void get() {
		int j = 1;
		System.out.println("[ 한영 사전 ]");
		for(String s : map.keySet()) {
			System.out.println(j + ". " + s + " : " + map.get(s));
			j++;
		}
		System.out.println();
	}
	
	void game(int game) {
		System.out.println("게임을 시작합니다!");
		
		int i = 0;
		int w = 0;
		
		arr = new String[map.size()];
		arr2 = new String[map.size()];
		
		for(String s : map.keySet()) {
			arr[i] = s;
			i++;
		}
		
		for(String s : map.keySet()) {
			arr2[w] = map.get(s);
			w++;
		}
		
		for(int j = 0; j < game; j++) {
			int a = rd.nextInt(arr.length);
			System.out.print(arr[a] + "(은)는 영어로? ");
			String answer = sc.nextLine();
			if(answer.equals(arr2[a])) {
				System.out.println("정답입니다!");
				score++;
			} else {
				System.out.println("오답입니다 우우 정답은 " + arr2[a] + "입니다~");
			}
		}
		
		System.out.println("총 " + game + "문제 중에 " + score + "문제 맞추셨습니다!");
		if(score < 3) {
			System.out.println("공부 좀 하셔야겠어요 ㅋㅋ");
		} else {
			System.out.println("공부 열심히 하셨나봐용 최고~");
		}
		
	}
	
	void isEmpty() {
		System.out.printf("맵이 비어있나용? %s\n", map.isEmpty() ? "넹" : "아뇽");
	}
	
	void delete(String name) {
		if(map.containsKey(name)) {
			map.remove(name);
			System.out.println("성공적으로 삭제되었습니다!");
		} else {
			System.out.println("입력하신 단어는 없는 단어입니다.");
		}
	}
}
