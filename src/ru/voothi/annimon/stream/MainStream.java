package ru.voothi.annimon.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        final List<Integer> list = Arrays.asList(1, 2, 11, 12);

        final List<Integer> collect = list.parallelStream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .collect(Collectors.toList());

        System.out.println(collect);

        final int sum = IntStream.range(0, 2)
                .parallel()
                .map(x -> x * 10)
                .sum();

        System.out.println(sum);
    }
}
