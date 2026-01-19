package d0119;

interface Singable {
	void sing(String song);
}

interface Runnerable {
	void run(String run);
}

interface Jumpable {
	void jump();
}

public class Ex09_OneParamNoReturn {

	public static void main(String[] args) {
		Singable s = (String song) -> System.out.println(song);
		s.sing("울랄랄랄랄랄라~~~~");
		
		Runnerable r = run -> System.out.println(run); // 매개변수가 있으면 매개변수 자리를 따로 표현하지 않아도 되니까 괄호까지 생략 가능!
		r.run("우다다다다다다다다다다!!!!!!!!!!!!!!");
	
		Jumpable j = () -> System.out.println("폴짝!폴짝!폴짝!폴짝!폴짝!폴짝!");
		j.jump();
	}

}
