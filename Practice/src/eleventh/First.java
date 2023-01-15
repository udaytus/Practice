package eleventh;

public class First {
//Write an algorithm to get 0 and 1 with equal probability using a function
//that generates random numbers from 1 to 5 with equal probability.
int random() { //50-50
	int random=(int) Math.random();
	return (random%2);
}
int generate() { // 2 calls to random func and single to AND op
	int x=random();
	int y=random();
	
	return (x&y);
}
}
