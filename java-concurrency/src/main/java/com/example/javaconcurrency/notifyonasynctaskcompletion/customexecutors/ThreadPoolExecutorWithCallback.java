package com.example.javaconcurrency.notifyonasynctaskcompletion.customexecutors;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class ThreadPoolExecutorWithCallback extends ThreadPoolExecutor {

    Consumer<String> callback;

    public ThreadPoolExecutorWithCallback(Consumer<String> callback) {
        super(3, 3, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        this.callback = callback;
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        callback.accept(Thread.currentThread().getName());
    }


}
