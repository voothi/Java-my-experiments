package ru.voothi.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList(15);
        Map map = new HashMap<String, String>();

        list.add("Алена");
        list.add("Ирина");
        list.add("Вася");
        list.add("Алина");

        int n = 0;
        int a = 1;
        int b = list.size() - 1;
        int rand = (int) ((Math.random() * (b - a + 1) + a));
        map.put(list.get(n), list.get(rand));
        list.remove(n);
        list.remove(rand - 1);
        System.out.println(list);
        System.out.println(map);
    }
}