package eleventh;

public class Second {
//Write an algorithm to get 0 and 1 with equal probability
//using a function that generates random numbers
//from 1 to 5 with equal probability.
int random() {
	return (int) ((Math.random()%5)+1); //equal prob till 5
}
int generate() {
	int r;
	do {
		r=random();
		
	}
	while(r==5);
	return r&1; 
}
}
