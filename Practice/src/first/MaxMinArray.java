package first;

public class MaxMinArray {

	public int max(int [] arrNum) {
		int max = arrNum[0];
		
		for(int i=0;i< arrNum.length;i++) {
			
			if(max<arrNum[i]) {
				max= arrNum[i];
			}
		}
		return max;
	}
	public int min(int[] arrNum) {
	    // assume first element of array is the smallest number
	    int min = arrNum[0];

	    // loop over the array and test assumption
	    for(int i = 0; i < arrNum.length; i++) {
	      // if min was not smallest, update it
	      if(min > arrNum[i]) {
	        min = arrNum[i];
	      }
	    }

	    return min;
	  }
}

//public static void getMinMaxByArraysMethods(int[] givenArray){
//
//    //Sum of Array in One Line 
//    long sumofArray =  Arrays.stream(givenArray).sum();
//
//    //get Minimum Value in an array in One Line
//     int minimumValue = Arrays.stream(givenArray).min().getAsInt();
//
//     //Get Maximum Value of an Array in One Line
//     int MaxmumValue =  Arrays.stream(givenArray).max().getAsInt();
//
// }