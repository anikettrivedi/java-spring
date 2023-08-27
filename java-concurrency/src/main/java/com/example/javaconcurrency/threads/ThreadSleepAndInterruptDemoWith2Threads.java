package com.example.javaconcurrency.threads;

public class ThreadSleepAndInterruptDemoWith2Threads {

    public static void main(String[] args) throws InterruptedException {

        System.out.printf("%-50s is starting%n", Thread.currentThread().getName());

        // thread1 will run for 10 seconds if uninterrupted
        Thread thread1 = new Thread(()->{
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

        // thread2 will use thread1.isInterrupted() to check if thread1 was interrupted or not
        Thread thread2 = new Thread(()->{
            while (!thread1.isInterrupted()){
                continue;
            }
            System.out.printf("%-50s just found out that %s was interrupted%n", Thread.currentThread().getName(), thread1.getName());
            System.out.printf("%-50s is finishing up since %n", Thread.currentThread().getName());
        });


        thread1.start();
        thread2.start();

        // main thread wait for some time before interrupting the thread
        Thread.sleep(5000);

        // interrupting the thread
        thread1.interrupt();
    }

}
