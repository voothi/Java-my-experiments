package ru.voothi.javadevblog;

import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        Stream.of("c1", "c2", "c3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
    }
}
