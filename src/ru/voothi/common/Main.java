package ru.voothi.common;

import ru.voothi.common.javaops.TestString;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4};
//        int n = 4;
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = i + 1;
//        }
        String names[] = new String[4];
        names[0] = "Алена";
        names[1] = "Ирина";
        names[2] = "Вася";
        names[3] = "Алина";

        int rand = (int) (Math.random()*4);

        System.out.println(rand);
        System.out.println(names[rand]);
    }
}