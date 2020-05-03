package ru.voothi.common;

import ru.voothi.common.javaops.TestString;

import java.util.Arrays;

public class ArrayStorage {
    static int[] arr;
    static int length;

    public static void main(TestString[] args) {
        runTest();
    }

    static void runTest() {
        fill(init(1, 2, 3, 4, 5));
        print(arr);
        delete(1);
        print(arr);
        clear(arr);
        print(arr);
    }

    static int[] init(int... vars) {
        return vars;
    }

    static void fill(int[] arr) {
        ArrayStorage.arr = arr;
        length = arr.length;
    }

    static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void delete(int index) {
        System.arraycopy(arr, index + 1, arr, index, length - (index + 1));
        arr[length - 1] = 0;
    }

    static void clear(int[] arr) {
        Arrays.fill(arr, 0);
    }
}

