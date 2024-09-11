package threadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            executorService.submit(() -> {
                System.out.println("Executing Task " + taskNumber + " by " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
    }
}
