package three;

import java.util.regex.Pattern;

public class CheckIfStringisNum {

	private static void StringCheck(String [] s) {
		Pattern pattern = Pattern.compile(".*[^0-9]*.");	//common regex for 

	       for(String check: s){
	           System.out.println(check+ " is number : "+ !pattern.matcher(check).matches());
	       }
	       return;
	}
	private static void check(String string) {
		try{
		Double doub = Double.parseDouble(string);
		System.out.println(doub);
		} catch(NumberFormatException e){
		System.out.println("Contains Alphabets");
		return;
		}


	} 
}
