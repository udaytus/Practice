package eleventh;

public class Fourth {
	/*
	Given an integer n, return the number of trailing zeroes in n!.
	Note: Your solution should be in logarithmic time complexity.
	Example :
	n = 5
	n! = 120 
	Number of trailing zeros = 1
	So, return 1
	//Legendre’s Formula
	*/
	public int trailingzeros(int n) {
		int count=0;
		
		for(int i=5;n/i>=1;i*=5) { //5!=120 and only multiple of 5 can have 0
			count+=n/i;
			
		}
		return count;
	}
}
