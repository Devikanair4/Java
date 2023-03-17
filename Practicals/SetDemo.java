package collection;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(25);
		set.add(32);
		set.add(48);
		
		System.out.println(set);
		
	}

}
