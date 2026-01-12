package Company;

public class IrregularWorker extends Worker implements Calculate_Salary {

	int hour = 10000;
	int time = 200;
	
	public IrregularWorker(String num, String name, double salary) {
		super(num, name, salary);
	}
	// 비정규직은 시급과 근무시간으로 계산해서 급여 지급
	
	public void Calculate() {
		salary = hour * time;
		System.out.println(name + "님의 급여는 " + (int)salary + "원 입니다." );
	}
	
	
}
