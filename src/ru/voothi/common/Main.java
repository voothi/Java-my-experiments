package ru.voothi.common;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList(15);
        list.add("Алена");
        list.add("Ирина");
        list.add("Вася");
        list.add("Алина");
        int size = list.size();
        int rand = (int) (Math.random() * size);
        System.out.println(list.get(rand));
    }
}