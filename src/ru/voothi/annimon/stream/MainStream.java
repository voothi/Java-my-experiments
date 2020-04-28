package ru.voothi.annimon.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        List<Integer> list = Stream.of(1, 2, 3)
                .collect(Collectors.toList());
// list: [1, 2, 3]
        System.out.println(list);

        String s = Stream.of(1, 2, 3)
                .map(String::valueOf)
                .collect(Collectors.joining("-", "<", ">"));
// s: "<1-2-3>"

        System.out.println(s);

        List<String> list1 = Stream.of("a", "b", "c", "d")
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
// list: ["a", "b", "c", "d"]

        System.out.println(list1);

        String[] elements = Stream.of("a", "b", "c", "d")
                .toArray(value -> new String[value]);

    }
}
