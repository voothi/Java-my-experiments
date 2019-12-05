package ru.voothi.common;

public class Main {
    public static void main(String[] args) {
        String s1 = "str1";
        String s2 = "str1"; //true
        String s2 = "str2"; //false
        if (s1 == s2) {
            System.out.println("true");
        }
    }
}
