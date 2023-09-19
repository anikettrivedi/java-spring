package org.example.creationalpatterns.builder;

import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void createComputerUsingBuilder(){
        Computer computer = new Computer.ComputerBuilder("1024 GB", "16 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println(computer);
    }

}
