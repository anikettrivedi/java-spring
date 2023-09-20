package org.example.structuralpatterns.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void testDecorator(){
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(), "Christmas tree with Garland");

        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        assertEquals(tree2.decorate(), "Christmas tree with Garland with Garland with Bubble Lights");
    }

}
