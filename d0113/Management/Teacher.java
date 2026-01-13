package d0113.Management;

public class Teacher extends Academy implements Maneuverable {

	String name;
	int wage; // 시급
	int time; // 일한 시간
	
	int cnt;
	
	public Teacher() {
		
	}

	public Teacher (String name, int wage, int time) {
		this.name = name;
		this.wage = wage;
		this.time = time;
	}
	
	void Add(TeacherDB db, Teacher teacher) {
		db.teachers[++cnt] = teacher;
		System.out.println(db.teachers[cnt].name);
	}
	
	
}
