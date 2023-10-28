package org.example.streamsapi.parallelstreams;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class ParallelStreamsDemo {

    public static void main(String[] args) {

        Set<String> threadNames = IntStream.range(0,1000)
                .mapToObj(index -> Thread.currentThread().getName())
                .collect(TreeSet::new, Collection::add, Collection::addAll);

        System.out.println("\nSequential Stream Thread Names");
        threadNames.forEach(System.out::println);

        threadNames = IntStream.range(0,1000)
                .parallel()
                .mapToObj(index -> Thread.currentThread().getName())
                .collect(TreeSet::new, Collection::add, Collection::addAll);

        System.out.println("\nParallel Stream Thread Names");
        threadNames.forEach(System.out::println);

    }

}
