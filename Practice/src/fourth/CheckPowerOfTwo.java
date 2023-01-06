package fourth;

public class CheckPowerOfTwo {
//	private static boolean poweroftwo(int num) {
//		if(num<=0) {
//			throw new IllegalArgumentException();
//			//System.out.println("natural nos. only");
//		
//		}
//		
//		return ((num&(num-1))==0);
//	}
	private static boolean poweroftwo(int num) { 
	int square = 1;
     while(num >= square){
         if(num == square){
             return true;
         }
         square = square*2; //check all multiple of 2s
     }
     return false;
 }

}
