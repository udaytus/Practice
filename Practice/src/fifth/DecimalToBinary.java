package fifth;

public class DecimalToBinary {
public int[] convert(int input) {
	int[] bi = new int[32];
	int index =0;
	int copyofinput= input;
	while(copyofinput>0) {
		bi[index++]= copyofinput%2;
		copyofinput/=2;
	}
	return bi;
	
}
}
