package org.example.structuralpatterns.bridge;

public class Blue implements Color {
    @Override
    public String fill() {
        return "Color is Blue";
    }
}