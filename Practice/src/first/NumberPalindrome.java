package first;

public class NumberPalindrome {

	public boolean palindrome(int num) {
		int j=num;
		int reverseNum=0;
		int remainder;
		
		while(num>0) {
			remainder =num%10;
			// num will become less than 10 expression
			// will return that number
			
			reverseNum = reverseNum*10 + remainder;
			
			num=num/10;
	// when num will become less than 10 will make it 0
		}
		return reverseNum == j;
	}
}
