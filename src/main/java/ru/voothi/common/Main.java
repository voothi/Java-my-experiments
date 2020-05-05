package ru.voothi.common;

class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.iValue = 20;
        hello.changeIt(hello);
        System.out.println(hello.iValue);
    }
}

class Hello {
    public int iValue;
    public void changeIt(Hello value) {
        value.iValue = 10;
    }
}