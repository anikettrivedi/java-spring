package com.example.javaconcurrency.synchronization;

public class WithoutSynchronizedMethodsDemo {

    public static final int ITERATIONS_PER_THREAD = 2_000;
    public static final int THREAD_COUNT = 4;

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Thread[] threads = new Thread[THREAD_COUNT];

        Runnable task = () -> {
            for (int i = 1; i <= ITERATIONS_PER_THREAD; i++) {
                counter.increment();
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
                counter.getCount()
        );
    }

    private static class Counter {
        int count = 0;

        public void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }
}


