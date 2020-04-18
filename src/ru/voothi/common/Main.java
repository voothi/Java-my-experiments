package ru.voothi.common;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set set = new HashSet();
//
//        int i = 1;
//
//        set.add(i);
//        set.add(i);
//
//        System.out.println(set);

        HashMap<String, String> map = new HashMap<>();

        map.put("k", "v");
        map.put("k", "v1");

        System.out.println(map);
    }
}