package seventh;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPrinter {

	 Object monitor = new Object();
	    AtomicInteger number = new AtomicInteger(1); //updates integer values automatically
	    

	    public static void main(String[] args) {
	        ThreadPrinter tnp = new ThreadPrinter();
	        Thread t1 = new Thread(tnp.new Printer(1, 3));
	        Thread t2 = new Thread(tnp.new Printer(2, 3));
	        Thread t3 = new Thread(tnp.new Printer(3, 3));

	        t3.start();
	        t1.start();
	        t2.start();
	    }

	    class Printer implements Runnable {

	        int threadId;
	        int numOfThreads;

	        public Printer(int id, int nubOfThreads) {
	            threadId = id;
	            this.numOfThreads = nubOfThreads;
	        }

	        public void run() {
	            print();
	        }

	        private void print() {
	            try {
	                while (true) {
	                    Thread.sleep(1);
	                    synchronized (monitor) {
	                        if (number.get() % numOfThreads != threadId) {
	                            monitor.wait();
	                        } else {
	                            System.out.println("ThreadId [" + threadId
	                                    + "] printing -->"
	                                    + number.getAndIncrement());
	                            monitor.notifyAll();
	                        }
	                    }
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	       }

	   
}
