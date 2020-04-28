package ru.voothi.annimon.stream;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        DoubleStream.of(0.1, Math.PI)
                .boxed()
                .map(Object::getClass)
                .forEach(System.out::println);

    }
}
