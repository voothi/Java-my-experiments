package ru.voothi.javadevblog;

import java.util.stream.IntStream;

public class MainStream {
    public static void main(String[] args) {
        IntStream.range(1, 4)
                .mapToObj(i -> "с" + i)
                .forEach(System.out::println);
    }
}
