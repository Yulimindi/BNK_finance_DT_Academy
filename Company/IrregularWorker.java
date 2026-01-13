package Company;

public class IrregularWorker extends Worker implements Calculate_Salary {

	double salary; // 급여
	int time;

	public IrregularWorker(String num, String name, double salary, int time) {
		super(num, name);
		this.time = time;
	}
	// 비정규직은 시급과 근무시간으로 계산해서 급여 지급
	
	public void Calculate() {
		salary = time * salary;
		System.out.println(name + "님의 급여는 " + (int)salary + "원 입니다." );
	}
	
	
}
