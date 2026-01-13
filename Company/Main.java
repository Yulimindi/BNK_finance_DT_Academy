package Company;

public class Main {

	public static void main(String[] args) {
		
		Calculate_Salary R1 = new RegularWorker("j01", "이유림", 3000000);
		Calculate_Salary R2 = new RegularWorker("j02", "김단아", 4000000);
		Calculate_Salary R3 = new RegularWorker("j03", "전주현", 5000000);
		Calculate_Salary I1 = new IrregularWorker("b01", "김성민", 12000, 200);
		Calculate_Salary I2 = new IrregularWorker("b02", "송문환", 12000, 200);
		Calculate_Salary I3 = new IrregularWorker("b03", "김재일", 20000, 200);
		
		Calculate_Salary[] cs = new Calculate_Salary[6];
		
		cs[0] = R1;
		cs[1] = R2;
		cs[2] = R3;
		cs[3] = I1;
		cs[4] = I2;
		cs[5] = I3;
		
		for(int i = 0; i < cs.length; i++) {
			cs[i].Calculate();
		}
		
	}

}
