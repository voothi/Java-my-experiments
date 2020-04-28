package ru.voothi.annimon.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        Optional<Integer> result = Stream.<Integer>empty()
                .reduce(Integer::sum);
        System.out.println(result.isPresent());

        Optional<Integer> sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(Integer::sum);
        System.out.println(sum.get());
// 15
    }
}
