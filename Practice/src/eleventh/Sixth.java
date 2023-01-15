package eleventh;

import java.util.ArrayList;

public class Sixth {
	/* Fizzbuzz
	Given a positive integer A, return an array of strings with all the integers from 1 to N.
	But for multiples of 3 the array should have “Fizz” instead of the number.
	For the multiples of 5, the array should have “Buzz” instead of the number.
	For numbers which are multiple of 3 and 5 both, the array should have “FizzBuzz” instead of the number.
	Look at the example for more details.
	Example
	A = 5
	Return: [1 2 Fizz 4 Buzz] */
public ArrayList<String> fizzbuzz(int num){
	ArrayList<String> s = new ArrayList<>();
	for (int i = 1; i <= num; i++) 
	{
		if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 3 & 5?
	
		s.add("Fizzbuzz");
	else if ((i % 3) == 0) // Is it a multiple of 3?
		s.add("Fizz");
	else if ((i % 5) == 0) // Is it a multiple of 5?
		s.add("buzz");
	else
		s.add(Integer.toString(i));// Not a multiple of 3 or 5
		
		
	}
	return s;
}
}