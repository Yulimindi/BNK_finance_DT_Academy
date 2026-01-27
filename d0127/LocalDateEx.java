package d0127;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		
		LocalDate d0 = LocalDate.now();
		LocalDate d1 = LocalDate.of(2024, 2, 23);
		LocalDate d2 = LocalDate.of(2026, 01, 27);
		LocalDate d3 = LocalDate.parse("2025-12-11");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println("=====================");
		
		System.out.println(d1.getYear()); // 년
		System.out.println(d1.getMonth()); // 월
		System.out.println(d1.getMonthValue()); // 월(숫자)
		System.out.println(d3.getDayOfMonth()); // 날짜 (월 기준)
		System.out.println(d1.getDayOfWeek()); // 요일
		System.out.println(d3.getDayOfYear()); // 날짜 (년 기준)
		System.out.println(d1.lengthOfMonth()); // 그 달의 길이 인듯? 31
		System.out.println(d1.lengthOfYear()); // 년의 길이
		System.out.println(d1.isLeapYear()); // 윤년 여부 (boolean)
		
		System.out.println("=====================");
		
		System.out.println("[Plus]");
		System.out.println(d2.plusDays(1));
		System.out.println(d2.plusWeeks(1));
		System.out.println(d2.plusMonths(1));
		System.out.println(d2.plusYears(1));
		
		System.out.println();
		System.out.println("[Minus]");
		System.out.println(d2.minusDays(1));
		System.out.println(d2.minusWeeks(1));
		System.out.println(d2.minusMonths(1));
		System.out.println(d2.minusYears(1));
		
		System.out.println();
		System.out.println("[Today]");
		System.out.println(d2);
		
		System.out.println();
		System.out.println(d2.isBefore(d1));
		System.out.println(d2.isAfter(d1));
		System.out.println(d2.isEqual(d1));
		System.out.println(d2.compareTo(d1));
		System.out.println(d1.compareTo(d2));
		
	}

}
