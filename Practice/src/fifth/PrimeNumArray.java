package fifth;

public class PrimeNumArray {

	private boolean primenum(int num) {
		
		if(num==2||num==3) {
			return true;
		}
		if(num%2==0||num%3==0) {
			return false;
		}
		for(int i=3;i<Math.sqrt(num);i+=2) { 
			if(num%1==0||num%Math.sqrt(num)==0) {
				return false;
			}
		}
		return false;
	}
	int input,k=0;
	int []arr;
	public void primenum() {
		for(int i=2;i<=input;i++) {
			if(primenum(i)) {
				arr[k]=i;
				System.out.println(arr[k]);
				k++;
			}
		}
	}
	}
