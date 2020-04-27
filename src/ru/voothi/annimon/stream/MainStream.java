package ru.voothi.annimon.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainStream {
    public static void main(String[] args) {
        final Map<String, Integer> map = new HashMap();
        map.put("А", 23);
        map.put("В", 12);
        map.put("Б", 17);
        map.put("Д", 1);
        map.put("Г", 13);

        map.keySet().stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        Arrays.asList("test", "test1").stream()
                .limit(1)
                .filter(s -> s.equals("test"))
                .map(s -> s + '!')
                .sorted()
                .forEach(System.out::println);
    }
}
