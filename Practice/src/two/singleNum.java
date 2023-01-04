package two;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.*/
public class singleNum {
	public int singleNumber(int[] nums) {
	 HashSet<Integer> set = new HashSet<Integer>(); // unique are stored
	 for (int n : nums) { 
		if (!set.add(n))
			set.remove(n);
	 }
	 Iterator<Integer> it = set.iterator(); // iterating over set
	 return it.next();
    }
}


/* best solution
public int singleNumber(int[] nums) {
int x = 0;
for (int a : nums) {
	x = x ^ nums;
}
return x;
}

another solution

return Arrays.stream(nums).reduce(0,(a, b) -> a ^ b);
*/