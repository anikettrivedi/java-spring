package com.example.javaconcurrency.notifyonasynctaskcompletion.callbacks;

import java.util.function.Consumer;

@FunctionalInterface
public interface CallbackInterface<T> extends Consumer<T> {
}
