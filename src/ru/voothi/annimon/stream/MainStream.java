package ru.voothi.annimon.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        Stream.of(120, 410, 85, 32, 314, 12)
                .skip(2)
                .forEach(System.out::println);

        IntStream.range(0, 10)
                .limit(5)
                .skip(3)
                .forEach(System.out::println);

        IntStream.range(0, 10)
                .skip(5)
                .limit(3)
                .skip(1)
                .forEach(System.out::println);


    }
}
