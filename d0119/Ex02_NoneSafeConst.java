package d0119;

interface Animal {
	int DOG = 1;
	int CAT = 2;
}

class Person {
	public static final int MAN = 1;
	public static final int WOMAN = 2;
}

public class Ex02_NoneSafeConst {

	public static void who(int i) {
		switch(i) {
		case Person.MAN:
			System.out.println("남자");
			break;
		case Person.WOMAN:
			System.out.println("여자");
			break;
		}
	}
	
	public static void main(String[] args) {
		who(Person.MAN);
		who(Person.WOMAN);
		who(Animal.DOG);
	}

}
