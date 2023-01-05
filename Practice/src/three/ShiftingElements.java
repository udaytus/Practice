package three;

import java.util.Arrays;

public class ShiftingElements {
	
	private static int rightshift(int []original, int shift) {
		if(original.length==0) {
			System.out.println("empty array");
		}
		int[] reordered = new int[original.length];
		
		for(int i=0; i<original.length;i++) {
		     reordered[i] = original[(shift+i)%original.length];
		System.out.println(reordered[i]);
		}
		return 0;
		
	}
}	
	
	
	
