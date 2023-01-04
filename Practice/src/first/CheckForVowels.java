package first;

public class CheckForVowels {

	public static boolean Vowels(String s) {
		if(s==null)
			return true;
		else
		return s.toLowerCase().matches("[aeiou]");
	}

}
