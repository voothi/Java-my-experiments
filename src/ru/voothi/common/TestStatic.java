package ru.voothi.common;

import ru.voothi.common.javaops.TestString;

public class TestStatic {
    private static final int TEST = 0;
    private int TEST1 = 0;

    public static void main(TestString[] args) {
        int test = TEST;
//        int test1 = TEST1;
    }

    private void method() {
        int test = TEST;
        int test1 = TEST1;
    }
}
