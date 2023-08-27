package com.example.javaconcurrency.notifyonasynctaskcompletion.customexecutor;

import com.example.javaconcurrency.notifyonasynctaskcompletion.callbacks.CallbackInterface;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorWithCallback extends ThreadPoolExecutor {

    CallbackInterface<String> callback;

    public ThreadPoolExecutorWithCallback(CallbackInterface<String> callback) {
        super(3, 3, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        this.callback = callback;
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        callback.accept(Thread.currentThread().getName());
    }


}
