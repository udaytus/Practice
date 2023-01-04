package first;

public class IsPalindrome {

	static boolean isPalindrome(String s) {
		for(int i=0;i<s.length()/2;i++) {
	        if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
	            return false;
	        }
	    }   
	    return true;
	}

public static void main(String[] args) {
	String f = "9civic9";
	System.out.println(isPalindrome(f));
}
}
//public static boolean isPalindromeNaive(String s){
//StringBuilder sb = new StringBuilder(s);
//StringBuilder sbReverse = sb.reverse();
//if (s.equals(String.valueOf(sbReverse))){
  //  return true;
//}
//return false;
//}