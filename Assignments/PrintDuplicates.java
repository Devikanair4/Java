public class PrintDuplicates {
	public static void main(String args[]) { 
		int array[]={2,6,3,8,2,6,4,8,9}; //defining array
		System.out.println("The Duplicate numbers are: "); //print statement
		for (int i=0; i<array.length; i++) { //traversing the array
			for (int j=i+1; j<array.length; j++) { //comapring for duplicates
				if (array[i]==array[j]) {
					System.out.println(array[j]+" "); //printing duplicate numbers
				}
			}
		}
	}

}
