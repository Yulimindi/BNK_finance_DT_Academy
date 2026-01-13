package Company;

public class IrregularWorker extends Worker implements Calculate_Salary {

<<<<<<< HEAD
	double salary; // 급여
	int time;

	public IrregularWorker(String num, String name, double salary, int time) {
		super(num, name);
		this.time = time;
=======
	int hour = 10000;
	int time = 200;
	
	public IrregularWorker(String num, String name, double salary) {
		super(num, name, salary);
>>>>>>> origin/main
	}
	// 비정규직은 시급과 근무시간으로 계산해서 급여 지급
	
	public void Calculate() {
<<<<<<< HEAD
		salary = time * salary;
=======
		salary = hour * time;
>>>>>>> origin/main
		System.out.println(name + "님의 급여는 " + (int)salary + "원 입니다." );
	}
	
	
}
