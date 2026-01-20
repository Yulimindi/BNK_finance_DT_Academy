package d0120.Exam;

enum Gender {
	WOMAN {
		@Override
		void print() {
			System.out.println("여자");
		}
	},
	
	MAN {
		@Override
		void print() {
			System.out.println("남자");
		}
	};
	
	abstract void print();
}

public class Example10 {
	String name;
	Gender gender;
	int age;
}
