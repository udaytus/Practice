package tenth;


import java.util.*;


public class MaxSumTriplet {
//Given an array A containing N integers.
//You need to find the maximum sum of triplet ( Ai + Aj + Ak ) 
//such that 0 <= i < j < k < N and Ai < Aj < Ak.
//If no such triplet exist return 0.
	public int maxtriplet(int arr[]) {
		int sum=0,max=0,n=arr.length;

		for(int i=0;i<n-2;i++){
		    for(int j=i+1;j<n-1;j++){
		        if(arr[j]>arr[i]){
		            for(int k=j+1;k<n;k++){
		                if(arr[k]>arr[j]){
		                    sum=arr[i]+arr[j]+arr[k];
		                    max=Math.max(max,sum);
		                }
		            }
		        }
		    }
		}

		return max;
	}
}

