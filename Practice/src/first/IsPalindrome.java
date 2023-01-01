package first;

public class IsPalindrome {

	static boolean isPalindrome(String s) {
		 int leftPointer = 0;
		 int rightPointer = s.length()-1;
		 
		 if(s.length()==0) {
			 return true;
		 }
		 else
		 while (leftPointer < rightPointer){
		 if(leftPointer != rightPointer) return false;
		 leftPointer++;
		 rightPointer -- ;
		 }
		 return true;
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