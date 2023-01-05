package three;

public class FibonacciSeries {

	private static void Fibonacci(int a) {
		if(a==0) {
			System.out.println("Zero");
		}
		int b=0,c=0,d=1;
		for (int i=0;i<=a;i++) {
			b=c;
			c=d;
			d= b+c;
			System.out.println(b + "");
			return;
					
					
		}
	}
	public static void main(String[] args) {
		int a=10;
		Fibonacci(a);
	}
}
