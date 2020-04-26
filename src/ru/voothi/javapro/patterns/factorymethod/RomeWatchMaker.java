package ru.voothi.javapro.patterns.factorymethod;

class RomeWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}