public class MatrixMultiple {
	public static void main(String args[]) {
		int a1[][]={{1,1,1},{2,2,2},{3,3,3}};
		int a2[][]={{1,1,1},{2,2,2},{3,3,3}};
		
		//create res to store multiple result
		int res[][]=new int[3][3];
		
		//multiplication and printing of a1 and a2
		for(int i=0;i<3;i++){
			for(int j=0; j<3;j++) {
				res[i][j]=0;
				for(int k=0; k<3; k++) {
					res[i][j] +=a1[i][k]*a2[k][j];
				}
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}