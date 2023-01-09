package seventh;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class OddEvenTwoThreads extends Thread {

    private int[] arr;
    private int index;
    private CyclicBarrier barr;
    
    public OddEvenTwoThreads(int[] arr, int index, CyclicBarrier barr) {
        this.arr = arr;
        this.index = index;
        this.barr = barr;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[index - 1] > arr[index]) {
                int t = arr[index - 1];
                arr[index - 1] = arr[index];
                arr[index] = t;
            }
            try {
                barr.await();
            } catch (InterruptedException | BrokenBarrierException e) {e.printStackTrace();}
            if (index + 1 < arr.length && arr[index] > arr[index + 1]) {
                int t = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = t;
            }
            try {
                barr.await();
            } catch (InterruptedException | BrokenBarrierException e) {e.printStackTrace();}
        }
    }
    public static void sortArr(int[] arr) {
        int threadNum = arr.length/2;
        CyclicBarrier barr = new CyclicBarrier(threadNum);
        ExecutorService exec = Executors.newFixedThreadPool(threadNum);
        Future<?>[] awaits = new Future<?>[threadNum];
        for (int i = 0; i < threadNum; i++) {
            awaits[i] = exec.submit(new OddEvenTwoThreads(arr, 2*i + 1, barr));
        }
        for (int i = 0; i < threadNum; i++) {
            try {
                awaits[i].get();
            } catch (InterruptedException | ExecutionException e) {e.printStackTrace();}
        }
    }
}