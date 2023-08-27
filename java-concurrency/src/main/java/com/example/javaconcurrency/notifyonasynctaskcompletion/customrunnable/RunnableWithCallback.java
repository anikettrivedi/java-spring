package com.example.javaconcurrency.notifyonasynctaskcompletion.customrunnable;

import com.example.javaconcurrency.notifyonasynctaskcompletion.callbacks.CallbackInterface;

import java.util.function.Consumer;

public class RunnableWithCallback implements Runnable{

    private final Runnable task;
    private final CallbackInterface<String> callback;

    public RunnableWithCallback(Runnable task, CallbackInterface<String> callback) {
        this.task = task;
        this.callback = callback;
    }

    @Override
    public void run() {
        task.run();
        callback.accept(Thread.currentThread().getName());
    }
}
