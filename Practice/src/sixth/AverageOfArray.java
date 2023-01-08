package sixth;

public class AverageOfArray {
public float average(int[] arr) {
	float sum=0f;
	for(int num:arr) {
		sum=sum+num;
	}
	return sum/arr.length;
}
//public static void main(String[] args) {
//	int arr[]= {1, 2, 3, 4, 5};
//	AverageOfArray averageOfArray = new AverageOfArray();
//	System.out.println(averageOfArray.average(arr));
//}
}
