package org.example.structuralpatterns.flyweight;

public class Car implements Vehicle{
    private Engine engine;
    private String color;

    public Car(Engine engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public void start() {
        // start engine
    }

    @Override
    public void stop() {
        // stop engine
    }

    @Override
    public String getColor() {
        return color;
    }
}
