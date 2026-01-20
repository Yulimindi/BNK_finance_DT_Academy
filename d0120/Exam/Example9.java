package d0120.Exam;

class Bus {
	int count;
	
	public boolean rideBus() {
		increase();
		if(this.count == 1) {
			return true;
		} else {
			return false;
		}
	};
	
	void increase() {
		this.count++;
	};
	
}

class newBus extends Bus {
	@Override
	public boolean rideBus() {
		return super.rideBus();
	}
}


public class Example9 {

	public static void main(String[] args) {
		
		newBus b = new newBus();
		
		System.out.println(b.rideBus());
	}

}
