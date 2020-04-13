package ru.voothi.javadevblog;

import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .filter(s -> {
                    System.out.println("Фильтр: " + s);
                    return true;
                });
    }
}
