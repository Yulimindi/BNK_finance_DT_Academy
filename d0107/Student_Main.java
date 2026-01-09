package d0107;


public class Student_Main {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		Student st2 = new Student("마준배", 'M');
		Student st3 = new Student("지젱젱", 'F');
		Student st4 = new Student("김성만두", 'M');
		Student st5 = new Student("지윤정", 'F');
		
		Student[] sts = new Student[5];
		
		sts[0] = st1;
		sts[1] = st2;
		sts[2] = st3;
		sts[3] = st4;
		sts[4] = st5;
		
		
		for(int i = 0; i < sts.length; i++) {
			System.out.print("번호 : " + sts[i].number + " ");
			System.out.print("나이 : " + sts[i].getAge() + " ");
			System.out.print("이름 : " + sts[i].getName() + " ");
			if(sts[i].gender == 'M') {
				System.out.println("성별 : 남자 ");
			} else {
				System.out.println("성별 : 여자 ");
			}
		}
		
		System.out.println("\n" + "카운트 : " + Student.cnt);

		st1.infoToString();
		st2.infoToString();
		st3.infoToString();
		st4.infoToString();
		st5.infoToString();
		
		// st2.name = "가나디"; // private라서 에러 발생
		
		// st2.setName("짱준배");
		st2.setGender('M');
		
		System.out.println("==========================");
		
  
		
		st2.getName();
		st2.getGender();
		st2.setAge(-11);
		
		for(int i = 0; i < 5; i++) {
			sts[i].infoToString();
		}
		
	}

}
