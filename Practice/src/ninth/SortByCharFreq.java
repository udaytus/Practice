package ninth;

import java.util.Arrays;

public class SortByCharFreq {
//You are given a string and your task 
//is to sort the string according to the frequency of character 
//and return the final string.
	public static int countFrequency(char[] a, char b) {
		int count = 0;
		for (char i : a){
			if (i == b)
			count++;
		}
		return count;
	}
	public static String sortArray(char[]a, int[]b) {
		int temp=0;
		char tempc;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(b[j]<b[j+1]) {
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
					
					tempc=a[j];
					a[j]=a[j+1];
					a[j+1]=tempc;
				}
			}
		}
		//System.out.println(Arrays.toString(b));
		return Arrays.toString(a);
	}
	
	
	public static void main(String[] args) {
		String ex="Tree";
		int arr[]=new int[ex.length()];
		char[] st=ex.toCharArray();
		for(int i=0;i<st.length;i++) {
			arr[i]=countFrequency(st,st[i]);
		}
		System.out.println(ex);
		System.out.println(sortArray(st,arr));
	}
}
