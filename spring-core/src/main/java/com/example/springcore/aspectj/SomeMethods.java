package com.example.springcore.aspectj;

import org.springframework.stereotype.Component;

@Component
public class SomeMethods {

    // these are some joinpoints defined by a pointcuts in AdvicesAndPointcuts.java class

    public void helloWorld(){
        System.out.printf("%s says method helloWorld is being executed %n", SomeMethods.class.getName());
    }

    public String getSomeString(){
        return "SomeString " + System.currentTimeMillis();
    }

    public void throwRuntimeException() throws RuntimeException {
        throw new RuntimeException("not really an exception");
    }

    public String sleepForNSeconds(int n) throws InterruptedException {
        Thread.sleep(n * 1_000);
        return String.format("slept for %s seconds!", n);
    }

}
