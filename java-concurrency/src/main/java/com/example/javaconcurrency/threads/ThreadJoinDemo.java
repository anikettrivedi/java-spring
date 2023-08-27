package com.example.javaconcurrency.threads;

public class ThreadJoinDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.printf("%-50s is starting%n", Thread.currentThread().getName());

        Thread thread1 = new Thread(()->{
            int count = 0;
            while (count <= 10){
                try {
                    Thread.sleep(1000);
                    count++;
                    System.out.printf("%-10s is running for %s seconds%n", Thread.currentThread().getName(), count);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();

        // main thread will execute this in parallel to thread1
        int count = 0;
        while (count <= 5) {
            try {
                Thread.sleep(1000);
                count++;
                System.out.printf("%-10s is also running in parallel for %s seconds without waiting for %s to complete %n", Thread.currentThread().getName(), count, thread1.getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // main is still not waiting for thread1 to complete
        System.out.printf("%-10s is still running in parallel without waiting for %s to complete %n", Thread.currentThread().getName(), thread1.getName());

        // main will now wait for thread1 to complete
        System.out.printf("%-10s is now waiting for %s to complete %n", Thread.currentThread().getName(), thread1.getName());
        thread1.join();
        System.out.printf("%-10s wait is over %s is completed!!! %n", Thread.currentThread().getName(), thread1.getName());


    }

}
