package ru.voothi.javadevblog;

import java.util.Arrays;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        List<String> mList = Arrays.asList("aa1", "cc2", "cc1", "aa2", "bb1");

        mList
                .stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
