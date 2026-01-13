package d0113.Management;

public class StudentDB extends Academy{

	Student[] students;
	
	public StudentDB() {
		students = new Student[100];
		System.out.println("StudentDB 생성");
	}

	
}
