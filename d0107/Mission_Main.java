package d0107;


public class Mission_Main {
	
	
	public static void main(String[] args) {
		
		Mission_Bus num10 = new Mission_Bus(10);
		Mission_Bus num20 = new Mission_Bus(20);
		
		Mission_Student sumin = new Mission_Student("이수민", 3, 15000);
		Mission_Student yulim = new Mission_Student("이유림", 6, 1000);
		
		sumin.studentInfo();
		sumin.busIn(num10); // 10번 버스 탐
		sumin.busIn(num10); // 10번 버스 탐
		sumin.busIn(num10); // 10번 버스 탐
		sumin.busIn(num10); // 10번 버스 탐
		sumin.busIn(num10); // 10번 버스 탐
		sumin.busIn(num10); // 10번 버스 탐
		sumin.studentInfo();
		
		System.out.println("==============================");
		
		yulim.studentInfo();
		yulim.busIn(num20); // 20번 버스 탐
		yulim.busIn(num20); // 20번 버스 탐
		yulim.studentInfo();
		
		yulim.poor(sumin);
		
		num10.bus_info();
		num20.bus_info();
		

	}

}
