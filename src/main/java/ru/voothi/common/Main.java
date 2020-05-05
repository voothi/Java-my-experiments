package ru.voothi.common;

import java.util.*;

public class Main {
    public static void changeIt(String value) {
        value = new String("Hello");
        System.out.println(value);
    }

    public static void main(String[] args) {
        String test = new String("test");
        changeIt(test);
        System.out.println(test);
    }
}