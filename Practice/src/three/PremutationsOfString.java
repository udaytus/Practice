package three;

public class PremutationsOfString {
	
/*	private static void permutate(String a,String ans) {
		if(a.isEmpty()) {
			System.err.println(ans+" ");
			return;
		}
		for(int i=0; i< a.length();i++) {
			char c=a.charAt(i);
			String rest=a.substring(0, i)+ a.substring(i,1);
			permutate(rest,ans+c);			
		}
		
		
	}*/
	 private static void permutation(String perm, String word) {
	        if (word.isEmpty()) {
	            System.err.println(perm + word);

	        } else {
	            for (int i = 0; i < word.length(); i++) {
	                permutation(perm + word.charAt(i), word.substring(0, i) 
	                                + word.substring(i + 1, word.length()));
	            }
	        }

	    }
	 public static void permutation(String input){
         permutation("", input);
  }
	public static void main(String[] args) {
		String s ="abb";
		permutation(s);
	}
}
