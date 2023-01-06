package fourth;

import java.util.Arrays;

public class BubbleSort {
public void bubblesort(int [] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=arr.length-1;j>i;j--){ 
			swap(arr,j,j-1);
		}
	}
	System.out.printf("Sorted Array using Bubble sort algorithm :%s %n",
            Arrays.toString(arr));
}
public static void swap(int []array,int from , int to) {
	int temp=array[from];
	array[from]=array[to];
	array[to]=temp;
 	}
}
