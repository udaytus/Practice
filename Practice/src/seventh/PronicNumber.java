package seventh;

public class PronicNumber {

public void pronic(int input) {
	boolean isitpronic=false;
	int n1=0,n2=0;
	for(int i=0;i<input;i++) {
		if(i*(i+1)==input) {
			isitpronic=true;
			n1=i;
			n2=i+1;
			break;
		}
	}
	if (isitpronic) 
{
			System.out.println(input+" is a pronic number");
			
			System.out.println(n1+" x "+n2+" = "+input);
			}
					
	System.out.println(input+" is not a pronic number");
	}
}


//private boolean pronic(int input) {
//	int squareroot=(int)Math.sqrt(input);
//	if(squareroot*(squareroot+1)==input) {
//		return true;
//	}
//	return false;
//}
//
//public boolean pronic() {
//	pronic(input)
//}