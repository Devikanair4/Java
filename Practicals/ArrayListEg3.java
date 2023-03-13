package collection;
import java.util.ArrayList; //import array list
import java.util.Iterator; //import iterator
public class ArrayListEg3 {

	public static void main(String[] args) {
		ArrayList<String> elements = new ArrayList<>(); //defining an array list
		elements.add("orange"); //adding elements to it
		elements.add("banana");
		elements.add("grapes");
		elements.add("apple");
		elements.add("mango");
		
		System.out.println(elements);
		//iterate through the elements of the array list 
		
		Iterator<String> itr = elements.iterator(); //defining an iterator
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.print(s.toUpperCase()+ " "); //prints array elements in upper case
		}
		
		//insert an element into array list at first position
		elements.add(0,"Watermelon");
		System.out.println("\nThe array list after inserting an element at the first position: \n"+elements);
		
		//to retrieve an element from the specified index
		System.out.println("\nThe element at the 4th index is: "+elements.get(4));
		
		//to remove the third element from the array list
		elements.remove(4);
		System.out.println("\nThe array list after removing the third element is: "+elements);
		
		//to search an element in the array list
		if(elements.contains("banana")) { //searching for an element
			elements.remove("banana"); //removing that element
			System.out.println("\nThe searched element is found and removed from the array. \n "+elements);
		}
		else {
			System.out.println("\nNo such element found in the array list"); //if the searched element is not present
		}
		
		//to copy one array list to another
		ArrayList<String> elements2 = new ArrayList<>(); //defining another array list called elements2
		elements2.addAll(elements); //adding all the elements of the first array list into the second one
		System.out.println("\nThe elements of the first array has been added to the second, the second array elements are:"+elements2);
		
		//to compare two array lists
		elements2.remove("Watermelon");
		elements2.remove("orange");
		elements2.remove("banana");
		elements2.remove("grapes");
		
		elements2.add("carrot");		
		elements2.add("tomato");		
		elements2.add("potato");
		
		System.out.println(elements2);
		boolean isEqual = elements.equals(elements2); //comparing the two array lists
        
        // Print the result
        if (isEqual) { 
            System.out.println("\nThe two Array Lists are equal.");
        } else {
            System.out.println("\nThe two ArrayLists are not equal.");
        }
	}

}
