public class PrintDuplicates {
	public static void main(String args[]) { 
		int array[]={2,6,3,8,2,6,4,8,9};
		System.out.println("The Duplicate numbers are: ");
		for (int i=0; i<array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[i]==array[j]) {
					System.out.println(array[j]+" ");
				}
			}
		}
	}

}