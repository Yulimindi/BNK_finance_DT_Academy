package d0112;


class Animal {
	String name = "동물";
	String cry = "엉엉";
	
	public void cry() {
		System.out.println(name + "가 " + cry + " 울어요!");
	}
}

class Tiger extends Animal {
	// String name = "호랑이";
	// String cry = "어흥";
}

class Dog extends Animal {
	
	
}

class Cat extends Animal {
	
}




public class crying {	
	// 호랑이가 있어요 호랑이는 어흥 울어요 강아지는 멍멍 울어요 고양이는 야옹 울어요, 반복문을 이용하여 출력하세요 
	
	public static void main(String[] args) {
		
		Animal a[] = new Animal[3];
		
		a[0] = new Tiger();
		a[1] = new Dog();
		a[2] = new Cat();
		
		a[0].name = "호랑이";
		a[0].cry = "어흥";
		a[1].name = "강아지";
		a[1].cry = "멍멍";
		a[2].name = "고양이";
		a[2].cry = "야옹";
		
		for(int i = 0; i < a.length; i++) {
			a[i].cry();
		}
	}

}
