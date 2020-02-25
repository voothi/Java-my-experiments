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

        list.add("Ирина Аветисян");
        list.add("Алена Кондратенко");
        list.add("Сергей Зеленцов");
        list.add("Алина Коновалова");
        list.add("Анжела Близнюк");
        list.add("Василий Носов");
        list.add("Костя Емельянов");
        list.add("Денис Новиков");
        list.add("Вячеслав Пупенков");
        list.add("Ирина Аленина");
        list.add("Арман Мамян");
        list.add("Борис Мишарин");
        list.add("Виталий");
        list.add("Антон Скоромыслов");

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