package ru.voothi.common;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] arr = {1, 2 , 3};

        Arrays.fill(arr,null);
        System.out.println(Arrays.toString(arr));
    }
}
