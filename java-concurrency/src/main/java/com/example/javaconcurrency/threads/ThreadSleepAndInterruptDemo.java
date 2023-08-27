package com.example.javaconcurrency.threads;

public class ThreadSleepAndInterruptDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.printf("%-50s is starting%n", Thread.currentThread().getName());

        Thread thread = new Thread(()->{
            int count = 0;
            while (count < 10){
                System.out.printf("%-50s is running for %s seconds%n", Thread.currentThread().getName(), count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.printf("%-50s is interrupted%n", Thread.currentThread().getName());
                    throw new RuntimeException(e);
                }
                count++;
            }
        });

        thread.start();

        // main thread wait for some time before interrupting the thread
        Thread.sleep(5000);

        // interrupting the thread
        thread.interrupt();
    }

}
