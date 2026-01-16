package d0116;

import java.util.ArrayList;
import java.util.HashMap;


public class ExMap {
	
	public static void main(String args[]) {
		
		// 맵 생성
		HashMap<String, Integer> map = new HashMap<>();
		// List<String> array = new ArrayList<>(); List가 부모고 ArrayList가 자식
		
		// 맵 요소 추가
		map.put("사과", 1500);
		map.put("바나나", 2000);
		map.put("오렌지", 300);
		map.put("포도", 4000);
		map.put("포도", 10000);
		
		// 맵 요소 조회
		Integer price = map.get("포도");
		System.out.println("포도(key)의 값(value)은 " + price + "입니다.");
		
		price = map.getOrDefault("키위", 0);
		System.out.println("키위(key)의 값(value)은 " + price + "입니다.");
		
		// 맵의 크기 조회
		System.out.println("맵에 저장된 자료의 개수 : " + map.size());
		
		// 맵이 비어있는지 확인하기
		System.out.println("맵이 비어 있나요? >> " + map.isEmpty());
		
		// 맵 비우기
		// map.clear();
		System.out.println("맵이 비어 있나요? >> " + map.isEmpty());
		
		for(String key : map.keySet()) { // .keySet() : 키만 모아놓은 배열
			System.out.println("키는 " + key + "(이)고 값은 " + map.get(key)  + "입니다.");
		}
		
		System.out.println(map);
	}
}
