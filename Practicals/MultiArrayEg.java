package NewPackage;

public class MultiArrayEg {
	public static void main(String args[]) {
		int arr1[][] = {{9,8,7},{1,2,3},{4,5,6}}; //declaration and initialization
		
		//print
		for(int i=0; i<3;i++) {
			for (int j=0; j<3;j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
