package ru.voothi.epam.patterns.factorymethod;

import java.util.Date;

class DigitalWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
