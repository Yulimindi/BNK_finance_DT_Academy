package d0115.Box;

public class FruitAndBoxGeneric {

	public static void main(String[] args) {
		
		// 생성자는 클래스 이름과 같으니까 똑같이 다이아몬드 넣기 그리고 들어오길 원하는 타입 적기 (여기선 애플)
		Box2<Apple> aBox = new Box2<Apple>();
		Box2<Orange> oBox = new Box2<Orange>();

		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}

}
