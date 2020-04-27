package ru.voothi.annimon.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        Stream.iterate(1, x -> x * 2)
                .limit(6)
                .forEach(System.out::println);


    }
}
