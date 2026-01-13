package Company;

public class RegularWorker extends Worker implements Calculate_Salary {
	
<<<<<<< HEAD
	double salary; // 급여
	
	public RegularWorker(String num, String name, double salary) {
		super(num, name);
		this.salary = salary;
=======
	public RegularWorker(String num, String name, double salary) {
		super(num, name, salary);
>>>>>>> origin/main
	}
	// 정규직은 기본급의 10%가 보너스

	public void Calculate() {
		salary = (salary * 0.1) + salary;
		System.out.println(name + "님의 급여는 " + (int)salary + "원 입니다." );
	}
	
}
