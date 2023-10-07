package org.example.streamsapi.parallelstreams;

import java.util.List;
import java.util.stream.IntStream;

public class ProcessListInParallelAndWithoutOrder {
    public static void main(String[] args) {

        List<Integer> list = IntStream.rangeClosed(1, 100_000_000).boxed().toList();

        System.out.printf("%n---- processing list in parallel (ordered) ------");
        long startTime = System.currentTimeMillis();
        List<Integer> listOne = list.parallelStream().filter(i -> i % 2 == 0).toList();
        long endTime = System.currentTimeMillis();
        System.out.printf("%n---- time taken to process = %s ms", (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.printf("%n---- processing list in parallel (unordered) ------");
        List<Integer> listTwo = list.parallelStream().unordered().filter(i -> i % 2 == 0).toList();
        endTime = System.currentTimeMillis();
        System.out.printf("%n---- time taken to process = %s ms", (endTime - startTime));

    }
}
