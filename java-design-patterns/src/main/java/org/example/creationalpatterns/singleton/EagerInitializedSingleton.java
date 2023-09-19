package org.example.creationalpatterns.singleton;

public class EagerInitializedSingleton {

    public static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

}
