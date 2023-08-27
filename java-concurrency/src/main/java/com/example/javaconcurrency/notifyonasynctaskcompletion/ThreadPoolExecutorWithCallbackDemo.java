package com.example.javaconcurrency.notifyonasynctaskcompletion;

import com.example.javaconcurrency.notifyonasynctaskcompletion.customexecutors.ThreadPoolExecutorWithCallback;

public class ThreadPoolExecutorWithCallbackDemo {

    public static void main(String[] args) {

        // defining a generic task to be run in parallel using multiple threads
        Runnable task = () -> {
            int count = 0;
            while (count <= 2) {
                System.out.printf("%-40s is running for %s seconds %n", Thread.currentThread().getName(), count);
                try {
                    Thread.sleep(1000);
                    count++;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        // providing callback function implementation for executor to call after tasks are done executing
        ThreadPoolExecutorWithCallback executor = new ThreadPoolExecutorWithCallback(
                v -> System.out.printf("%-40s completableFuture task completed%n", v)
        );

        executor.execute(task);
        executor.execute(task);
        executor.execute(task);
        executor.execute(task);
        executor.execute(task);
        executor.shutdown();


    }

}
