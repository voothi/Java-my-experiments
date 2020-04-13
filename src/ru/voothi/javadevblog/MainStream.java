package ru.voothi.javadevblog;

import java.util.function.Function;

public class MainStream {

    public static void main(String[] args) {
        System.out.println(compute(value -> invert(value), 5));
    }

    public static Integer compute(Function<Integer, Integer> function, Integer value) {
        return function.apply(value);
    }

    private static Integer invert(Integer value) {
        return -value;
    }
}
