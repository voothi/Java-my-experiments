package ru.voothi.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class MainArray {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        list.add("Ирина");
        list.add("Юлия");
        list.add("Сергей");
        list.add("Алина");
        list.add("Анжела");
        list.add("Василий");
        list.add("Костя");
        list.add("Вячеслав");
        list.add("Ирина Аленина");
        list.add("Арман");
        list.add("Борис");
        list.add("Виталий");
        list.add("Антон");
        list.add("Насиба");

        while (!list.isEmpty()) {
            map.put(list.remove(getRandom(0, list.size() - 1)), list.remove(getRandom(0, list.size() - 1)));
        }
        map.forEach(getStringStringBiConsumer());
    }

    private static BiConsumer<String, String> getStringStringBiConsumer() {
        return new BiConsumer<String, String>() {
            @Override
            public void accept(String k, String v) {
                System.out.println(k + " + " + v);
            }
        };
    }

    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max + 1 - min)) + min;
    }
}