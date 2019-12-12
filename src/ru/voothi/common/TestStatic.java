package ru.voothi.common;

public class TestStatic {
    private static final int TEST = 0;
    private int TEST1 = 0;

    public static void main(String[] args) {
        int test = TEST;
//        int test1 = TEST1;
    }

    private void method() {
        int test = TEST;
        int test1 = TEST1;
    }
}
