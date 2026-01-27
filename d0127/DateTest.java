package d0127;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTest {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDateTime today2 = LocalDateTime.now();
		System.out.println(today2);
		
		today.getMonth();
		
	}
}


