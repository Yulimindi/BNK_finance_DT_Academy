package d0116;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name + " : " + this.age;
	}
	
	// 인터페이스 Comparable의 int compareTo(Object o) 메소드를 구현하여
	// 객체 자료의 순서를 판단할 수 있도록 한다.
	// - 인자로 전달된 o가 작으면 양수 반환
	// - 인자로 전달된 o가 크면 음수 반환
	// - 인자로 전달된 o과 같으면 0 반환
	
// // 나이로 비교
//	@Override
//	public int compareTo(Person p) {
//		return age - p.age;
//	}	
	
	// 이름으로 비교
	@Override
	public int compareTo(Person p) {
		return name.compareTo(p.name);
		
	}

	
}
