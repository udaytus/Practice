package two;

public class removeDuplicatefromSorted {
	public int removeDuplicates(int[] nums) {
	       int n=nums.length;
	       if (n == 0 || n == 1)//empty or single element
	       return n;
	       int  j = 0;
	       for (int i = 0; i < n-1; i++)
	       if (nums[i] != nums[i+1]) //unless the adjacent element is not duplicate
	       nums[j++] = nums[i];// nums[1]= nums=[0] so on
	       nums[j++] = nums[n-1];//nums[1]=nums[last]
	       return j;
	       }

}
