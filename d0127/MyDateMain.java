package d0127;

public class MyDateMain {

	public static void main(String[] args) {
		
		MyDate m = new MyDate();
		MyDate m2 = new MyDate(2023, 10, 5);
		MyDate m3 = new MyDate(2022, 9, 20);
		
		m3.addSchedule(m2, "두유 산책하기");
		m3.findSchedule(2020, 10, 30);
		
		System.out.println();
		m.comparison(m2, m3);
		m.addDate(m2, 1000);
		
	}

}