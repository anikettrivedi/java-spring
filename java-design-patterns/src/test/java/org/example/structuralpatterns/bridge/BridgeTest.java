package org.example.structuralpatterns.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BridgeTest {

    @Test
    public void testRedSquare(){
        Shape square = new Square(new Red());
        assertEquals(square.draw(), "Square drawn. Color is Red");
    }

    @Test
    public void testRedCircle(){
        Shape square = new Circle(new Red());
        assertEquals(square.draw(), "Circle drawn. Color is Red");
    }

    @Test
    public void testBlueSquare(){
        Shape square = new Square(new Blue());
        assertEquals(square.draw(), "Square drawn. Color is Blue");
    }

    @Test
    public void testBlueCircle(){
        Shape square = new Circle(new Blue());
        assertEquals(square.draw(), "Circle drawn. Color is Blue");
    }

}
