package d0119;

enum Animal2 {
	DOG, CAT
}

//enum Person2 { // enum의 생성자는 자동으로 생성 
//	MAN{
//
//		@Override
//		String message() {
//			// TODO Auto-generated method stub
//			return "MAN";
//		}
//
//	},
//	
//	WOMAN{
//		
//		@Override
//		String message() {
//			// TODO Auto-generated method stub
//			return "WOMAN";
//		}
//
//	};
//
//	abstract String message(); // 추상 메서드
//	
//	private Person2() { // 해당 생성자는 enum의 필드 개수에 따라 달라짐 각 필드마다 생성 하는 것!
//		System.out.println("Person2 생성자");
//	}
//	
//	@Override
//	public String toString() {
//		return message();
//	}
//}

enum Person2{
	
	MAN("MAN 입니댕") {
		
		@Override
		void go() {
			System.out.println("군대");
		}
		
	}, 
	
	WOMAN("WOMAN 입니댕") {
		
		@Override
		void go() {
			System.out.println("대학");
		}
		
	}; // 얘 자체가 생성자가 되는 느낌
	
	String message;
	
	Person2(String s) { // 이 형식에 맞게 위에 필드가 작 성됨
		this.message = s;
	}
	
	abstract void go();
	
	@Override
	public String toString() {
		return this.message;
	}
	
}

public class Ex03_SafeConst {

	public static void who(Person2 p) {
		System.out.println(p.toString());
		p.go();
	}
	
	public static void main(String[] args) {
		
		who(Person2.WOMAN);

//		who(Animal2.CAT);
		
//		System.out.println(Person2.WOMAN.equals("WOMAN")); // false
//		System.out.println(Person2.WOMAN);
//		System.out.println(Person2.WOMAN.toString());
//		System.out.println(Person2.MAN != Person2.WOMAN);
//		System.out.println(Person2.MAN == Person2.WOMAN);
//		
//		System.out.println(Person2.MAN.message());
//		Person2.MAN.toString();

	}

}
