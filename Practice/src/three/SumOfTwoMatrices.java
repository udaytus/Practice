package three;

public class SumOfTwoMatrices {
private static int[][] add(int[][]a ,int [][]b){
	int row=a.length;
	int columns=a[0].length;
	int [][]sum= new int[row][columns];
	for(int i=0;i<row;i++) {
		for(int j=0;j<=columns;j++) {
			sum[i][j]=a[i][j]+b[i][j];
			}
		}
	return sum;
	}
public static void printMatrix(int[][] matrix) {
    int rows = matrix.length;
    int columns = matrix[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(matrix[i][j] + " ");
      	}
        System.out.println();
    	}
	}
}
