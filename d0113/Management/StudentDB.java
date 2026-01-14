package d0113.Management;

public class StudentDB {

	Student student = new Student();
	Student[] students;
	int cnt;
	
	public StudentDB() {
		students = new Student[100];
		cnt = 0;
	}
	
	void Add(Student student) {
		students[cnt] = student;
		this.cnt++;
	}
	
	void modifyStudentName(int num, String name) {
		students[num-1].name = name;
		System.out.println(students[num-1].name);
	}
	
	void deleteStudent(int num) {
		students[num-1] = null;
		System.out.println(students[num-1].name);
	}

	void showStudentDB() {
		for(int i = 0; i < cnt; i++) {
			System.out.println("학생 이름 : " + this.students[i].name);
			System.out.println("결제 일자 : " + this.students[i].RegistrationDate);
			System.out.println("결제한 돈 : " + this.students[i].paidMoney);
			System.out.println("====================");
		}
	}
	
}
