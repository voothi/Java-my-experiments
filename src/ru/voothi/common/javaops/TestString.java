package ru.voothi.common.javaops;

public class TestString {
    public static void main(String[] args) {
        String[] arrStr = {"1", "2", "3"};
        String result = "";
        for (String str : arrStr) {
            result += str + ", ";
        }
        System.out.println(result);
    }
}
