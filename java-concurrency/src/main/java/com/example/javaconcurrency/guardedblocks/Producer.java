package com.example.javaconcurrency.guardedblocks;

import java.util.Random;

public class Producer implements Runnable {
    private final Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        String[] importantInfo = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        Random random = new Random();

        for (String s : importantInfo) {
            drop.put(s);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException ignored) {}
        }

        drop.put("DONE");
    }
}
