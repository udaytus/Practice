package fourth;

import java.util.HashSet;
import java.util.Set;

public class PrimeFactors {

public static Set<Integer> primefactor(int num) {
	Set<Integer> primefactors= new HashSet<>(); // store unique values we can use arraylist to show all the factors.
	int num1=num;
	for(int i=2;i<=num1;i++) { //start smallest prime
		if(num1%i==0) { //check division
			primefactors.add(i);
			num1/=i;//only divisible by itself
			i--;
			
			}
	}
	return primefactors;
}
}