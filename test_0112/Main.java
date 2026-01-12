package test_0112;

public class Main {
	
	public static void main(String[] args) {
		Transport b = new Bus();
		Transport t = new Train();
		
		Travel travel = new Travel();
				
		travel.goBusan(b);
		travel.goBusan(t);
	}
	
}
