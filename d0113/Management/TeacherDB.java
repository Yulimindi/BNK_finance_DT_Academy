package d0113.Management;

public class TeacherDB {
	
	Teacher teacher = new Teacher();
	Teacher[] teachers;
	int cnt;
	
	public TeacherDB() {
		teachers = new Teacher[10];
		cnt = 0;
	}
	
	void Add(Teacher teacher) {
		teachers[cnt] = teacher;
		this.cnt++;
	}
	
	void modifyTeacherName(int num, String name) {
		teachers[num-1].name = name;
		System.out.println(teachers[num-1].name);
	}
	
	void deleteTeacher(int num) {
		teachers[num-1] = null;
		System.out.println(teachers[num-1].name);
	}
	
	void showTeacherDB() {
		for(int i = 0; i < cnt; i++) {
			System.out.println("강사 이름 : " + teachers[i].name);
			System.out.println("시급 : " + teachers[i].wage);
			System.out.println("일한 시간 : " + teachers[i].time);
			System.out.println("====================");
		}
	}

}
