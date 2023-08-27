package com.example.javaconcurrency.notifyonasynctaskcompletion.customrunnable;

import java.util.function.Consumer;

public class RunnableWithCallback implements Runnable{

    private final Runnable task;
    private final Consumer<String> callback;

    public RunnableWithCallback(Runnable task, Consumer<String> callback) {
        this.task = task;
        this.callback = callback;
    }

    @Override
    public void run() {
        task.run();
        callback.accept(Thread.currentThread().getName());
    }
}
