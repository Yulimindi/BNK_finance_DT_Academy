package d0119;

public class LambdaGeneric {

	public static void main(String[] args) {
		
		Calculatable<Integer> add = (Integer a, Integer b) -> a + b;
		System.out.println("더하기 결과 : " + add.Calc(3, 4));
		
		Calculatable<Integer> sub = (Integer a, Integer b) -> a - b;
		System.out.println("빼기 결과 : " + sub.Calc(4, 1));
		
		Calculatable<Integer> mul = (Integer a, Integer b) -> a * b;
		System.out.println("곱하기 결과 : " + mul.Calc(2, 3));
		
		Calculatable<Integer> div = (Integer a, Integer b) -> a / b;
		System.out.println("나누기 결과 : " + div.Calc(5, 1));
		
		Calculatable<String> plus = (String a, String b) -> a + b;
		System.out.println(plus.Calc("나는 ", "미녀 ^_^"));
	}

}
