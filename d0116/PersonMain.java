package d0116;

import java.util.Arrays;

public class PersonMain {
	
	public static void main(String args[]) {
		
		Person[] persons = new Person[3];
		
		persons[0] = new Person("지젱젱", 20);
		persons[1] = new Person("마준배", 10);
		persons[2] = new Person("김성만두", 30);
		
		Arrays.sort(persons);
		
		for(Person p : persons) {
			System.out.println(p);
		}

	}
	
}
