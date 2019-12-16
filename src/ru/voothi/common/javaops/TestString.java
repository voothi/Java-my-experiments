package ru.voothi.common.javaops;

public class TestString {
    public static void main(String[] args) {
        String[] arrStr = {"1", "2", "3"};
        StringBuilder sb = new StringBuilder();
        for (String str : arrStr) {
            sb.append(str ).append(", ");
        }
        System.out.println(sb.toString());
    }
}
