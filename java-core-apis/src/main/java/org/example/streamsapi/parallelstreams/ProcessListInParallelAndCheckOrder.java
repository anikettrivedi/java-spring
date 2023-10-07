package org.example.streamsapi.parallelstreams;

import java.util.List;
import java.util.stream.IntStream;

public class ProcessListInParallelAndCheckOrder {
    public static void main(String[] args) {

        List<Integer> list = IntStream.rangeClosed(1, 100_000_000).boxed().toList();

        System.out.printf("%n---- processing list sequentially ------");
        long startTime = System.currentTimeMillis();
        List<Integer> listOne = list.stream().filter(i -> i % 2 == 0).toList();
        long endTime = System.currentTimeMillis();
        System.out.printf("%n---- time taken to process = %s ms", (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.printf("%n---- processing list in parallel  ------");
        List<Integer> listTwo = list.parallelStream().filter(i -> i % 2 == 0).toList();
        endTime = System.currentTimeMillis();
        System.out.printf("%n---- time taken to process = %s ms", (endTime - startTime));

    }
}
