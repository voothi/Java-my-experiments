package ru.voothi.common;

import java.util.Arrays;

public class ArrayStorage {
    static int length;
    static int[] arr;

    static int[] initArr(int... vars) {
        return vars;
    }

    public static void main(String[] args) {
        run();
    }

    static void run() {
        fillVal(initArr(1, 2, 3, 0));
        printArr(arr);
        delete(1);
        printArr(arr);
    }

    static void delete(int index) {
        if (index == 0) {
            System.arraycopy(arr, index + 1, arr, index, length - 1);
        } else if (index > 0) {
            System.arraycopy(arr, index + 1, arr, index, length - (index + 1));
        }
    }

    static void fillVal(int[] arr) {
        ArrayStorage.arr = arr;
        length = arr.length;
    }

    static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

