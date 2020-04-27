package ru.voothi.annimon.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        String[] strings = {"A", "C", "B"};

        final List<String> list = Arrays.stream(strings)
                .filter(s -> !s.equals("A"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
