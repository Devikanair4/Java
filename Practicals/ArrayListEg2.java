package collection;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListEg2 {
	public static void main(String args[]) {
		ArrayList colours = new ArrayList(); //object creation
		colours.add("Violet");
		colours.add("Grey");
		colours.add("White");
		colours.add("Black");
		colours.add("Brown");
		
		System.out.println(colours);
		
		colours.remove("White");
		System.out.println(colours);
		System.out.println(colours.isEmpty());
		System.out.println(colours.contains("Black"));
		
		if(colours.contains("Red")) {
			colours.remove("Grey");
			System.out.println(colours);
		}
		else {
			System.out.println("colour not found in our list");
		}
		boolean b = colours.containsAll(colours);
		System.out.println(b);
		System.out.println(colours.equals(colours));
		
		int index = colours.indexOf("Brown");
		System.out.println(index);
		
		Iterator<String> itr = colours.iterator();
		while(itr.hasNext()) {
			String v = itr.next();
			
			System.out.print(v.toUpperCase()+" ");
		}
	} 

}
