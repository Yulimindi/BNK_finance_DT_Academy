package d0113.Management;

public class Student extends Academy implements Maneuverable {
	
	String name;
	String RegistrationDate; // 등록 날짜
	int paidMoney; // 지불한 돈
	
	int cnt;

	public Student() {

	}
	
	public Student (String name, String RegistrationDate, int paidMoney) {
		this.name = name;
		this.RegistrationDate = RegistrationDate;
		this.paidMoney = paidMoney;
	}
	
	void Add(StudentDB db, Student student) {
		db.students[++cnt] = student;
		System.out.println(db.students[cnt].name);
	}
	
	
}