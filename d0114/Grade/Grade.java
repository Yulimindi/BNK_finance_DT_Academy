package d0114.Grade;

public class Grade {

	void sum(StudentDB db, Student student) {
		int average = (db.students[student.sno-1].db[0].score + db.students[student.sno-1].db[1].score + db.students[student.sno-1].db[2].score)/3; 
		System.out.println(db.students[student.sno-1].name + "님의 평균 점수는 " + average + "입니다.");
	}
	
	void average(StudentDB db, Student student) {
		int sum = (db.students[student.sno-1].db[0].score + db.students[student.sno-1].db[1].score + db.students[student.sno-1].db[2].score); 
		System.out.println(db.students[student.sno-1].name + "님 점수의 총합은 " + sum + "입니다.");
	}
}
