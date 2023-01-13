package tenth;

public class MinMaxTripletWoConditions {
//Find maximum and minimum value of a triplet
//without using a conditional statement
public int min(int s1,int s2,int s3) {
	int min = s1;
	min = (min < s2) ? min : s2;
	min = (min < s3) ? min : s3;
	return min;
}
}
