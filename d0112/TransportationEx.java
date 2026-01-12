package d0112;

public class TransportationEx {

	public static void main(String[] args) {
		Transport b = new Bus();
		Transport t = new Train();
		
		BusanTravel bt = new BusanTravel();
				
		bt.goBusan(b);
		bt.goBusan(t);

	}

}
