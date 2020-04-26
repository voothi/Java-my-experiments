package ru.voothi.javapro.patterns.factorymethod;

class RomeWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}
