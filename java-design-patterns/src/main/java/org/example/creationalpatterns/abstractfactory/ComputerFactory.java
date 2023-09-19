package org.example.creationalpatterns.abstractfactory;

import org.example.creationalpatterns.factory.Computer;

public class ComputerFactory {

    // todo a better example is needed

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }

}
