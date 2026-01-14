package d0114.Grade;

public class Student {
	int sno; // 번호
	String name; // 이름
	SubjectDB[] db;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sno, String name, int kor, int eng, int math) {
		this.sno = sno;
		this.name = name;
		
		db = new SubjectDB[3];
		
		db[0] = new SubjectDB("국어", kor);
		db[1] = new SubjectDB("영어", eng);
		db[2] = new SubjectDB("수학", math);
	}
	
}
