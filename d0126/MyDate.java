package d0126;

public class MyDate {

	// 일주일 뒤 계산 계산 윤달 윤년 계산 : 년 월 일
	private int year;
	private int month;
	private int day;
	private String[] schedule;
	private int count;
	int carMonth;
	int carDay;
	
	// ============= 생성자 ============= 
	public MyDate(int year, int month, int day) {
		schedule = new String[10];
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if(day >= 32 || day < 0) {
				System.out.println(month + "월은 31일까지 있습니다. 날짜 생성에 실패했습니다.");
			} else {
				this.year = year;
				this.month = month;
				this.day = day;
			}
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day >= 31 || day < 0) {
				System.out.println(month + "월은 30일까지 있습니다. 날짜 생성에 실패했습니다.");
			} else {
				this.year = year;
				this.month = month;
				this.day = day;
			}
		} else if (month == 2 || day < 0) {
			if(day >= 29) {
				System.out.println(month + "월은 30일까지 있습니다. 날짜 생성에 실패했습니다.");
			} else {
				this.year = year;
				this.month = month;
				this.day = day;
			}
		}
	}

	
	// ============= 메서드 =============
	
	// 스케줄 추가
	public void addSchedule(MyDate mydate, String schedule) {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if(day >= 32 && day < 0) {
				System.out.println(month + "월은 31일까지 있습니다. 등록에 실패했습니다.");
			} else {
				this.year = mydate.getYear();
				this.month = mydate.getMonth();
				this.day = mydate.getDay();
				this.schedule[count] = schedule;
				count++;
				System.out.println("[일정 추가]" + mydate.getYear() + "년 " + mydate.getMonth() + "월 " + mydate.getDay() + "일에 " + schedule + " 일정을 추가합니다.");
			}
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day >= 31 && day < 0) {
				System.out.println(month + "월은 30일까지 있습니다. 등록에 실패했습니다.");
			} else {
				this.year = mydate.getYear();
				this.month = mydate.getMonth();
				this.day = mydate.getDay();
				this.schedule[count] = schedule;
				count++;
				System.out.println("[일정 추가]" + mydate.getYear() + "년 " + mydate.getMonth() + "월 " + mydate.getDay() + "일에 " + schedule + " 일정을 추가합니다.");
			}
		} else if (month == 2 || day < 0) {
			if(day >= 29 && day > 0) {
				System.out.println(month + "월은 30일까지 있습니다. 등록에 실패했습니다.");
			} else {
				this.year = mydate.getYear();
				this.month = mydate.getMonth();
				this.day = mydate.getDay();
				this.schedule[count] = schedule;
				count++;
				System.out.println("[일정 추가]" + mydate.getYear() + "년 " + mydate.getMonth() + "월 " + mydate.getDay() + "일에 " + schedule + " 일정을 추가합니다.");
			}
		}
	}
	
	// 스케줄 확인
	public void findSchedule(int year, int month, int day) {
		int cnt = 1;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if(day >= 32 && day < 0) {
				System.out.println(month + "월은 31일까지 있습니다. 검색에 실패했습니다.");
			} else {
				System.out.println(year + "년 " + month + "월 " + day + "일에 등록된 일정입니다.");
				for(int i = 0; i < count; i++) {
					System.out.println(cnt + ". " + schedule[i]);
					cnt++;
				}
			}
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day >= 31 && day < 0) {
				System.out.println(month + "월은 30일까지 있습니다. 검색에 실패했습니다.");
			} else {	
				System.out.println(year + "년 " + month + "월 " + day + "일에 등록된 일정입니다.");
				for(int i = 0; i < count; i++) {
					System.out.println(cnt + ". " + schedule[i]);
					cnt++;
				}
			}
		} else if (month == 2) {
			if(day >= 29 && day < 0) {
				System.out.println(month + "월은 30일까지 있습니다. 검색에 실패했습니다.");
			} else {
				System.out.println(year + "년 " + month + "월 " + day + "일에 등록된 일정입니다.");
				for(int i = 0; i < count; i++) {
					System.out.println(cnt + ". " + schedule[i]);
					cnt++;
				}
			}
		}
	}
	
	
	// ============= 게터 세터 =============
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public void setDay(int day) {
		this.day = day;
	}
	

	
}
