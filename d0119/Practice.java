package d0119;

@FunctionalInterface
interface Checker {
	boolean check(int n);
}

enum Day {
	MONDAY {
		@Override
		void print() {
			System.out.println("월요일은 출근!");
		}
	}, TUESDAY {
		@Override
		void print() {
			System.out.println("화요일은 출근!");
		}
	}, WENDSDAY {
		@Override 
		void print() {
			System.out.println("수요일은 출근!");
		}
	}, THURSDAY {
		@Override
		void print() {
			System.out.println("목요일은 출근!");
		}
	}, FRIDAY {
		@Override
		void print() {
			System.out.println("금요일은 출근!");
		}
	}, SATURDAY {
		@Override
		void print() {
			System.out.println("토요일은 휴식 ♡");
		}
	}, SUNDAY {
		@Override
		void print() {
			System.out.println("일요일은 휴식 ♡");
		}
	};
	
	abstract void print();
	
}

public class Practice {

	public static void main(String[] args) {
		Checker c = n -> n > 3;
		
		System.out.println(c.check(3));
		System.out.println(c.check(5));
		
		Day.MONDAY.print();
		
		

	}

}
