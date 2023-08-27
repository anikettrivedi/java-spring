package com.example.javaconcurrency.notifyonasynctaskcompletion;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class CompletableFutureChainingDemo {
    public static void main(String[] args) {

        // async task to be run
        Runnable task = () -> {
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
        };

        // actions after async task is completed
        Consumer<Void> consumer = result -> System.out.printf("%-40s completableFuture task completed %n", Thread.currentThread().getName());

        // executes task asynchronously, once completed executes calls consumer to notify about task completion
        CompletableFuture
                .runAsync(task)
                .thenAccept(consumer);

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