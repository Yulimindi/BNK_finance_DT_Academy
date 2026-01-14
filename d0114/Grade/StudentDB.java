package d0114.Grade;

public class StudentDB {
	Student student;
	Student[] students;
	int count;
	
	public StudentDB() {
		students = new Student[5];
		count = 0;
	}
	
	public void addArr(Student student) {
		students[count] = student;
		this.count++;
	}
	
	void showStudentArr() {
		for(int i = 0; i < count; i++) {
			System.out.print(students[i].sno + " ");
			System.out.print(students[i].name + " ");
			System.out.print(students[i].db[0].name + " ");
			System.out.print(students[i].db[0].score + " ");
			System.out.print(students[i].db[1].name + " ");
			System.out.print(students[i].db[1].score + " ");
			System.out.print(students[i].db[2].name + " ");
			System.out.println(students[i].db[2].score);
		}
	}
	
}
