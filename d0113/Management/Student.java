package d0113.Management;

public class Student {
	
	String name;
	String RegistrationDate; // 등록 날짜
	int paidMoney; // 지불한 돈
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student (String name, String RegistrationDate, int paidMoney) {
		this.name = name;
		this.RegistrationDate = RegistrationDate;
		this.paidMoney = paidMoney;
	}
	
}