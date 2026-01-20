package d0120.Exam;

import java.util.ArrayList;
import java.util.HashMap;

public class Example56 {

	public static void main(String[] args) {
		
		// 5번
		HashMap<Integer, String> m = new HashMap<>();
		
		m.put(1, "James");
		m.put(2, "Ann");
		m.put(3, "David");
		
		for(int key : m.keySet()) {
			System.out.print("키 : " + key);
			System.out.println(" 값 : " + m.get(key));
		}
		
		// 6번
		ArrayList<Double> arr = new ArrayList<>();
		arr.add(1.1);
		arr.add(2.2);
		arr.add(3.3);
		for(Double d : arr) {
			System.out.println(d + " ");
		}
		
	}

}
