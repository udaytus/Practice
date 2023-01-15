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
	//Best Approach Scan array for Max,2nd Max,3rd Max and return sum
	static int maxTripletSum(int arr[], int n) 
	{ 
//	        Initialize Maximum, second maximum and third 
//	        maximum element
	int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE;
	int maxC = Integer.MIN_VALUE;
	for (int i = 0; i < n; i++) { 
	
//	             Update Maximum, second maximum  
//	             and third maximum element 
	if (arr[i] > maxA)
	{
		maxC = maxB;
		maxB = maxA;
		maxA = arr[i];
		} 
//	      
//	             Update second maximum and third maximum 
//	             element
	else if (arr[i] > maxB)
	{
		maxC = maxB;
		maxB = arr[i];
		} 
	
//	            // Update third maximum element
	else if (arr[i] > maxC)
		maxC = arr[i];
	}
	return (maxA + maxB + maxC);
	} 
}

