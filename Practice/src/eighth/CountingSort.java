package eighth;

public class CountingSort {

static void countingsort(int[] input) {
	int frequency[]=new int[input.length+1];
	
	for(int i:input) {
		frequency[i]++;
	}
	int index=0;
	for(int i=0;i<frequency.length;i++) {
		while(0<frequency[i]) {
			input[index++]=i;
			frequency[i]--;
		}
	}
}
}
