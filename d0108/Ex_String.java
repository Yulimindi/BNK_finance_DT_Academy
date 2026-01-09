package d0108;

public class Ex_String {

	public static void main(String[] args) {
		
		String str1 = "Hello, World!";
		String str2 = "Java Programming";
		String str3 = "     Hello Java     ";
		
		// 1. 문자열의 길이 : length()
		System.out.println("1. length() : " + str1.length());

		// 2. 특정 위치의 문자 반환 : charAt(위치)
		System.out.println("2. charAt() : " + str1.charAt(7));
		
		// 3. 부분 문자열 추출 : substring()
		System.out.println("3. substring(7) : " + str1.substring(7)); // 7부터 끝까지
		System.out.println("4. substring(7, 12) : " + str1.substring(7, 12)); // 7부터 11까지
		
		// 4. 문자(열)의 첫번째 위치 찾기 : indexOf()
		System.out.println("5. indexOf(o) : " + str1.indexOf('o'));
		System.out.println("6. indexOf(\"World\") : " + str1.indexOf("World"));
		
		// 5. 문자(열)의 마지막 위치 찾기 : lastIndexOf() 
		System.out.println("7. lastIndexOf('o') : " + str1.lastIndexOf('o'));
		// System.out.println("8. lastIndexOf(\"World\") : " + str1.lastIndexOf("World"));
		
		// 6. 대소문자 변환 : toUpperCase(), toLowerCase();
		System.out.println("8. toUpperCase(): " + str1.toUpperCase());
		System.out.println("9. toLowerCase(): " + str1.toLowerCase());
		
		// 7. 앞뒤 공백 제거 : trim()
		System.out.println("10. trim() : " + str3.trim());
		
		// 8. 문자/문자열 치환 : replace()
		System.out.println("11. replace('l', 'L') : " + str1.replace('l', 'L'));
		System.out.println("12. replace(\"World\", \"Java\") : " + str1.replace("World", "Java"));
		System.out.println(str1);
		
		// 9. 문자열 분할 : split()
		String[] words = str1.split(", ");
		System.out.println("13. split(\",\") : ");
		for(String i : words) { // 향상된 for문 words의 0부터 끝까지 다~ 도는겨
			System.out.println("   - " + i);
		}
		
		// 10. 문자열 비교 : equals()
		String s1 = "abc";
		String s2 = "abc"; // 이러면 "abc"라는 문자열은 같은 주소에 저장됨 새로운 주소로 저장하고 싶으면 new String("abc") 하면 됨 왜냐면 new는 메모리를 새로 생성하는거니까
		
		System.out.println("같나요? " + (s1 == s2)); // 주소 비교
		System.out.println("같나요? " + s1.equals(s2));
		
		// 11. 접두사/접미사 확인 : startsWith() / endsWith()
		System.out.println("14. startsWith(\"Hello\") : " + str1.startsWith("Hello"));
		System.out.println("14. startsWith(\"ing\") : " + str2.endsWith("ing"));
		
		// 12. 부분 문자열 포함 : contains()
		System.out.println("16. contains(\"World\") : " + str1.contains("World"));
		
		// 13. 문자열 비교 (대소문자 구분 없이) : equalsIgnoreCase()
		String s4 = "Hello, world!";
		System.out.println("17. equals(s4) : " + str1.equals(s4));
		System.out.println("18. equalsIgnoreCase(s4) : " + str1.equalsIgnoreCase(s4));
		
		// 14. 문자열의 사전적 순서 비교 : compareTo() -> 얘는 문자열 비교할 때 사용해도 됨 equals처럼!
		String s5 = "abc";
		String s6 = "abc";
		System.out.println("19. compareTo(\"Hello\") : " + s6.compareTo(s5)); // s6 기준으로 s5를 비교 했는데 1이 나오면 s6가 s5보다 뒤에 있다
		
		// 15. 문자열 연결 : concat()
		System.out.println("21. concat(\" Welcome\") : " + s5.concat(" Welcome"));
		
		// 16. 다른 타입을 문자열로 변환 : valueOf()
		int num = 123;
		double d = 12.35;
		System.out.println("22. valueOf(int) : " + String.valueOf(num));
		System.out.println("22. valueOf(double) : " + String.valueOf(d));
		
		// 17. 형식화된 문자열 : format()
		String formatted = String.format("이름 : %s, 나이 : %d, 키 : %.1f", "홍길동", 25, 175.3);
		System.out.println("24. format() : " + formatted);
		
	}

}
