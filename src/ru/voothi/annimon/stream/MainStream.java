package ru.voothi.annimon.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        Map<Integer, List<String>> map1 = Stream.of(
                "ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.groupingBy(String::length));
        map1.entrySet().forEach(System.out::println);
// 1=[c, l]
// 2=[ab, gh]
// 3=[def, ijk]
// 4=[mnop]

        Map<Integer, String> map2 = Stream.of(
                "ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                String::toUpperCase,
                                Collectors.joining())
                ));
        map2.entrySet().forEach(System.out::println);
// 1=CL
// 2=ABGH
// 3=DEFIJK
// 4=MNOP

        Map<Integer, List<String>> map3 = Stream.of(
                "ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.groupingBy(
                        String::length,
                        LinkedHashMap::new,
                        Collectors.mapping(
                                String::toUpperCase,
                                Collectors.toList())
                ));
        map3.entrySet().forEach(System.out::println);
// 2=[AB, GH]
// 1=[C, L]
// 3=[DEF, IJK]
// 4=[MNOP]

    }
}
