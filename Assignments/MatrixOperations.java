public class MatrixOperations {
    
    public static void main(String[] args) {
        
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix2 = { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} };
        
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;
        
        // Addition of matrices
        
        if (rows1 == rows2 && columns1 == columns2) {
            int[][] sumMatrix = new int[rows1][columns1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("Matrix addition:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    System.out.print(sumMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Matrices cannot be added");
        }
        
        // Multiplication of matrices
        
        if (columns1 == rows2) {
            int[][] productMatrix = new int[rows1][columns2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    int sum = 0;
                    for (int k = 0; k < columns1; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }
                    productMatrix[i][j] = sum;
                }
            }
            System.out.println("Matrix multiplication:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    System.out.print(productMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Matrices cannot be multiplied");
        }
        
    }
    
}
