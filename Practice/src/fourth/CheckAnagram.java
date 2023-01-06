package fourth;

import java.util.Arrays;



public class CheckAnagram {
public static boolean isAnagram(String word,String anagram) {
	if(word.length()==0 && anagram.length()==0   ) {
		return true;
	}
	if (word.length()==0 || anagram.length()==0 ) {
		return false;
	}
	word=word.replaceAll("\\s", "");
	anagram=anagram.replaceAll("\\s", ""); // remove all spaces
	
	word.toLowerCase();
	anagram.toLowerCase();
	char[] charFromWord = word.toCharArray();
    char[] charFromAnagram = anagram.toCharArray();       
    Arrays.sort(charFromWord);
    Arrays.sort(charFromAnagram);
   
    return Arrays.equals(charFromWord, charFromAnagram);
 }
}

