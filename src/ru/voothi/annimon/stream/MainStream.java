package ru.voothi.annimon.stream;

import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 2, 5)
                .takeWhile(x -> x < 3)
                .forEach(System.out::println);

        Stream.of(1, 2, 3, 4, 2, 5)
                .dropWhile(x -> x < 3)
                .forEach(System.out::println);
// 3, 4, 2, 5

    }
}
