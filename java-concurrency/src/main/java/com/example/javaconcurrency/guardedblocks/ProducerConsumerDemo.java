package com.example.javaconcurrency.guardedblocks;

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        Drop drop = new Drop();

        Thread producerThread = new Thread(new Producer(drop));
        producerThread.setName("producerThread");

        Thread consumerThread = new Thread(new Consumer(drop));
        consumerThread.setName("consumerThread");

        producerThread.start();
        consumerThread.start();

    }

}
