package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedlistEg2 {

	public static void main(String[] args) {
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("potato");
		list2.add("tomato");
		list2.add("carrot");
		list2.add("beetroot");
		list2.add("onion");
		
		System.out.println(list2);
		
		List<String> oldlist2 = new LinkedList<>();
		oldlist2.add("Raddish");
		
		list2.addAll(oldlist2);
		System.out.println(list2);
		
		list2.remove(2);
		System.out.println(list2);
		
		for(String a: list2) {
			System.out.println(a+" ");
		}
		
		System.out.println();
		list2.forEach(a -> System.out.println(a));
		
		Iterator<String> it = list2.iterator();
		//while(it.hasNext()) {
		//	int a = list.iterator().next();
			//	System.out.println(a);
		//}
		System.out.println(list2.size());
		System.out.println("traversal using for loop");
		
		for(int i=0; i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("List Iterator:");
		ListIterator<String> list1=list2.listIterator();
		while (list1.hasNext()) {
			System.out.println(list1.next());
		}
		LinkedList<String> copylist = new LinkedList<>();
		copylist = (LinkedList<String>) list2.clone();
		System.out.println();
	}

		

	}

