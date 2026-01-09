package D0109;

public class Infinity_Main {

	public static void main(String[] args) {
		
		InfinityArr ia = new InfinityArr();
		
		int j = 1;

		ia.append(4);
		ia.append(7);
		ia.append(5);
		
		ia.append(4);
		ia.append(7);
		ia.append(5);
		ia.append(1);

		ia.printArr();
	}

}