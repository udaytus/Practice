package ninth;

import java.util.Arrays;

public class PairOfDesiredSum {

	public static void findpair(int []input, int target) {
		Arrays.sort(input);
		int left=0,right=input.length-1,count=0;
		
		while(left<right) {
		int	Sum=input[left]+input[right];
		if(Sum==target) {
			count++;
			left++;
			right--;
			System.out.printf("(%d,%d)",input[right],input[left]);
		}
		
		else if(Sum<target) {
			left++;
		}
		right--;
		}
	}
}
