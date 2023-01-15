package eleventh;
import java.util.*;
public class Third {
//Generate fair results from a biased coin that prefers one side of the coin 
//over another and returns TAILS with p probability and HEADS with 1-p probability where p != (1-p)
	private static final int HEADS = 1;
	private static final int TAILS = 0;
	public static int generate()
	{
		while (true)
		{
		int first = biased();
	    int second = biased();
	if (first != second) {
		return first;// or return second
			}
	return second;
		}
	}
	
	//Generating Biased Coin
	
	public static int rand(int min, int max) { // generate rand in given range
		if(min>max || (max-min+1>Integer.MAX_VALUE)) {
			throw new IllegalArgumentException("out of bounds");
		}
		return new Random().nextInt(max-min+1)+min; //+1 for inclusive range
	}
	public static int biased(){
		// generate a random number between 0–99, both inclusive
	int r = rand(0, 99);
	// return TAILS if we got a number between [0–79]; otherwise, return HEADS
	return (r <= 79) ? TAILS: HEADS;
	}
}
