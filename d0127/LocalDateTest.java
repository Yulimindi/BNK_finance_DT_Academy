package d0127;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {
	public static void main(String[] args) {
		
		// 현재 날짜 구하기
		LocalDate date = LocalDate.now();
		
		// 날짜 생성
		LocalDate date1 = LocalDate.of(2025, 12, 29);
		
		// 만난지 며칠 - until() 사용 -> 순서 신경써야 음수가 안 나옴 until 앞에 더 작은 날짜를 써야함
		long betweenDays = date1.until(date, ChronoUnit.DAYS);
		System.out.println("betweenDays : " + betweenDays);
		
		// 만난지 며칠 - ChronoUnit.DAYS.between() 사용 -> 순서 상관 X
		long betweenDays2 = ChronoUnit.DAYS.between(date, date1);
		System.out.println("betweenDays2 : " + betweenDays);
		
		LocalDate birth = LocalDate.of(2002, 10, 16);
		LocalDate now = LocalDate.now();
		
		System.out.println("birth : " + birth);
		System.out.println("now : " + now);
		
		Period age = Period.between(birth, now);
		System.out.println("age(Period) : " + age);
		System.out.println("age(getYears) : " + age.getYears());
		System.out.println("age(getMonths) : " + age.getMonths());
		System.out.println("age(getDays) : " + age.getDays());
		
		System.out.println(now.getYear() - birth.getYear());
		
		// 세계 시간
		Instant start = Instant.now();
		System.out.println("start : " + start);
		
	}
}
