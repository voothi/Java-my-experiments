package ru.voothi.annimon.stream;

import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        Stream.concat(
                Stream.of(1, 2, 3),
                Stream.of(4, 5, 6))
                .forEach(System.out::println);

    }
}
