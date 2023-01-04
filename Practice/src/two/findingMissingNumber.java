package two;

public class findingMissingNumber {
	public int missingNumber(int[] nums) {
        int a=nums.length;
        int sum= ((a+1)*a)/2;   // n(n+1)/2 formula

        for(int i=0;i<a;i++){
            sum=sum-nums[i]; // substract the total of given array length n from sum of array length=n+1
        }
        return sum;
    }
}
 /*
  * best solution 
  * public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
    
    
   Bit Manipulation 
 * Intuition
 * We can harness the fact that XOR is its own inverse to find the missing element in linear time.
 * Algorithm
 * Because we know that nums contains n numbers and that 
 * it is missing exactly one number on the range [0..n−1], 
 * we know that n definitely replaces the missing number in nums. 
 * Therefore, if we initialize an integer to n and XOR it with every index and value, 
 * we will be left with the missing number.
  */