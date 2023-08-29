package com.example.javaconcurrency.locks;

public class DeadlockDemo {
    public static void main(String[] args) throws InterruptedException {

        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");

        Thread thread1 = new Thread(() -> alphonse.bow(gaston));
        Thread thread2 = new Thread(() -> gaston.bow(alphonse));

        System.out.printf("%s: the bowing begins%n", Thread.currentThread().getName());

        /*
            thread1: acquires lock over alphonse object and calls alphonse.bow() method and prints Alphonse bows to Gaston
            thread2: acquires lock over gaston   object and calls gaston.bow()   method and prints Gaston bows to Alphonse

            thread1: tries to acquire lock over gaston   object by calling bower.bowBack(this) methods but gets blocked because thread2 holds lock over gaston   object
            thread2: tries to acquire lock over alphonse object by calling bower.bowBack(this) methods but gets blocked because thread2 holds lock over alphonse object
        */

        thread1.start();
        thread2.start();

        System.out.printf("%s: waiting for bowing to end %n", Thread.currentThread().getName());

        thread1.join();
        thread2.join();

        System.out.printf("%s: bowing finally ends%n", Thread.currentThread().getName());
    }


    record Friend(String name) {

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s bows to %s%n", Thread.currentThread().getName(), this.name, bower.name());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s bows back to %s%n", Thread.currentThread().getName(), this.name, bower.name());
        }
    }

}