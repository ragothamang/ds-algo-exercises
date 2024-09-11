package threadsAndConcurrency;

import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private double balance;
    private final ReentrantLock lock = new ReentrantLock();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method that is synchronized using ReentrantLock
    public boolean withdraw(double amount) {
        lock.lock();  // Acquire the lock
        try {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
                balance -= amount;
                return true;
            } else {
                System.out.println(Thread.currentThread().getName() + " failed to withdraw due to insufficient balance");
                return false;
            }
        } finally {
            lock.unlock();  // Release the lock
        }
    }

    // Deposit method that is synchronized using ReentrantLock
    public void deposit(double amount) {
        lock.lock();  // Acquire the lock
        try {
            System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
            balance += amount;
        } finally {
            lock.unlock();  // Release the lock
        }
    }

    // Transfer method that involves locking both accounts to ensure a safe transaction
    public static void transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        // Lock the fromAccount and toAccount
        fromAccount.lock.lock();
        try {
            // Withdraw the amount from the source account
            if (fromAccount.withdraw(amount)) {
                // If withdrawal is successful, deposit the amount in the target account
                toAccount.lock.lock();
                try {
                    toAccount.deposit(amount);
                } finally {
                    toAccount.lock.unlock();  // Ensure the target account is unlocked
                }
            }
        } finally {
            fromAccount.lock.unlock();  // Ensure the source account is unlocked
        }
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount(1000);
        BankAccount accountB = new BankAccount(500);

        // Thread to transfer money from account A to account B
        Thread transfer1 = new Thread(() -> {
            BankAccount.transfer(accountA, accountB, 300);
            System.out.println("Transfer from A to B completed.");
        }, "Transfer-1");

        // Thread to transfer money from account B to account A
        Thread transfer2 = new Thread(() -> {
            BankAccount.transfer(accountB, accountA, 200);
            System.out.println("Transfer from B to A completed.");
        }, "Transfer-2");

        // Start both threads to perform concurrent transfers
        transfer1.start();
        transfer2.start();

        try {
            transfer1.join();
            transfer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance in Account A: " + accountA.getBalance());
        System.out.println("Final balance in Account B: " + accountB.getBalance());
    }
}
