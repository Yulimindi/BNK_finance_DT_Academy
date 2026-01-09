package d0106;

public class Ex_Class02_Main {

	public static void main(String[] args) {
		
		
		Ex_Class02 stu = new Ex_Class02();
		
		System.out.println(Ex_Class02.sno);
		
		stu.no = 1;
		stu.name = "홍길동";
		stu.gender = 'M';
		
		Ex_Class02 stu2 = new Ex_Class02();
		stu2.no = 2;
		stu2.name = "고길동";
		stu2.gender = 'M';
		
		Ex_Class02 stu3 = new Ex_Class02();
		stu3.no = 3;
		stu3.name = "이유림";
		stu3.gender = 'F';
		
		Ex_Class02 stu4 = new Ex_Class02();
		stu4.no = 4;
		stu4.name = "김단아";
		stu4.gender = 'F';
		
		Ex_Class02 stu5 = new Ex_Class02();
		stu5.no = 5;
		stu5.name = "전주현";
		stu5.gender = 'F';
		
		Ex_Class02[] sts = new Ex_Class02[5];
		
		sts[0] = stu;
		sts[1] = stu2;
		sts[2] = stu3;
		sts[3] = stu4;
		sts[4] = stu5;
		
		// 남자 여자 각각 몇명인지 카운팅, M이면 M이라고 나오지 않고 남자라고 나오게 출력
		int countM = 0;
		int countF = 0;
		
		for(int i = 0; i < sts.length; i++) {
			
			System.out.print("[" + (i+1)+ "] 번호 : " + sts[i].no + "번  ");
			
			System.out.print("이름 : " + sts[i].name + "  ");
			
			if(sts[i].gender == 'M') {
				System.out.print("성별 : 남자  ");
				countM++;
			} else {
				System.out.print("성별 : 여자  ");
				countF++;
			}
			System.out.println();
		}
		
		System.out.println("남자는 총 " + countM + "명, 여자는 총 " + countF + "명입니다.");
		
		for(int i = 0; i < sts.length; i++) {
			sts[i].showStudentInfo();
		}
		
		
		/*
		class Teacher {
			String name;
			int phoneNum;
			char gender;
			Teacher() {
				name = "홍길동";
				phoneNum = 0;
				gender = 'F';
			}
		}
		
		// 배열
		Teacher[] ts = new Teacher[10];
		
		for(int i = 0; i < 10; i++) {
			ts[i] = new Teacher();
			
		}
		
		Scanner sc = new Scanner(System.in);

		System.out.println("당신의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		*/
		

	}

}
