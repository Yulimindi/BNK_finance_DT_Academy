package d0114.Grade;

public class Main {

	public static void main(String[] args) {
		// 학생은 5명 학생들의 성적표를 출력하는 프로그램 (과목별 점수, 평균 점수 등 나오게)
		StudentDB stdb = new StudentDB();
		Grade g = new Grade();
		
		Student s1 = new Student(1, "마준배", 90, 80, 100);
		Student s2 = new Student(2, "지젱젱", 80, 80, 100);

		stdb.addArr(s1);
		stdb.addArr(s2);
		
		stdb.showStudentArr();
		
		g.sum(stdb, s1);
		g.average(stdb, s1);
		
		g.sum(stdb, s2);
		g.average(stdb, s2);
		
	}

}

