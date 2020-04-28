package ru.voothi.annimon.stream;

import java.util.stream.IntStream;

public class MainStream {
    public static void main(String[] args) {

        System.out.println(
                IntStream.rangeClosed(-3, 6)
                        .count()
        );

    }
}
