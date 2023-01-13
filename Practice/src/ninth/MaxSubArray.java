package ninth;

public class MaxSubArray {
//Kadane Algo
	private static void maxSubArray(int[] input) {
		int localMax = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int index = 0; index < input.length; index++) {
			localMax = localMax + input[index];
		localMax = Math.max(0, localMax);
		maxSum = Math.max(maxSum, localMax);
		}
		System.out.printf("%d",maxSum);
		}
}
