package d0114.InfinityArray;

public class InfinityObjectArrayMain {

	public static void main(String[] args) {
		
		InfinityObjectArray i = new InfinityObjectArray();
		
		Boss a = new A();
		Boss b = new B();
		Boss c = new C();
		
		// arr에 값 더하기
		i.addArr(a);
		i.addArr(b);
		i.addArr(c);
		i.addArr(a);
		i.addArr(b);
		i.addArr(c);
		i.addArr(a);
	
		// arr 값 확인
		i.showArr();
		
		// arr에 있는 값들이 Boss 자료형인지 확인하고, 맞다면 Boss 안의 repeat 함수 실행
		i.repeat();
		
		i.getArrLength();
		
	}

}
