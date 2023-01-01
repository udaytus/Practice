package first;

import java.util.HashMap;
import java.util.Map;

public class sumoftwo {
public int[] sum(int numArr[], int num) {
	int [] sumNumbers =new int[2]; // for two sum
	
	for(int i=0;i < numArr.length;i++) {
		for(int j=i+1; j< numArr.length; j++) {
			if(numArr[i]+numArr[j]==num) {
				sumNumbers[0] = numArr[i];
				sumNumbers[1] = numArr[j];
			}
		}
	}
	return sumNumbers;
}
//best solution
private static int[] twoSum(int[] nums, int target) {
int[] arr = new int[2];
Map<Integer, Integer> map = new HashMap<Integer,Integer>();
 for(int j = 0; j < nums.length; j++) {
    Integer value = map.get(target - nums[j]);
  if(value == null) { /* no match found */
    map.put(nums[j], j);
   }
else {     /* pair found, updating index */
    arr[0] = value;
    arr[1] = j;
    break; //  loop exit
   }
}
   return arr;
}
}
