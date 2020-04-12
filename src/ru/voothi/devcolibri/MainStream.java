package ru.voothi.devcolibri;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainStream {
    public static void main(String[] args) {
        /**
         * https://devcolibri.com/java-8-killer-features-%D1%87%D0%B0%D1%81%D1%82%D1%8C-2/
         */
        List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("World");
        strings.add("!");
        strings.add("We love");
        strings.add("Java 8");

        strings
                .stream()
                .sorted()
                .filter(s -> s.startsWith("W"))
                .forEach(System.out::println);
    }
}
