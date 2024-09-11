package threadsAndConcurrency;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.HashMap;
import java.util.Map;

class ConfigurationManager {
    private final Map<String, String> config = new HashMap<>(); // Shared configuration map
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
    private final ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

    // Method to read a configuration value
    public String getConfigValue(String key) {
        readLock.lock();  // Acquire the read lock
        try {
            System.out.println(Thread.currentThread().getName() + " is reading the configuration for key: " + key);
            return config.get(key);
        } finally {
            readLock.unlock();  // Release the read lock
        }
    }

    // Method to update a configuration value
    public void setConfigValue(String key, String value) {
        writeLock.lock();  // Acquire the write lock
        try {
            System.out.println(Thread.currentThread().getName() + " is updating the configuration for key: " + key + " to " + value);
            config.put(key, value);
        } finally {
            writeLock.unlock();  // Release the write lock
        }
    }
}

public class ReadWriteLockExample {
    public static void main(String[] args) {
        ConfigurationManager configManager = new ConfigurationManager();

        // Writer thread to update the configuration
        Thread writer = new Thread(() -> {
            configManager.setConfigValue("timeout", "30");
            configManager.setConfigValue("maxConnections", "100");
        }, "Writer");

        // Multiple reader threads to read the configuration concurrently
        Thread reader1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " reads: timeout = " + configManager.getConfigValue("timeout"));
        }, "Reader 1");

        Thread reader2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " reads: maxConnections = " + configManager.getConfigValue("maxConnections"));
        }, "Reader 2");

        Thread reader3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " reads: timeout = " + configManager.getConfigValue("timeout"));
        }, "Reader 3");

        // Start writer thread and readers
        writer.start();
        try {
            // Ensure the writer starts and finishes first
            writer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Now start the reader threads concurrently
        reader1.start();
        reader2.start();
        reader3.start();
    }
}

