public class MatrixAdd {

	public static void main(String[] args) {
		//two matrices
		int num1[][]= {{9,8,7},{6,5,4},{3,2,1}};
		int num2[][]= {{3,5,1},{6,2,4},{6,4,1}};
		
		//result matrix to store the sum
		int res[][]=new int[3][3];
		
		for (int i=0; i<3; i++) {
			for(int j=0;j<3;j++) {
				res[i][j]=num1[i][j]+num2[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println(" ");
		}
		}

}
