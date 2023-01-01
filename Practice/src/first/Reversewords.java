package first;

public class Reversewords {
//Write a method that will take a string as an argument. 
	//The method will reverse the position of words and return it.
	
	// revWords("apple banana kiwi") -> "kiwi banana apple"
	  // revWords("I am John Doe")     -> "Doe John am I"
	  // revWords("orange")            -> "orange"
	
	 public String revWords(String str) {
		    StringBuilder reversedWords = new StringBuilder();

		    // split input string by " " space to get each word as String[]
		    String[] words = str.split(" ");

		    // loop over the array from back
		    for(int i = words.length - 1; i >= 0; i--) {
		      // add words to reversedWords with space
		      reversedWords.append(words[i] + " ");
		    }

		    // trim needed to remove last space in the end
		    return reversedWords.toString().trim();
		  }


}
