package d0113.Management;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		StudentDB students = new StudentDB();
		TeacherDB teachers = new TeacherDB();
		
		Student s1 = new Student("이유림", "2025-01-01", 500);
		student.Add(students, s1);
		
		Teacher t1 = new Teacher("김단아", 10000, 50);
		teacher.Add(teachers, t1);
		
	}

}
