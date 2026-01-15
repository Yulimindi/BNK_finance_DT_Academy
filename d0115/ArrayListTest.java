package d0115;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		System.out.println("1. 빈 ArrayList 생성 : " + fruits);
		System.out.println("   초기 크기 : " + fruits.size());
		System.out.println("   비어있나요? : " + fruits.isEmpty());
		
		// 요소 추가
		fruits.add("사과"); fruits.add("바나나"); fruits.add("오렌지"); fruits.add("포도");
		
		System.out.println("2. 요소 추가 후 : " + fruits);
		System.out.println("   크기 : " + fruits.size());
		System.out.println("   비어있나요? : " + fruits.isEmpty());
		
		// 특정 위치에 요소 추가
		fruits.add(1, "배");
		System.out.println("3. 요소 추가 후 : " + fruits);
		
		// 특정 위치의 요소의 값 얻기
		System.out.println(fruits.get(fruits.size() - 1));
		
		// 특정 위치의 요소의 값 수정
		fruits.set(3, "메론");
		System.out.println(fruits.get(3));
		
		System.out.println("4. 요소 삭제 전 : " + fruits);
		fruits.remove(4);
		System.out.println("4. 요소 삭제 후 : " + fruits);
		
		System.out.println("5. 요소 삭제 전 : " + fruits);
		fruits.remove("바나나");
		System.out.println("5. 요소 삭제 후 : " + fruits);
		
		// 특정 값 있는지 확인
		boolean tf = fruits.contains("사과");
		System.out.println(fruits.contains("사과"));
		
		if(tf) {
			System.out.println("포함");
		} else {
			System.out.println("미포함");
		}
		
		// 특정 값의 인덱스 확인
		System.out.println(fruits.indexOf("사과")); // 없는거 넣으면 -1 나옴
		
		// 중복 허용 여부 확인, 리스트는 순서가 있는 자료구조다
		fruits.add("사과");
		System.out.println(fruits);
		System.out.println(fruits.indexOf("사과"));
		System.out.println(fruits.lastIndexOf("사과")); // 마지막 사과 확인

		// 리스트 값 출력하기
		for(int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i) + " ");
		}
		
		// 향상된 for문 이용 (순차처리 할 때만 사용)
		for(String f : fruits) {
			System.out.println(f);
		}
		
		
	}

}
