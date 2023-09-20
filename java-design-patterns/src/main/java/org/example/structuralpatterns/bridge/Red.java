package org.example.structuralpatterns.bridge;

public class Red implements Color {
    @Override
    public String fill() {
        return "Color is Red";
    }
}