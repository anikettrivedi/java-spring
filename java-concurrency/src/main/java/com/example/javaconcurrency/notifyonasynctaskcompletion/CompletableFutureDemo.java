package com.example.javaconcurrency.notifyonasynctaskcompletion;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {
    public static void main(String[] args) {

        // async completableFutureTask
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            int count = 0;
            while (count <= 10) {
                System.out.printf("%-40s is running for %s seconds %n", Thread.currentThread().getName(), count);
                try {
                    Thread.sleep(1000);
                    count++;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // async thread responsible to monitor status of completableFuture task
        Thread completableFutureListenerThread = new Thread(() -> {
            int count = 0;
            while (!completableFuture.isDone()) {
                System.out.printf("%-40s is waiting for completableFuture to complete for %s seconds%n", Thread.currentThread().getName(), count);
                try {
                    Thread.sleep(1000);
                    count++;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.printf("%-40s has observed that completableFuture had completed in %s seconds%n", Thread.currentThread().getName(), count);
        });
        completableFutureListenerThread.start();

        // main thread execution
        int count = 0;
        while (count <= 15) {
            System.out.printf("%-40s is running for %s seconds %n", Thread.currentThread().getName(), count);
            try {
                Thread.sleep(1000);
                count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}