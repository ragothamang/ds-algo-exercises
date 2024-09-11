package threadsAndConcurrency;
import java.util.concurrent.CountDownLatch;

class Service implements Runnable {
    private final String serviceName;
    private final int timeToStart;
    private final CountDownLatch latch;

    public Service(String serviceName, int timeToStart, CountDownLatch latch) {
        this.serviceName = serviceName;
        this.timeToStart = timeToStart;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println(serviceName + " is starting...");
            Thread.sleep(timeToStart); // Simulate service startup time
            System.out.println(serviceName + " is up!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown(); // Decrease the count on the latch
        }
    }
}

public class CountDownLatchExample {
    public static void main(String[] args) {
        // Latch with a count of 3, because we have 3 services to wait for
        CountDownLatch latch = new CountDownLatch(3);

        // Start three services
        Thread service1 = new Thread(new Service("Service 1", 2000, latch));
        Thread service2 = new Thread(new Service("Service 2", 3000, latch));
        Thread service3 = new Thread(new Service("Service 3", 1000, latch));

        service1.start();
        service2.start();
        service3.start();

        try {
            // Wait until all services are up (latch count reaches 0)
            System.out.println("Waiting for all services to start...");
            latch.await(); // The main thread waits here until the latch count reaches zero
            System.out.println("All services are up, proceeding with the main process.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

