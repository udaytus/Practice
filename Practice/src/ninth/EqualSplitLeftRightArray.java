package ninth;

public class EqualSplitLeftRightArray {

	static int findpivot(int arr[]) {
		int Left=0;
		int Right=arr.length-1;
		int lsum=arr[Left];
		int rsum=arr[Right];
		
		while(Left<Right) {
			if(lsum==rsum && Left+2==Right)
				return Left+1;  
			if(lsum<rsum)
				lsum+=arr[Left++];
			else
				rsum+=arr[Right--];
		}
		return -1;
	}
}
