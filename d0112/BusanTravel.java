package d0112;

public class BusanTravel {
	
	public void goBusan(Transport tp) {
		if(tp.getClass().equals(Bus.class)) {
			Bus b = (Bus)tp;
			b.goBus();
		} else if (tp.getClass().equals(Train.class)) {
			Train t = (Train)tp;
			t.goTrain();
		}
	
		// if문에서 tp.go() 둘 다 쓰이니까 걍 얘는 if문을 쓸 필요가 없삼
		tp.go();
	
	}
}

// goBusan이라는 메서드 하나로 문제가 해결되어야함