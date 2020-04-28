package ru.voothi.annimon.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        Stream.of(2, 1, 8, 1, 3, 2)
                .distinct()
                .forEach(System.out::println);

        IntStream.concat(
                IntStream.range(2, 5),
                IntStream.range(0, 4))
                .distinct()
                .forEach(System.out::println);

    }
}
