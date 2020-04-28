package ru.voothi.annimon.stream;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        IntStream.concat(
                IntStream.range(0, 100000000),
                IntStream.of(-1, -2))
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        Stream.of(120, 410, 85, 32, 314, 12)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

    }
}
