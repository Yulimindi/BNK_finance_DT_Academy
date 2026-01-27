package d0127;

public class MyDate {

	// 일주일 뒤 계산 계산 윤달 윤년 계산 : 년 월 일 / 유효한 숫자로 날짜 저장
	private int year;
	private int month;
	private int day;
	private String[] schedule;
	private int count;
	int carMonth;
	int carDay;
	
	// ============= 생성자 ============= 
	public MyDate() {
		schedule = new String[10];
	}
	
	public MyDate(int year, int month, int day) {
		schedule = new String[10];
		
		
		if(year % 4 == 0 && (year % 100 != 0) || (year % 100 != 0)) { // 2월 29일까지
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
					System.out.println(month + "월은 29일까지 있습니다. 날짜 생성에 실패했습니다.");
				} else {
					this.year = year;
					this.month = month;
					this.day = day;
				}
			}
		} else {
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
				if(day >= 28) {
					System.out.println(month + "월은 28일까지 있습니다. 날짜 생성에 실패했습니다.");
				} else {
					this.year = year;
					this.month = month;
					this.day = day;
				}
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
				System.out.println(month + "월은 29일까지 있습니다. 등록에 실패했습니다.");
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
	
	// 날짜 비교
	public void comparison(MyDate my, MyDate date) {
		if(my.getYear() < date.getYear()) {
			System.out.println(my.getYear() + "년 " + my.getMonth() + "월 " + my.getDay() + "일이 " + date.getYear() + "년 " + date.getMonth() + "월 " + date.getDay() +"일보다 더 이른 날짜입니다.");
		} else if (my.getYear() > date.getYear()) {
			System.out.println(date.getYear() + "년 " + date.getMonth() + "월 " + date.getDay() + "일이 " + my.getYear() + "년 " + my.getMonth() + "월 " + my.getDay() +"일보다 더 이른 날짜입니다.");
		} else {
			if(my.getMonth() < date.getMonth()) {
				System.out.println(my.getYear() + "년 " + my.getMonth() + "월 " + my.getDay() + "일이 " + date.getYear() + "년 " + date.getMonth() + "월 " + date.getDay() +"일보다 더 이른 날짜입니다.");
			} else if(my.getMonth() > date.getMonth()) {
				System.out.println(date.getYear() + "년 " + date.getMonth() + "월 " + date.getDay() + "일이 " + my.getYear() + "년 " + my.getMonth() + "월 " + my.getDay() +"일보다 더 이른 날짜입니다.");
			} else {
				if(my.getDay() < date.getDay()) {
					System.out.println(my.getYear() + "년 " + my.getMonth() + "월 " + my.getDay() + "일이 " + date.getYear() + "년 " + date.getMonth() + "월 " + date.getDay() +"일보다 더 이른 날짜입니다.");
				} else if (my.getDay() > date.getDay()) {
					System.out.println(date.getYear() + "년 " + date.getMonth() + "월 " + date.getDay() + "일이 " + my.getYear() + "년 " + my.getMonth() + "월 " + my.getDay() +"일보다 더 이른 날짜입니다.");
				} else {
					System.out.println("같은 날짜입니다.");
				}
			}
		}
	}
	
	// 날짜 더하기
	public void addDate(MyDate my, int addNum) {
		int num;
		int cal;
		int saveaddNum = addNum;
		int saveYear = my.getYear();
		int saveMonth = my.getMonth();
		int saveDay = my.getDay();
		
		while (addNum > 0) {
			
			if((my.getYear() % 4 == 0 && (my.getYear() % 100 != 0)) || (my.getYear() % 4 == 0 && (my.getYear() % 400 == 0))) { // 2월 29일까지
				if(my.getMonth() == 1 || my.getMonth() == 3 || my.getMonth() == 5 || my.getMonth() == 7 || my.getMonth() == 8 || my.getMonth() == 10) {
					num = 31;
					if(my.getDay() + addNum > 31) {
						cal = num - my.getDay();
						addNum = addNum - cal;
						my.setDay(0);
						my.setMonth(my.getMonth() + 1);
					} else {
						my.setDay(addNum + my.getDay());
						
						addNum = 0;
					}
				} else if (my.getMonth() == 4 || my.getMonth() == 6 || my.getMonth() == 9 || my.getMonth() == 11) {
					num = 30;
					if(my.getDay() + addNum > 31) {
						cal = num - my.getDay();
						addNum = addNum - cal;
						my.setDay(0);
						my.setMonth(my.getMonth() + 1);
					} else {
						my.setDay(addNum + my.getDay());
						addNum = 0;
					}
				} else if (my.getMonth() == 2) {
					num = 29;
					if(my.getDay() + addNum > 29) {
						cal = num - my.getDay();
						addNum = addNum - cal;
						my.setDay(0);
						my.setMonth(my.getMonth() + 1);
					} else {
						my.setDay(addNum + my.getDay());
						addNum = 0;
					}
				} else if (my.getMonth() == 12) {
					num = 31;
					if(my.getDay() + addNum > 31) {
						cal = num - my.getDay();
						addNum = addNum - cal;
						my.setDay(0);
						my.setMonth(my.getMonth() - 11);
						my.setYear(my.getYear() + 1);
					} else {
						my.setDay(addNum + my.getDay() - 1);
						addNum = 0;
					}
				}
			} else { // 2월 28일까지
				if(my.getMonth() == 1 || my.getMonth() == 3 || my.getMonth() == 5 || my.getMonth() == 7 || my.getMonth() == 8 || my.getMonth() == 10) {
					num = 31;
					if(my.getDay() + addNum > 31) {
						cal = num - my.getDay();
						addNum = addNum - cal;
						my.setDay(0);
						my.setMonth(my.getMonth() + 1);
					} else {
						my.setDay(addNum + my.getDay());
						
						addNum = 0;
					}
				} else if (my.getMonth() == 4 || my.getMonth() == 6 || my.getMonth() == 9 || my.getMonth() == 11) {
					num = 30;
					if(my.getDay() + addNum > 31) {
						cal = num - my.getDay();
						addNum = addNum - cal;
						my.setDay(0);
						my.setMonth(my.getMonth() + 1);
					} else {
						my.setDay(addNum + my.getDay());
						addNum = 0;
					}
				} else if (my.getMonth() == 2) {
					num = 28;
					if(my.getDay() + addNum > 28) {
						cal = num - my.getDay();
						addNum = addNum - cal;
						my.setDay(0);
						my.setMonth(my.getMonth() + 1);
					} else {
						my.setDay(addNum + my.getDay());
						addNum = 0;
					}
				} else if (my.getMonth() == 12) {
					num = 31;
					if(my.getDay() + addNum > 31) {
						cal = num - my.getDay();
						addNum = addNum - cal;
						my.setDay(0);
						my.setMonth(my.getMonth() - 11);
						my.setYear(my.getYear() + 1);
					} else {
						my.setDay(addNum + my.getDay() - 1);
						addNum = 0;
					}
				}
			}
			
			
		}
		
		System.out.println(saveYear +"년 " + saveMonth + "월 " + saveDay + "일 보다 " + saveaddNum + "일 지난 날은 " + my.getYear() + "년 " + my.getMonth() + "월 " + my.getDay() + "일 입니다.");
		
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
