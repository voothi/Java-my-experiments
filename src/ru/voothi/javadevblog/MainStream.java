package ru.voothi.javadevblog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {

        List<Person> persons =
                Arrays.asList(
                        new Person("Andrew", 20),
                        new Person("Igor", 23),
                        new Person("Ira", 23),
                        new Person("Vitia", 12));

        List<Person> filtered =
                persons
                        .stream()
                        .filter(p -> p.name.startsWith("I"))
                        .collect(Collectors.toList());

        System.out.println(filtered);    // [Igor, Ira]
    }
}
