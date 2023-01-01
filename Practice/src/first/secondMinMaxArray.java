package first;

public class secondMinMaxArray {

	public static int secMax(int[] arr) {
		int maxIndex=0;
		int max= arr[0];
	//find max first	
		for (int i=0; i<arr.length;i++) {
			if(max <arr[i]) {
				max = arr[i];
				maxIndex =i;
			}
		}
		// assume that second max is smallest
		int secMax =Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			// i not equal to maxIndex to avoid max
			if(i!=maxIndex && secMax < arr[i]) {
				secMax=arr[i];
			}
		}
		return secMax;
	}
	public static int secMin(int[] arr) {
		int minIndex=0;
		int min= arr[0];
	//find min first	
		for (int i=0; i<arr.length;i++) {
			if(min >arr[i]) {
				min = arr[i];
				minIndex =i;
			}
		}
		// assume that second min is maximum
		int secMin =Integer.MAX_VALUE;
		for(int i=0; i<arr.length;i++) {
			// i not equal to minIndex to avoid min
			if(i!=minIndex && secMin > arr[i]) {
				secMin=arr[i];
			}
		}
		return secMin;
}
	 public static void main(String[] args) {
	        System.out.println(secMax(new int[] {4, 781, 8, 99, 103})); 
	        System.out.println(secMax(new int[] {1, 2, 3, 4, 5})); 
	        System.out.println(secMax(new int[] {3, 4})); 

	        System.out.println("------");
	        System.out.println(secMin(new int[] {4, 781, 8, 99, 103}));
	        System.out.println(secMin(new int[] {1, 2, 3, 4, 5})); 
	        System.out.println(secMin(new int[] {3, 4})); 

	     
	        }
}