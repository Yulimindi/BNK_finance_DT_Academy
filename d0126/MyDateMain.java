package d0126;

public class MyDateMain {

	public static void main(String[] args) {
		MyDate m = new MyDate(2020, 3, 30);
		MyDate m2 = new MyDate(2025, 10, 16);
		
		m.addSchedule(m, "두유 산책 가기");
		m.addSchedule(m, "복싱 가기");
		m.findSchedule(2020, 3, 30);
		
		m2.addSchedule(m2, "내 생일");
		m2.findSchedule(2025, 10, 16);
		
		
	}

}
