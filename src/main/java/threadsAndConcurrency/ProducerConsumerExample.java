package threadsAndConcurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.LinkedList;
import java.util.Queue;

class BoundedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;  // Buffer capacity
    private final Lock lock = new ReentrantLock(); // Lock for synchronization
    private final Condition notFull = lock.newCondition(); // Condition to wait if buffer is full
    private final Condition notEmpty = lock.newCondition(); // Condition to wait if buffer is empty

    // Producer adds an item to the buffer
    public void put(int item) throws InterruptedException {
        lock.lock(); // Acquire the lock
        try {
            // Wait if the buffer is full
            while (buffer.size() == capacity) {
                System.out.println("Buffer is full. Producer is waiting...");
                notFull.await();
            }
            buffer.add(item); // Add item to the buffer
            System.out.println("Produced: " + item);
            notEmpty.signal(); // Signal the consumer that buffer is not empty
        } finally {
            lock.unlock(); // Release the lock
        }
    }

    // Consumer removes an item from the buffer
    public int take() throws InterruptedException {
        lock.lock(); // Acquire the lock
        try {
            // Wait if the buffer is empty
            while (buffer.isEmpty()) {
                System.out.println("Buffer is empty. Consumer is waiting...");
                notEmpty.await();
            }
            int item = buffer.remove(); // Remove item from the buffer
            System.out.println("Consumed: " + item);
            notFull.signal(); // Signal the producer that buffer is not full
            return item;
        } finally {
            lock.unlock(); // Release the lock
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer();

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.put(i);
                    Thread.sleep(50); // Simulate time taken to produce an item
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.take();
                    Thread.sleep(1000); // Simulate time taken to consume an item
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start both threads
        producer.start();
        consumer.start();
    }
}
