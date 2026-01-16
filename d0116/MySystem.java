package d0116;

public class MySystem{
	// Object src: 원본 배열, int srcPos: 원본 배열에서 복사를 시작할 위치의 인덱스
	// Object dest: 대상 배열, int destPos: 대상 배열에서 데이터를 붙여넣기 시작할 위치의 인덱스
	// int length: 원본 배열에서 대상 배열로 복사할 요소의 개수
	public static <T> void arrayCopy(T[] src, int srcPos, T[] dest, int destPos, int length) {
		for(int i = destPos; i < length; i++) {
			dest[i] = src[srcPos];
			srcPos++;
		}
	}
}
