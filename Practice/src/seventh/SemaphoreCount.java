package seventh;

public class SemaphoreCount {
int signal;
int bound;
 public SemaphoreCount(final int bound) {
	 this.bound=bound;
	 this.signal=0;
	 
 }
 public synchronized void take() {
	 while(signal == bound) {
		 try {
			 System.out.println("Resource not available");
			 wait();
			 
		 }
		 catch(InterruptedException e) {
	 }
 }
	 signal++;
	 notifyAll();
}

 public synchronized void release() {
	 while(signal==0) {
		 System.out.println("There is nothing to release");
	 try {
		 wait();
		 
	 }
	 catch(InterruptedException e) {
		 
	 }
	 }
	 signal--;
	 notifyAll();
}
} 