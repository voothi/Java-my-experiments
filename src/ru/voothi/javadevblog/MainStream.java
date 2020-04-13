package ru.voothi.javadevblog;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MainStream {
    public static void main(String[] args) {

        List<Person> persons =
                Arrays.asList(
                        new Person("Andrew", 20),
                        new Person("Igor", 23),
                        new Person("Ira", 23),
                        new Person("Vitia", 12));

        Collector<Person, StringJoiner, String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner(" | "),          // supplier
                        (j, p) -> j.add(p.name.toUpperCase()),  // accumulator
                        (j1, j2) -> j1.merge(j2),               // combiner
                        StringJoiner::toString);                // finisher

        String names = persons
                .stream()
                .collect(personNameCollector);

        System.out.println(names);  // ANDREW | IGOR | IRA | VITIA
    }
}
