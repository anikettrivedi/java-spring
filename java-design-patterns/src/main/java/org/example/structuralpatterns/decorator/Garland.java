package org.example.structuralpatterns.decorator;

public class Garland extends TreeDecorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Garland";
    }
}