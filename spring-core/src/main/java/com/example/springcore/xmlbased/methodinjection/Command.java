package com.example.springcore.xmlbased.methodinjection;

public class Command {

    public Object commandState;

    public void setState(Object commandState) {
        this.commandState = commandState;
    }

    public Object execute() {
        return new Object();
    }
}
