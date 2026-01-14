package d0113.Management;

public class Main {

	public static void main(String[] args) {
		
		StudentDB students = new StudentDB();
		TeacherDB teachers = new TeacherDB();
		
		Student s1 = new Student("이유림", "2025-01-01", 500);
		students.Add(s1);
		
		Student s2 = new Student("김성민", "2025-01-01", 1500);
		students.Add(s2);
		
		Teacher t1 = new Teacher("김단아", 10000, 50);
		teachers.Add(t1);
		
		Teacher t2 = new Teacher("전주발", 10000, 50);
		teachers.Add(t2);
		
		students.showStudentDB();
		teachers.showTeacherDB();
		
		
	}

}
