//single array example
package NewPackage;

public class ArrayExample {
	public static void main(String args[]) {
		int myarray[] = new int[4]; // declaration & instantiation
		myarray[0] = 78; // initialization
		myarray[1] = 25;
		myarray[2] = 57;
		myarray[3] = 13;

		// traversing an array
		for (int i = 0; i <= myarray.length; i++) { // length of array
			System.out.println(myarray[i]);
		}
		float num[] = { 4f, 5f, 8f, 6f }; // declaration, instantiation and initialization

		// print num array
		System.out.println("Array Elements: ");

		//for each loop //holds an array element in variable
		for (float j : num) {
			System.out.println(j + ",");
		}
	}

}
