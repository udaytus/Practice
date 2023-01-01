package first;

public class SwapwithoutTemp {
	public static void main(String args[]) { 
	int a = 10;
     int b = 20;

     // one way using arithmetic operator e.g. + or -
     // won't work if sum overflows
     System.out.println("One way to swap two numbers without temp variable");
     System.out.printf("Before swap 'a': %d, 'b': %d %n", a, b);
     a = a + b;
     b = a - b; // actually (a + b) - (b), so now b is equal to a
     a = a - b; // (a + b) -(a), now a is equal to b

     System.out.printf("After swapping, 'a': %d, 'b': %d %n", a, b);

     int x = 30;
     int y = 60;

     System.out.printf("Before swap 'x': %d, 'y': %d %n", x, y);
     x = x ^ y;
     y = x ^ y;
     x = x ^ y;

     System.out.printf("After swapping, 'x': %d, 'y': %d %n", x, y);

 }
}