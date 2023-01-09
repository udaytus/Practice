package seventh;

public class Semaphore {
boolean flag = true;

public synchronized void take() {
	while(!flag) {
		try {
			System.out.println("Not Available");
			wait();
			}
		catch (InterruptedException e) {
	}
}
	flag=false;
	notify();
}
public synchronized void release() {
	while(flag) {
		try {
			System.out.println("Resource Available");
			wait();
		}
		catch(InterruptedException e) {
	}
}
	flag = true;
	notify();
}
}