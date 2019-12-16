package ru.voothi.common;

import ru.voothi.common.javaops.TestString;

import java.util.Arrays;
import java.util.Scanner;

class ElemRemoval {
    public static void main(TestString[] args) {
        Scanner in = new Scanner(System.in);
        int[] intArr = {1, 2, 5, 12, 7, 3, 8};

        System.out.print("Enter Element to be deleted : ");
        int elem = in.nextInt();
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == elem) {
                removeElement(intArr, i);
                break;
            }
        }
    }

    public static void removeElement(int[] arr, int index) {
        // Destination array
        int[] arrOut = new int[arr.length - 1];
        int remainingElements = arr.length - (index + 1);
        // copying elements that come before the index that has to be removed
        System.arraycopy(arr, 0, arrOut, 0, index);
        // copying elements that come after the index that has to be removed
        System.arraycopy(arr, index + 1, arrOut, index, remainingElements);
        System.out.println("Elements -- " + Arrays.toString(arrOut));
    }
}
