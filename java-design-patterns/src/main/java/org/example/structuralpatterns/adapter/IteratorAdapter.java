package org.example.structuralpatterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

// ------------------------ Object Adapter --------------------------------------
// prior to Java 9, there was no default method to return Enumeration as Iterator
// this example will implement an adapter that will adapt Enumeration as Iterator
public class IteratorAdapter<E> implements Iterator<E> {

    private final Enumeration<E> enumeration;

    public IteratorAdapter(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }
}
