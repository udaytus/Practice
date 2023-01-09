package seventh;

public class SprialMatrix {

	void spiral(int [][]arr) {
		int n=arr.length;
		int value = 1;
		int minCol = 0;
		int maxCol = n-1;
		int minRow = 0;
		int maxRow =n-1;
		while (value <= n*n) {
			for(int i=minCol;i<=maxCol;i++) {
				arr[minRow][i]=value;
				value++;
			}
			for(int i=minRow+1;i<=maxRow;i++) {
				arr[i][maxCol]=value;
				value++;
			}
			for(int i=maxCol-1;i>=minCol;i--) {
				arr[maxRow][i]=value;
				value++;
			}
			for(int i =maxRow-1;i>=minRow+1;i--) {
				arr[i][minCol]=value;
				value++;
			}
			minCol++;
			minRow++;
			maxCol--;
			maxRow--;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
	}
}
