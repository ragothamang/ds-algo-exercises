package threadsAndConcurrency;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    // Semaphore with 2 permits
    private static Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread worker = new Thread(new Task(i));
            worker.start();
        }
    }

    static class Task implements Runnable {
        private int taskId;

        public Task(int id) {
            this.taskId = id;
        }

        @Override
        public void run() {
            try {
                // Acquire a permit
                System.out.println("Task " + taskId + " is waiting for a permit.");
                semaphore.acquire();
                System.out.println("Task " + taskId + " acquired a permit!");

                // Simulate work
                Thread.sleep(2000);

                // Release the permit
                System.out.println("Task " + taskId + " releasing a permit.");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
