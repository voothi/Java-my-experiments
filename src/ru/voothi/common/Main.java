package ru.voothi.common;

import ru.voothi.common.javaops.TestString;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4};
        int n = 4;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        int a = arr[0];
        int b = arr[arr.length - 1];
        int rand = (int) ((Math.random() * (b - a + 1) + a));
        System.out.println(rand);
    }
}