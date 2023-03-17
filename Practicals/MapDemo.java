package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(91, "India");
		map.put(92, "Pak");
		map.put(93, "Sri Lanka");
		map.putIfAbsent(94, "Russia");
		map.put(90,"China");
		
		System.out.println(map);

	}

}
