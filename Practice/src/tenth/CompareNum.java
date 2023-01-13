package tenth;

import java.util.HashMap;
import java.util.Map;

public class CompareNum {
//Determine if two integers are equal
//without using comparison and arithmetic operators
public boolean compare(int x,int y) {
	return(x^y)==0;
}
public static boolean checkForEquality(int x, int y) {
	Map<Integer,Boolean> map= new HashMap<>();
	map.put(x, true);
	
	return map.containsKey(y);
}

}
