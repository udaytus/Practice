package three;

public class Factorial {
private static void factorial(int a) {
	
	int i,fact=1;
	for(i=1;i<=a;i++){
		fact=fact*i;
		}
     System.out.println("Factorial of "+a+" is: "+fact);
     return;
	}

}


