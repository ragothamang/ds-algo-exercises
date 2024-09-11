package threadsAndConcurrency;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class DataProcessor implements Runnable {
    private final CyclicBarrier barrier;
    private final int id;

    public DataProcessor(CyclicBarrier barrier, int id) {
        this.barrier = barrier;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + id + " is processing part of the data...");
            Thread.sleep((int) (Math.random() * 1000)); // Simulate data processing
            System.out.println("Thread " + id + " finished processing.");

            // Wait for other threads at the barrier
            barrier.await();

            // Once all threads are done, proceed with next stage
            System.out.println("Thread " + id + " starts next stage.");

        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

public class CyclicBarrierExample {
    public static void main(String[] args) {
        // CyclicBarrier with 3 threads and a barrier action to execute once all threads reach the barrier
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("All threads have reached the barrier. Proceeding to the next stage...");
        });

        // Create and start 3 threads
        Thread t1 = new Thread(new DataProcessor(barrier, 1));
        Thread t2 = new Thread(new DataProcessor(barrier, 2));
        Thread t3 = new Thread(new DataProcessor(barrier, 3));

        t1.start();
        t2.start();
        t3.start();
    }
}

