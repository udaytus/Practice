package first;

import java.util.HashMap;

public class Removingduplicatesusinghashmap {
	public static void main(String[] args) {
		int a[]= {14,11,23,25,2,6,24,11,25,7,23};
		HashMap <Integer,Integer> map= new HashMap<>();
		for(int i:a) {
			if(map.containsKey(i))
				System.out.println(i);

		else { map.put(i, 1);
			
		}
		}	
	}

}