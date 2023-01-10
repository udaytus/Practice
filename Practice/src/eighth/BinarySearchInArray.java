package eighth;

public class BinarySearchInArray {

	
	private static int binarysearch(int arr[],int num) {
		int large_num=arr.length-1;
		int small_num=0;
		
		while(large_num>=small_num) {
			int guess=(large_num+small_num)>>>1; // right shift operator to find
			if(arr[guess]>num) {                  //the rounded mean of two large int.
				large_num=guess-1;             // (int+int)/2 could produce overflow with large int
			}else if(arr[guess]<num) {
				small_num=guess+1;
				}else
					return guess;
		}
		return -1;
	}
	
}
