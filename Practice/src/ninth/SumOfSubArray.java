package ninth;

public class SumOfSubArray {

	public int[][] data;

	public int size() {
	    
	    return data.length;
	}
	public boolean isValidSubsetIndex(int z) {
        
        if (z<0 || z>= size())
        return false;
              
      return true;
  }
	public int sum(int z) {
        int x=0;
        if (isValidSubsetIndex(z)  == true) {
        for (int i = 0; i < data[z].length;i++) {
            for(int j= i; j<i+1; j++)
                    x = x + data[z][j];
                    
            }
        return x;
        }
        return 0;
        
    }
}
