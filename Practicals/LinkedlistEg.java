package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedlistEg {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(34);
		list.add(40);
		list.add(54);
		System.out.println(list);
		
		List<Integer> oldlist = new LinkedList<>();
		oldlist.add(5);
		oldlist.add(10);
		
		list.addAll(oldlist);
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(Integer.valueOf(14));
		System.out.println(list);
		
		int get_value = list.get(1);
		System.out.println(get_value);
		
		list.set(1,42);
		System.out.println(list);
		
		list.addFirst(2);
		System.out.println(list);
		
		for(Integer a: list) {
			System.out.println(a+" ");
		}
		
		System.out.println();
		list.forEach(a -> System.out.println(a));
		
		Iterator<Integer> it = list.iterator();
		//while(it.hasNext()) {
		//	int a = list.iterator().next();
			//	System.out.println(a);
		//}
		list.add(100);
		System.out.println(list.size());
		System.out.println("traversal using for loop");
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("List Iterator:");
		ListIterator<Integer> list1=list.listIterator();
		while (list1.hasNext()) {
			System.out.println(list1.next());
		}
		LinkedList<Integer> copylist = new LinkedList<>();
		copylist = (LinkedList<Integer>) list.clone();
		System.out.println();
	}

}
