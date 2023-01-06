package fourth;

public class MergeSort {

private static void mergesort(int []arr,int start, int end) {
	int mid=(start+end)/2;
	if(start<end) {
		mergesort(arr,start,mid);
		mergesort(arr,mid+1,end);
	}
	int i=0,first=start,last=mid+1;
	int []tmp=new int[end-start+1];
	
	while(first<=mid && last<=end) {
		if(arr[first]<arr[last]) {
			tmp[i++]=arr[first++];
		}
		else if(arr[first]>arr[last]) {
			tmp[i++]=arr[last++];
	}
	}
	//	tmp[i++]=(arr[first]<arr[last]) ? arr[first++] : arr[last++];
	
	while(first<=mid) {
		tmp[i++]=arr[first++];
	}
	while(last<=end) {
		tmp[i++]=arr[last++];
	}
	i=0;
	while(start<=end) {
		arr[start++]=tmp[i++];
	}
}
public static void mergersort(int[] input) {
	mergesort(input,0,input.length-1);
}
}
