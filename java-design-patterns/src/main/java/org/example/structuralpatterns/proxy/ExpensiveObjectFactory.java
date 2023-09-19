package org.example.structuralpatterns.proxy;

public class ExpensiveObjectFactory implements ExpensiveObject{

    private static ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
