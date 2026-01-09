package D0109;

public class Infinity_Main2 {
	// 배열의 값 수정, 삭제 하는 기능 : 중간 데이터를 삭제하면 뒤에 데이터들이 하나씩 떙겨져야겠지 배열 크기 줄일 필요는 없음
	public static void main(String[] args) {
		
		InfinityArr2 ia = new InfinityArr2();
		
		int j = 1;

		ia.append(4);
		ia.append(7);
		
		ia.printArr();
		
		System.out.println("=============");
		
		ia.append(5);
		ia.append(4);
		ia.append(7);
		ia.append(5);
		
		ia.printArr();
		
		System.out.println("=============");
		
		ia.update(1, 4); // 1번째를 4로 교체
		
		ia.printArr();
		
		System.out.println("=============");
		
		ia.delete(2); // 2번째 지우기
		
		ia.printArr();
		
		System.out.println("=============");
		
		ia.delete(2); // 2번째 지우기
		
		ia.printArr();
		
		System.out.println("=============");
		
		ia.delete(10); // 2번째 지우기
		
		ia.printArr();
	}
// 자판기를 만들어용 선택하고 돈을 투입하고 결과가 나오고 거스름돈이 나오고
}
