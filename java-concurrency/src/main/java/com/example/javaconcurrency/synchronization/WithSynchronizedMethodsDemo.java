package com.example.javaconcurrency.synchronization;

public class WithSynchronizedMethodsDemo {

    public static final int ITERATIONS_PER_THREAD = 1_000_000;
    public static final int THREAD_COUNT = 4;

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();
        Thread[] threads = new Thread[THREAD_COUNT];

        Runnable task = () -> {
            for (int i = 1; i <= ITERATIONS_PER_THREAD; i++) {
                synchronizedCounter.increment();
            }
        };

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i].join();
        }

        System.out.printf(
                "%-20s: expected count = %s, actual count = %s%n",
                Thread.currentThread().getName(),
                ITERATIONS_PER_THREAD * THREAD_COUNT,
                synchronizedCounter.getCount()
        );

        System.out.printf(
                "%-20s: time-taken = %s ms%n",
                Thread.currentThread().getName(),
                System.currentTimeMillis() - startTime
        );
    }

    private static class SynchronizedCounter {
        int count = 0;

        public synchronized void increment() {
            count++;
        }

        public synchronized int getCount() {
            return count;
        }
    }
}


