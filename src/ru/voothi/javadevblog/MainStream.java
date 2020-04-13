package ru.voothi.javadevblog;

import java.util.function.Function;

public class MainStream {

    public static Integer compute(Function<Integer, Integer> function, Integer value) {
        return function.apply(value);
    }

    public static void main(String[] args) {

    }

    public static class AwesomeClass {
        private static Integer invert(Integer value) {
            return -value;
        }

        public static Integer invertTheNumber() {
            Integer toInvert = 5;
            Function<Integer, Integer> invertFunction = value -> invert(value);
            return compute(invertFunction, toInvert);
        }

    }
}
