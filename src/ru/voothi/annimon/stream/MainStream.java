package ru.voothi.annimon.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        Stream.of(2, 3, 0, 1, 3)
                .flatMapToInt(x -> IntStream.range(0, x))
                .forEach(System.out::println);

    }
}
