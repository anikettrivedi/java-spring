package com.example.javaconcurrency.notifyonasynctaskcompletion;

import com.example.javaconcurrency.notifyonasynctaskcompletion.customrunnable.RunnableWithCallback;

public class RunnableWithCallbackDemo {

    public static void main(String[] args) {

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

        RunnableWithCallback runnableWithCallback = new RunnableWithCallback(
                task,
                v -> System.out.printf("%-40s completableFuture task completed%n", v)
        );

        Thread threadWithCallBack = new Thread(runnableWithCallback);
        threadWithCallBack.start();


    }

}
