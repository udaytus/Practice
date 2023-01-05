package three;

public class MultipleMatrices {
	private static void multiply(int[][]a ,int [][]b){
		int Arow=a.length;
		int Acolumn=a[0].length;
		int Brow=b[0].length;
		int Bcolumn=b[0].length;
		
		
		if (Acolumn != Brow) {
		      throw new IllegalArgumentException(
		          "column of this matrix is not equal to row "
		              + "of second matrix, cannot multiply");
		    }

		    int[][] product = new int[Arow][Bcolumn];
		    int sum = 0;
		    for (int i = 0; i < Arow; i++) {
		      for (int j = 0; j < Bcolumn; j++) {
		        for (int k = 0; k < Brow; k++) {
		          sum = sum + a[i][k] * b[k][j];
		        }
		        product[i][j] = sum;
		      }
		    }
		    //print in 2d format
		    for(int i=0;i<Arow;i++) {
		    	for(int j=0;j<Bcolumn;j++) {
		    		System.out.println(product[i][j]+" ");
		    	}
		    	System.out.println();
		    }
		    
		  }
	}

