package org.example.structuralpatterns.adapter;

import java.util.Iterator;
import java.util.StringTokenizer;

// ------------------------ Class Adapter ----------------------------------------------
// StringTokenizer implements Enumeration
// This example will implement an adapter that will adapt a StringTokenizer (Enumeration)
// as an Iterator
public class StringTokenizerIteratorAdapter extends StringTokenizer implements Iterator<String> {

    public StringTokenizerIteratorAdapter(String str, String delim, boolean returnDelims) {
        super(str, delim, returnDelims);
    }

    public StringTokenizerIteratorAdapter(String str, String delim) {
        super(str, delim);
    }

    public StringTokenizerIteratorAdapter(String str) {
        super(str);
    }

    @Override
    public boolean hasNext() {
        return hasMoreTokens();
    }

    @Override
    public String next() {
        return nextToken();
    }
}
